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

`/file` 目录里面 放到tomcat容器下运行

配置: vi webapps/ROOT/WEB-INF/dubbo.properties

访问: (用户:root,密码:root 或 用户:guest,密码:guest)

## redis
* `redis-demo` 添加redis+jedis+spring的demo

