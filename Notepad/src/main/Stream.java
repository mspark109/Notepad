package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main (String[] args) {
		List<String> langs = Arrays.asList("Java", "Scala", "React", "Swift", "Angular");
		
		langs = langs.stream().sorted().collect(Collectors.toList());
		
		langs.stream().forEach(System.out::println);

		langs = langs.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		langs.stream().forEach(System.out::println);
		
//		mans = mans.stream().filter( name -> name.contains("z")).collect(Collectors.toList());
		
//		System.out.println(langs.toString());
		
		
	}
}
