package com.baiwang.einvoice.controller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.*;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by guimu on 2018/2/25 上午1:18
 */
public class MyTest001 {
    public static Map<String,String> cookieMap = new HashMap<String, String>(64);
    @Test
    public void te() throws  Exception{
        String loginUrl="http://60.219.165.24/loginAction.do";
        String cookie=getCookieByUser(loginUrl,"2014025735","1");
        String schoolRollUrl="http://60.219.165.24/xjInfoAction.do?oper=xjxx";
        String studentInfoUrl="http://60.219.165.24/userInfo.jsp";

        HttpClient httpClient=new HttpClient();
        GetMethod get=new GetMethod(schoolRollUrl);
        get.setRequestHeader("Cookie",cookie);
        get.setRequestHeader("Content-Type","text/html; charset=GBK");
        httpClient.executeMethod(get);
        String indexContent=get.getResponseBodyAsString();
        Document doc = Jsoup.parse(indexContent);
        Elements elements=doc.select(".fieldName,[width='275']");
        for(int i=0;i<elements.size()-1;i++){
            System.out.print(elements.get(i).text());
            i++;
            System.out.println(elements.get(i).text());
        }
    }
    public static void printResponse(HttpResponse httpResponse)
            throws ParseException, IOException {
        // 获取响应消息实体
        HttpEntity entity = httpResponse.getEntity();
        // 响应状态
        System.out.println("status:" + httpResponse.getStatusLine());
        System.out.println("headers:");
        HeaderIterator iterator = httpResponse.headerIterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
        // 判断响应实体是否为空
        if (entity != null) {
            String responseString = EntityUtils.toString(entity);
            System.out.println("response length:" + responseString.length());
            String tem=responseString.replace("\r\n", "");
            tem=tem.replaceAll(">([ ]*)<",">\n$1<");
            System.out.println("response content:\n"
                    +tem );
        }
    }
    public static String setCookie(HttpResponse httpResponse)
    {
        Header headers[] = httpResponse.getHeaders("Set-Cookie");
        if (headers == null || headers.length==0)
        {
            return null;
        }
        String cookie = "";
        for (int i = 0; i < headers.length; i++) {
            cookie += headers[i].getValue();
            if(i != headers.length-1)
            {
                cookie += ";";
            }
        }

        String cookies[] = cookie.split(";");
        for (String c : cookies)
        {
            c = c.trim();
            if(cookieMap.containsKey(c.split("=")[0]))
            {
                cookieMap.remove(c.split("=")[0]);
            }
            cookieMap.put(c.split("=")[0], c.split("=").length == 1 ? "":(c.split("=").length ==2?c.split("=")[1]:c.split("=",2)[1]));
        }
        String cookiesTmp = "";
        for (String key :cookieMap.keySet())
        {
            cookiesTmp +=key+"="+cookieMap.get(key)+";";
        }

        return cookiesTmp.substring(0,cookiesTmp.length()-2);
    }

    public static  String getCookieByUser(String loginUrl,String username,String password) throws  Exception{
        HttpClient h=new HttpClient();
        HttpPost post=new HttpPost(loginUrl);
        List<NameValuePair> nav=new ArrayList<>();
        nav.add(new BasicNameValuePair("zjh",username));
        nav.add(new BasicNameValuePair("mm",password));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nav, "UTF-8");
        post.setEntity(entity);
        RequestConfig requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD_STRICT).build();
        CloseableHttpClient h1 = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
        HttpResponse httpResponse = h1.execute(post);
        String c=setCookie(httpResponse);
        c=c.substring(0,c.indexOf(";"));
       // printResponse(httpResponse);
        return  c;
    }
}
