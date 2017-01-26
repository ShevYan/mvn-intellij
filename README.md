# This is a tour for maven+java+intellij

## 1 install jdk
各个系统不同,能用安装包的就不手动安装,手动安装步骤如下:
* 下载jdk
* 添加JAVA_HOME环境变量

## 2 install maven
* maven - java的包管理工具,没必要系统的学习,常用的就几个命令,如:"mvn clean install", "mvn package".
* 安装 - 能用包安装不用二进制,二进制就是下载后然后加环境变量

## 3 intellij建maven工程

* New->Project->Maven->create from archetype->quickstart
* 修改archetype的配置
```
	<groupId>cn.ghostcloud</groupId>
	<artifactId>helloworld</artifactId>
	<version>1.0-SNAPSHOT</version>
```
* 修改POM.xml
* 修改java类,增加log4j

## 4 运行
* 打包
```
	mvn package
```

* 运行
```
	java -cp target/helloworld-1.0-SNAPSHOT.jar cn.ghostcloud.App
```

## 导入工程
* 取代码
* File->New->Project from existing sources...->选择代码路径->选择Maven插件

