package com.bridgeLabz.StreamsApi;

import java.util.ArrayList;
import java.util.List;

public class MyStreams {

	
	public static void main(String args[]) {

		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(6);
		myList.add(8);

		// iterate to show each element of stream
		myList.stream().forEach(n -> System.out.println(n));
	}
}
