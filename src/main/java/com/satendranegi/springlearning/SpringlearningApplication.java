package com.satendranegi.springlearning;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringlearningApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		//Spring application context

		ApplicationContext applicationContext = SpringApplication.run(SpringlearningApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int results = binarySearch.binarySearch(new int[] {12,4,5}, 3);
		System.out.println(results);
	}

}
