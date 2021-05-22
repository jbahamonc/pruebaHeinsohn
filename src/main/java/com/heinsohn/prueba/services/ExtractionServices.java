package com.heinsohn.prueba.services;

import org.springframework.stereotype.Service;

import com.heinsohn.prueba.repository.ExtractionRepository;

@Service
public class ExtractionServices implements ExtractionRepository{

	@Override
	public boolean extracString(String cadena) {		
		String subCad = cadena.substring(4, 7);
		System.out.println(subCad);
		return subCad.equals("soh");
	}

}
