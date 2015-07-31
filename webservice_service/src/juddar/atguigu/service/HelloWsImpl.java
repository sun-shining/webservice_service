package juddar.atguigu.service;

import javax.jws.WebService;

/**
 * SEI 的实现
 * @author Administrator
 *
 */
@WebService
public class HelloWsImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		System.out.println("server start..."+ name);
		return "Hello "+name;
	}

}
