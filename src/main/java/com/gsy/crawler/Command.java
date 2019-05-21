package com.gsy.crawler;

import com.gsy.crawler.crawler.CreateHeaderMap;
import com.gsy.crawler.crawler.WebCrawlerUtil;
import com.gsy.crawler.crawler.WeiboCrawlerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created By Gsy on 2019/5/21
 */
@Component
public class Command implements CommandLineRunner {
    @Autowired
    WeiboCrawlerService weiboCrawlerService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("请输入start or restart：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        doit(s);
    }
    public void doit(String s){
        s = StringUtils.lowerCase(s);
        switch (s){
            case "start":{
                weiboCrawlerService.startNew();
                break;
            }
            case "restart":{
                weiboCrawlerService.reStart();
                break;
            }
            default:
                System.out.println("请输入 start 或 restart 决定你要如何爬取");
        }
    }

}
