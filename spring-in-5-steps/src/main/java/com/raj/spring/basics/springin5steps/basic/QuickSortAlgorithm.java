package com.raj.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service	
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] sort) {
		//Logic for QuickSortAlgorithm	
		return sort;
	}
}
