package com.gsy.crawler.crawler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created By Gsy on 2019/5/21
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeiboCrawlerServiceImplTest {
    @Autowired
    WeiboCrawlerService weiboCrawlerService;
    @Test
    public void startNew() {
        weiboCrawlerService.startNew();
    }

    @Test
    public void reStart() {
        try {
            String html = WebCrawlerUtil.getWebHtml("https://weibo.cn/u/6697930990?filter=2&page=2", CreateHeaderMap.getMapByName("crawler/page"),"utf-8");
            System.out.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}