package br.com.codenation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StatisticUtil {

	public static int average(int[] elements) {
		int sum = 0;
		for (int i = 0; i < elements.length; i++)
			sum += elements[i];
		return sum/elements.length;
	}

	public static int mode(int[] elements) {
		List<Integer> elementsList = new ArrayList<Integer>(elements.length);
		for (int i : elements)
			elementsList.add(Integer.valueOf(i));
		HashSet<Integer> elementsSet = new HashSet<Integer>(elementsList);
		int maiorFrequencia = 0;
		Integer mode = null;
		for (Integer i : elementsSet) {
			if (Collections.frequency(elementsList, i) > maiorFrequencia){
				maiorFrequencia = Collections.frequency(elementsList, i);
				mode = i;
			}
		}
		return (int) mode;
	}

	public static int median(int[] elements) {
		int median = 0;
		Arrays.sort(elements);
		if (elements.length % 2 == 1)
			median = elements[elements.length / 2];
		else
			median = (((elements[elements.length / 2]) -1) + (elements[elements.length / 2])) / 2;
		return median;
	}
}