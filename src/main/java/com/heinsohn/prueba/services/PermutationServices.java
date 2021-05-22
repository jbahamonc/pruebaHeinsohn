package com.heinsohn.prueba.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.heinsohn.prueba.model.Permutation;
import com.heinsohn.prueba.repository.PermutationRepository;

@Service
public class PermutationServices implements PermutationRepository {

	@Override
	public ArrayList<Integer> getPermutation(Permutation permutation) {
		int i;
		int j; 
		int ant; 
		int sig; 
		int tam;
		ArrayList<Integer> vectAux = new ArrayList<>();
		tam = permutation.getValues().size() - 1;

		for(i = 0; i < permutation.getCantPermutation(); i++) {
			if(i != 0) {
				permutation.setValues(vectAux);
				vectAux = new ArrayList<>();
			}
			
			for(j = 0; j <= tam; j++) {
				if(j == 0){
					ant = 0;
				}else{
					ant = permutation.getValues().get(j-1);
				}
				if(j == tam) {
					sig = 0;
				}else{
					sig = permutation.getValues().get(j+1);
				}
				if(ant == sig){
					vectAux.add(0);
				}else{
					vectAux.add(1);
				}
			}
		}
		return vectAux;
	}

}
