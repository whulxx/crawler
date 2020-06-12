package com.lxx.qidian;

import com.lxx.qidian.thread.HttpThread;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){
        String url = "https://www.qidian.com/all?chanId=21&subCateId=78";
        ExecutorService executorService = Executors.newCachedThreadPool();
        HttpThread httpThread = new HttpThread(url);
        HttpThread httpThread1 = new HttpThread("https://www.baidu.com/");
        executorService.submit(httpThread);
        executorService.submit(httpThread1);
        executorService.shutdown();
    }
}
