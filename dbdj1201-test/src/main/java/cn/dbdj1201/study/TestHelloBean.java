package cn.dbdj1201.study;

import cn.dbdj1201.study.config.TestConfig;
import cn.dbdj1201.study.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author yz1201
 * @date 2020-07-30 8:47
 **/
public class TestHelloBean {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

//		ac.getBean("")

//		System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

		Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);

		Hello hello = (Hello) ac.getBean("hello");

		hello.hello();
	}
}
