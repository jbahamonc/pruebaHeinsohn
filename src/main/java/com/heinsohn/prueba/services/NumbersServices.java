package com.heinsohn.prueba.services;

import org.springframework.stereotype.Service;

import com.heinsohn.prueba.model.Numbers;
import com.heinsohn.prueba.repository.NumbersRepository;

@Service
public class NumbersServices implements NumbersRepository {

	@Override
	public int getHigherNumber(Numbers numbers) {
		if(numbers.getNumero1() > numbers.getNumero2()) {
			if (numbers.getNumero1() > numbers.getNumero3()) {
                return numbers.getNumero1();                                             
            } else {
                return numbers.getNumero3();
            }
		
		} else if (numbers.getNumero2() > numbers.getNumero3()) {
	        return numbers.getNumero2();
	    } else {
	       return numbers.getNumero3();
	    }
	}

}
