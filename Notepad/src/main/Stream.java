package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

	public static void main (String[] args) {
		String[] langsArr = {"Java", "Scala", "React", "Swift", "Angular"};
		List<String> langs = Arrays.asList(langsArr);
//		List<String> langs = Arrays.asList("Java", "Scala", "React", "Swift", "Angular");
		
		// forEach() 순차 접근
		langs.stream().forEach(System.out::println);
		
		// sorted() 정렬
		langs = langs.stream().sorted().collect(Collectors.toList());
		
		// sorted(Comparator.reverseOrder()) 역순 정렬
		langs = langs.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		// filter( input Param -> method ) 필터
		langs = langs.stream().filter( name -> name.contains("a")).collect(Collectors.toList());
		
		
		
		List<People> peoples = People.getPeopleList();
		/* peoples
		 * People[name:홍길동, age:17, gender:1]
		   People[name:홍길자, age:18, gender:2]
	 	   People[name:홍길남, age:13, gender:1]
		   People[name:홍길순, age:15, gender:2] */
		
		
		// 조건이 모두 match 하는지 (return : boolean으로 anyMatch, noneMatch도 있음.)
		peoples.stream().allMatch( person -> person.getName().contains("홍"));

		// 특정 속성 값에 대해 최대값을 가지는 요소 구하기.
		Optional<People> maxPeople = peoples.stream().max(Comparator.comparing(People::getAge));
		if(maxPeople.isPresent()) {
			System.out.println("나이가 많은 사람은?");
			System.out.println(maxPeople.toString()); // Optional[People[name:홍길자, age:18, gender:2]]
		}
		
		// 그룹핑
		Map<Integer, List<People>> groupByGender = People.getPeopleList().stream().collect(Collectors.groupingBy(People::getGender));
		System.out.println("남/여 목록");
		groupByGender.forEach((gender, peopleList) -> {
			System.out.println(gender);
			peopleList.forEach(System.out::println);
		});
	}
}
