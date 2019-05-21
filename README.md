#  Java 微博相册爬虫
+  使用MySQL数据库，Java版本11
+  支持随时停止，断点重传
+  支持自行扩展
--------------------------------------
##   使用方式
+  下载工程
+  MySQL运行SQL文件夹下sql文件
+  修改application-DataSource.properties文件中MySQL连接串
+  示例代码是可以直接运行，对微博某个博主进行相册进行爬取
+  需要修改resources/crawler目录下的properties文件
分别是访问页面所需要的headers
+  如果需要扩展，可以参考WeiboCrawlerServiceImpl
+  启动CrawlerApplication，输入命令即可运行
    