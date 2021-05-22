package com.heinsohn.prueba.repository;

import java.util.ArrayList;

import com.heinsohn.prueba.model.Permutation;

public interface PermutationRepository {

	public ArrayList<Integer> getPermutation(Permutation permutation);
}
