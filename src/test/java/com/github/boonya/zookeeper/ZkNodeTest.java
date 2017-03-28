package com.github.boonya.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class ZkNodeTest {
	
	private static final int TIME_OUT = 3000;
	
	private static final String HOST = "192.168.234.128:2181";

	public static void main(String[] args) throws Exception {
		
		ZooKeeper zookeeper = new ZooKeeper(HOST, TIME_OUT, null);//不使用Watcher
		
		try {
			System.out.println("=========创建节点===========");
			
			if (zookeeper.exists("/test", false) == null) {
				zookeeper.create("/test", "znode1".getBytes(), Ids.OPEN_ACL_UNSAFE,	CreateMode.PERSISTENT);
			}
			
			System.out.println("=============查看节点是否安装成功===============");
			System.out.println(new String(zookeeper.getData("/test", false, null)));

			
			System.out.println("=========修改节点的数据==========");
			String data = "zNode2";
			zookeeper.setData("/test", data.getBytes(), -1);//-1忽略版本号

			System.out.println("========查看修改的节点是否成功=========");
			System.out.println(new String(zookeeper.getData("/test", false, null)));

			System.out.println("=======删除节点==========");
			zookeeper.delete("/test", -1);//-1忽略版本号

			System.out.println("==========查看节点是否被删除============");
			System.out.println("节点状态：" + zookeeper.exists("/test", false));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			zookeeper.close();
		}
		
	}

}
