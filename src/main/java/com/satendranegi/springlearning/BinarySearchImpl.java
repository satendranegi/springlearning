package com.satendranegi.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm algorithm;
	
	
	public BinarySearchImpl(SortAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}


	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
		//BubleSortAlgorithm bubleSortAlgorithm = new BubleSortAlgorithm();
		int[] sortedNumbers = algorithm.Sort(numbers);
		System.out.println(algorithm);
		
		return 3;
	}

}
