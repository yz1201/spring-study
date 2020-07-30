package cn.dbdj1201.study.config;

import cn.dbdj1201.study.entity.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yz1201
 * @date 2020-07-30 8:42
 **/
@Configuration
@ComponentScan("cn.dbdj1201.study")
public class TestConfig {

	@Bean
	public Hello hello() {
		return new Hello();
	}
}
