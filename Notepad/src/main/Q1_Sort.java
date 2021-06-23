package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1_Sort {
 /* 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
	
	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	
	제한 사항
	numbers의 길이는 1 이상 100,000 이하입니다.
	numbers의 원소는 0 이상 1,000 이하입니다.
	정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.*/
	
	public static void main(String[] args) {
//		int[] arr = {34,876,9};
//		solution(arr);
		
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		map.put(4, 2);
		map.put(1, 3);
		map.put(5, 3);
		map.put(2, 3);
		
		int maxValue = Collections.max(map.values());
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==maxValue) {
				System.out.println(m.getKey());
			}
		}

	}
	
    public static String solution(int[] numbers) {
        String answer = "";

        // int형 배열을 Integer형 배열로 변환 후 List로 변환
        List<Integer> list = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        
        Collections.sort(list, (a, b) -> {
            String as = Integer.toString(a), bs = Integer.toString(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        
        
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }

}
