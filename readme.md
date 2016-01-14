## 结构

* `api` 接口和实体 被服务和调用双方引用
* `order` 服务提供者项目
* `web` 消费者项目

##开始运行

1. 配置zookeeper 和 dubbo-admin
2. 运行 OrderServiceClient.main提供服务
3. 运行 WebClient.main 消费服务

## zookeeper

下载地址

[http://mirrors.hust.edu.cn/apache/zookeeper/](http://mirrors.hust.edu.cn/apache/zookeeper/)

配置文件

conf/zoo.cfg

## dubbo-admin

/file 目录里面 放到tomcat下运行