package TemaCurs15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GenericSort {

	public static void sortArrays(List<String> list) {		
			Collections.sort(list);
		}
		
	
	public static void main (String[] args) {
		//array-urile de sortat
		
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};				
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c'};
		
	
	//sortare array-uri
	List<String> strings = Arrays.asList(intArray).stream().map(Object::toString)
	            .collect(Collectors.toList());
	sortArrays(strings);
	sortArrays(Arrays.asList(textArray));
	List<String> strings1 = Arrays.asList(charArray).stream().map(Object::toString)
            .collect(Collectors.toList());
	sortArrays(strings1);
	
	
	//afisare array uri sortate
	System.out.println("String Array :  " + Arrays.toString(textArray));
	System.out.println("Integer Array : " + strings);
	System.out.println("Character Array :  " + strings1);
	
	
       }
	}
