package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import app.core.tests.Test;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class CouponSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CouponSystemApplication.class, args);
		Test test = ctx.getBean(Test.class);
		test.testAll();
	}
}
