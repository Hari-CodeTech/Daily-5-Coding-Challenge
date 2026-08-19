package com.Demos;
//import java.util.stream.Stream;
import java.util.*;

public class Java8 {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Hari","Sam","Arhi","Harika");
		
		names.stream()
		.filter(name->name.startsWith("H"))
		.forEach(System.out::println);

	}

}
