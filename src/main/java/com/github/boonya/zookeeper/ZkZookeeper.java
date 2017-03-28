package com.github.boonya.zookeeper;

import java.io.IOException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

/**
 * Zookeeper构造参数类
 * 
 * @package com.github.boonya.zookeeper.ZkZookeeper
 * @date 2017年3月28日 上午10:48:24
 * @author pengjunlin
 * @comment
 * @update
 */
public class ZkZookeeper extends ZooKeeper {

	/**
	 * 
	 * @param connectString
	 *            ip:port
	 * @param sessionTimeout
	 * @param watcher
	 * @param sessionId
	 * @param sessionPasswd
	 * @param canBeReadOnly
	 * @throws IOException
	 */
	public ZkZookeeper(String connectString, int sessionTimeout,
			Watcher watcher, long sessionId, byte[] sessionPasswd,
			boolean canBeReadOnly) throws IOException {
		super(connectString, sessionTimeout, watcher, sessionId, sessionPasswd,
				canBeReadOnly);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param connectString
	 *            ip:port
	 * @param sessionTimeout
	 * @param watcher
	 * @param sessionId
	 * @param sessionPasswd
	 * @throws IOException
	 */
	public ZkZookeeper(String connectString, int sessionTimeout,
			Watcher watcher, long sessionId, byte[] sessionPasswd)
			throws IOException {
		super(connectString, sessionTimeout, watcher, sessionId, sessionPasswd);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param connectString
	 *            ip:port
	 * @param sessionTimeout
	 * @param watcher
	 * @param canBeReadOnly
	 * @throws IOException
	 */
	public ZkZookeeper(String connectString, int sessionTimeout,
			Watcher watcher, boolean canBeReadOnly) throws IOException {
		super(connectString, sessionTimeout, watcher, canBeReadOnly);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param connectString
	 *            ip:port
	 * @param sessionTimeout
	 * @param watcher
	 * @throws IOException
	 */
	public ZkZookeeper(String connectString, int sessionTimeout, Watcher watcher)
			throws IOException {
		super(connectString, sessionTimeout, watcher);
		// TODO Auto-generated constructor stub
	}

}
