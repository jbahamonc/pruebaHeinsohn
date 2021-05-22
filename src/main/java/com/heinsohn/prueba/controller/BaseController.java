package com.heinsohn.prueba.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heinsohn.prueba.model.ArrayOddAndEven;
import com.heinsohn.prueba.model.Numbers;
import com.heinsohn.prueba.model.Permutation;
import com.heinsohn.prueba.repository.ExtractionRepository;
import com.heinsohn.prueba.repository.NumbersRepository;
import com.heinsohn.prueba.repository.OddAndEvenRepository;
import com.heinsohn.prueba.repository.PermutationRepository;

@RestController
@RequestMapping("/punto")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class BaseController {
	
	@Autowired
	NumbersRepository numberRepo;
	@Autowired
	ExtractionRepository extRepo;
	@Autowired
	PermutationRepository permutationRepo;
	@Autowired
	OddAndEvenRepository oddAndEvenRepo;
	
	@GetMapping(value="/1", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Integer> getPermutation(@RequestBody Permutation permutation) {
		System.out.print(permutation.toString());
		return permutationRepo.getPermutation(permutation);
	}

	@GetMapping(value="/2", produces = MediaType.APPLICATION_JSON_VALUE)
	public int getHigherNumber(@RequestBody Numbers numbers) {
		System.out.print(numbers.toString());
		return numberRepo.getHigherNumber(numbers);
	}
	
	@GetMapping(value="/3", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Integer> getHigherNumber(@RequestBody ArrayOddAndEven list) {
		System.out.print(list.toString());
		return oddAndEvenRepo.getOrderArrayOddAndEven(list);
	}
	
	@GetMapping(value="/4", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean getHigherNumber(@RequestParam(name="nombreEmpresa", required=true, defaultValue="World") String nombreEmpresa) {
		System.out.println(nombreEmpresa);
		return extRepo.extracString(nombreEmpresa);
	}
}
