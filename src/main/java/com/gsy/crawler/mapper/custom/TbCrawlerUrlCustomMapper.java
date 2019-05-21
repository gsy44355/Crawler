package com.gsy.crawler.mapper.custom;

import com.gsy.crawler.pojo.TbCrawlerUrl;

/**
 * Created By Gsy on 2019/5/18
 */
public interface TbCrawlerUrlCustomMapper {
    TbCrawlerUrl getOneUrl(String type);
    int deleteAll();
    int resetAll();
}
