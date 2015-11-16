package com.tobby.designpattern.proxy.client;

import java.rmi.Naming;

import com.tobby.designpattern.proxy.remote.MyRemote;

public class MyRemoteClient {

	public static void main(String[] args) {
		MyRemoteClient client = new MyRemoteClient();
		client.go();
	}
	
	public void go() {
		try {
			MyRemote myRemote = (MyRemote)Naming.lookup("rmi://localhost/RemoteHello");
			String s = myRemote.sayHello();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
