package com.heinsohn.prueba.services;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;

import com.heinsohn.prueba.model.ArrayOddAndEven;
import com.heinsohn.prueba.repository.OddAndEvenRepository;

@Service
public class OddAndEvenServices implements OddAndEvenRepository {

	@Override
	public ArrayList<Integer> getOrderArrayOddAndEven(ArrayOddAndEven oddAndEven) {
		
		ArrayList<Integer> arrOdd = new ArrayList<Integer>();
		ArrayList<Integer> arrEven = new ArrayList<Integer>();
		for (Integer num : oddAndEven.getValues()) {
			if(num % 2 == 0) {
				addOrderedArrayEven(arrEven, num);
			}
			else {
				addOrderedArrayOdd(arrOdd, num);
			}
		}
		arrEven.addAll(arrOdd);
		return arrEven;
	}
	
	private void addOrderedArrayEven(ArrayList<Integer> arrEven, int num) {
		arrEven.add(num);
		Collections.sort(arrEven);		
	}
	
	private void addOrderedArrayOdd(ArrayList<Integer> arrOdd, int num) {
		arrOdd.add(num);
		Collections.sort(arrOdd);		
	}

}
