package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Q3_Generic {

	
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key", 1);
		
		list1.add("str1");
		list1.add("str2");
		list1.add(Integer.parseInt("3"));
		list1.add(map);
		
		System.out.println(list1.toString());
		System.out.println("----------");

		list2.add("str1");
		list2.add("str2");
		
		System.out.println(list2.toString());
		System.out.println("----------");
		list2.add("str1");
		list2.add("str2");
		
		System.out.println(list2.toString());
		
	}
	
//    public static String solution(int[] numbers) {
//        String answer = "";
//
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < numbers.length; i++) {
//            list.add(numbers[i]);
//        }
//        
//        
//        Collections.sort(list, (a, b) -> {
//            String as = String.valueOf(a), bs = String.valueOf(b);
//            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
//        });
//        
//        
//        StringBuilder sb = new StringBuilder();
//        for(Integer i : list) {
//            sb.append(i);
//        }
//        answer = sb.toString();
//        if(answer.charAt(0) == '0') {
//            return "0";
//        }else {
//            return answer;
//        }
//    }

}
