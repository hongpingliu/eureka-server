package per.liuhp.micserver.test.resource;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.liuhp.micserver.test.bean.TestBean;

@RestController
@RequestMapping("/test")
public class TestResource {

	@RequestMapping("/get")
	public TestBean getTest() {
		
		TestBean test = new TestBean();
		test.setName("测试name 1");
		test.setAge(10);
		test.setUpdateDate(new Date());
		test.setDelete(false);

		return test;
	}
}
