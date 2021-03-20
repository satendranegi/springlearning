package com.satendranegi.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringlearningApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int results = binarySearchImpl.binarySearch(new int[] {12,4,5}, 3);
		System.out.println(results);
		
		//SpringApplication.run(SpringlearningApplication.class, args);
	}

}
