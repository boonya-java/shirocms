package com.github.boonya.zookeeper;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
/**
 * 测试Zookeeper基本连接
 * 
 * @package com.github.boonya.zookeeper.ZkWatcher
 * @date   2017年3月28日  上午9:22:16
 * @author pengjunlin
 * @comment   
 * @update
 */
public class ZkWatcher implements Watcher{

    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    
    /**
     * 处理同步连接
     */
    public void process(WatchedEvent event) {
        System.out.println("Receive watcher event:" + event);
        if(Event.KeeperState.SyncConnected == event.getState()){
            countDownLatch.countDown();
        }
    }
    
    /**
     * 主函数入口
     * 
     * @MethodName: main 
     * @Description: 
     * @param args
     * @throws IOException
     * @throws KeeperException
     * @throws InterruptedException
     * @throws
     */
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        Long startTime = new Date().getTime();
        ZooKeeper zooKeeper = new ZooKeeper("192.168.234.128:2181",5000,new ZkWatcher());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("创建连接花费时间：" + (new Date().getTime() - startTime) + "ms");
        System.out.println("连接状态：" + zooKeeper.getState());
        System.out.println("sessionId：" + zooKeeper.getSessionId());
        System.out.println("sessionPasswd：" + new String(zooKeeper.getSessionPasswd()));
        
        // 此时需要使用到zkCli.sh命令窗口  ，Zookeeper默认节点路径为/zookeeper
               //查看path: ls \
               //创建path数据情况: create /zookeeper '默认内容'
               //查看path数据情况: get /zookeeper
        //version以节点的dataVersion = 2一致才能成功，否则抛出 KeeperErrorCode = BadVersion for /zookeeper
        zooKeeper.setData("/zookeeper", "Hello world! Hello Zookeeper!".getBytes(), 2);
        
        byte [] data=zooKeeper.getData("/zookeeper", new ZkWatcher(), new Stat());
        
        System.out.println("/zookeeper data:"+new String(data));
        
    }

  /*  [zk: localhost:2181(CONNECTED) 4] get /zookeeper     
    Hello world!Hello Zookeeper!
    cZxid = 0x0
    ctime = Wed Dec 31 16:00:00 PST 1969
    mZxid = 0xc
    mtime = Mon Mar 27 18:41:45 PDT 2017
    pZxid = 0x0
    cversion = -1
    dataVersion = 1
    aclVersion = 0
    ephemeralOwner = 0x0
    dataLength = 28
    numChildren = 1
    [zk: localhost:2181(CONNECTED) 5] get /zookeeper
    Hello world! Hello Zookeeper!
    cZxid = 0x0
    ctime = Wed Dec 31 16:00:00 PST 1969
    mZxid = 0x15
    mtime = Mon Mar 27 18:44:50 PDT 2017
    pZxid = 0x0
    cversion = -1
    dataVersion = 2
    aclVersion = 0
    ephemeralOwner = 0x0
    dataLength = 29
    numChildren = 1*/

}
