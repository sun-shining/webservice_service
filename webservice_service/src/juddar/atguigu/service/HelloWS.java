package juddar.atguigu.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * 定义 SEI
 * @author Administrator
 *
 */
@WebService
public interface HelloWS {
	
	@WebMethod
	public String sayHello(String name);
}
