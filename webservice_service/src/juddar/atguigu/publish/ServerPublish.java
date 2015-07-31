package juddar.atguigu.publish;

import javax.xml.ws.Endpoint;

import juddar.atguigu.service.HelloWsImpl;

public class ServerPublish {
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		String address = "http://192.168.10.5:8989/juddar/sayHello";
		Endpoint.publish(address , new HelloWsImpl());
		
		System.out.println("Server 端发布完成...");
	}
}
