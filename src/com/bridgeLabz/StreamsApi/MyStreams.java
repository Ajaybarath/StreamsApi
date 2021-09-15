package com.bridgeLabz.StreamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyStreams {

	
	public static void main(String args[]) {

		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(6);
		myList.add(8);

		// iterate to show each element of stream
		myList.stream().forEach(n -> System.out.println(n));
		
		Function <Integer, Double> toDoubleFunction =  Integer::doubleValue;
		myList.stream().forEach(n -> System.out.println(toDoubleFunction.apply(n)));

		
		List<Double> doubleList = myList.stream().map(toDoubleFunction).collect(Collectors.toList());
		System.out.println(doubleList);
		
		
		Predicate<Integer> isEvenFunction = n -> n%2 == 0;
		myList.stream().forEach(n -> System.out.println(isEvenFunction.test(n)));

		List<Integer> evenList = myList.stream().filter(isEvenFunction).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		Integer firstEven = myList.stream().filter(isEvenFunction).peek(n -> System.out.println(n))
				.findFirst()
				.orElse(null);
		
		System.out.println(firstEven);

		
		
		Integer min = myList.stream().filter(isEvenFunction).min((n1,n2) -> n1-n2).orElse(null);
		System.out.println("min even is " + min);
		
		Integer max = myList.stream().filter(isEvenFunction).min((n1,n2) -> n2-n1).orElse(null);
		System.out.println("max even is " + max);
		
		
	}
}
