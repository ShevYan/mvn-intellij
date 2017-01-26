package cn.ghostcloud.hadoop;

/**
 * Created by dongyan on 17/1/26.
 */

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.IOException;
import java.net.URI;

public class HdfsTest {

//    public static void main(String args[]) {
//
//        try {
//            UserGroupInformation ugi
//                    = UserGroupInformation.createRemoteUser("hbase");
//
//            ugi.doAs(new PrivilegedExceptionAction<Void>() {
//
//                public Void run() throws Exception {
//
//                    Configuration conf = new Configuration();
//                    conf.set("fs.defaultFS", "hdfs://1.2.3.4:8020/user/hbase");
//                    conf.set("hadoop.job.ugi", "hbase");
//
//                    FileSystem fs = FileSystem.get(conf);
//
//                    fs.createNewFile(new Path("/user/hbase/test"));
//
//                    FileStatus[] status = fs.listStatus(new Path("/user/hbase"));
//                    for(int i=0;i<status.length;i++){
//                        System.out.println(status[i].getPath());
//                    }
//                    return null;
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        //System.setProperty("hadoop.home.dir", "/Users/dongyan/Downloads/hadoop/hadoop-2.7.3/etc/hadoop");
        Configuration conf = new Configuration();
        //URI uri = URI.create("hdfs://localhost:9000/");
        conf.set("hadoop.home.dir", "/Users/dongyan/Downloads/hadoop/hadoop-2.7.3/etc/hadoop");
        conf.set("fs.defaultFS", "hdfs://localhost:9000");

        FileSystem fileSystem = FileSystem.get(conf);
        fileSystem.create(new Path("/abc"));
        fileSystem.mkdirs(new Path("/dir1"));
        RemoteIterator<LocatedFileStatus> fileIterator = fileSystem.listLocatedStatus(new Path("/"));
        while (fileIterator.hasNext()) {
            System.out.println("-----------:" + fileIterator.next().getPath());
        }
    }
}