package com.crawler.example.dirver;

import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetJson {
    public JSONObject getHttpJson(String url,int comefrom){
        try {
            URL realUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection)realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            //请求成功
            if(connection.getResponseCode()==200){
                InputStream is=connection.getInputStream();
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                //10MB的缓存
                byte [] buffer=new byte[10485760];
                int len=0;
                while((len=is.read(buffer))!=-1){
                    baos.write(buffer, 0, len);
                }
                String jsonString=baos.toString();
                baos.close();
                is.close();
                //转换成json数据处理
                JSONObject jsonArray=getJsonString(jsonString,comefrom);
                return jsonArray;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        return null;
    }

    public JSONObject getHttpsJson(String url){
        try {
            URL realUrl = new URL(url);
            HttpsURLConnection httpsConn = (HttpsURLConnection)realUrl.openConnection();
            httpsConn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            httpsConn.setRequestProperty("connection", "Keep-Alive");
            httpsConn.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.62 Safari/537.36");
            httpsConn.setRequestProperty("Accept-Charset","utf-8");
            httpsConn.setRequestProperty("contentType", "utf-8");
            httpsConn.connect();
            if(httpsConn.getResponseCode()==200){
                InputStream is = httpsConn.getInputStream();
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                //10MB的缓存
                byte [] buffer=new byte[10485760];
                int len=0;
                while((len=is.read(buffer))!=-1){
                    baos.write(buffer, 0, len);
                }
                String jsonString=baos.toString("utf-8");
                baos.close();
                is.close();
                return new JSONObject(jsonString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public JSONObject getJsonString(String str, int comefrom){
           JSONObject jo = null;
            if(comefrom==1){
                return new JSONObject(str);
            }else if(comefrom==2){
                int indexStart = 0;
                //字符处理
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='('){
                        indexStart = i;
                        break;
                    }
                }
                String strNew = "";
                //分割字符串
                for(int i=indexStart+1;i<str.length()-1;i++){
                    strNew += str.charAt(i);
                }
                return new JSONObject(strNew);
            }
           return jo;
    }
}
