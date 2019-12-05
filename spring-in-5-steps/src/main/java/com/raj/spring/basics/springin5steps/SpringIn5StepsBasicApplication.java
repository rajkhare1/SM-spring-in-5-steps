package com.raj.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
			LOGGER.info("{}",binarySearchImpl);
			LOGGER.info("{}",binarySearchImpl1);
			int result = binarySearchImpl.BinarySearch(new int[] { 12, 4, 54 }, 3);
            LOGGER.info("result: "+result);
		}

	}
}