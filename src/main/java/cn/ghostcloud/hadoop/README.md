# hadoop + java

## install hadoop
* download binary : http://www.apache.org/dyn/closer.cgi/hadoop/common
* install single node version : http://hadoop.apache.org/docs/r2.7.3/hadoop-project-dist/hadoop-common/SingleCluster.html

## import hadoop hdfs jar
* search "hadoop" at https://mvnrepository.com, and go to https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-hdfs
* select the version accordingly and copy maven configuration into POM.xml
```
<dependency>
  <groupId>org.apache.hadoop</groupId>
  <artifactId>hadoop-common</artifactId>
  <version>${hadoop.version}</version>
</dependency>

<dependency>
  <groupId>org.apache.hadoop</groupId>
  <artifactId>hadoop-hdfs</artifactId>
  <version>2.7.3</version>
</dependency>
```