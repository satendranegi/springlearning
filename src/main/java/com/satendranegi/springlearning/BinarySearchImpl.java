package com.satendranegi.springlearning;

public class BinarySearchImpl {
	
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
