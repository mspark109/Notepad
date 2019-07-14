package main;

import java.util.*;
import java.util.Collections;

public class Ex16_ArrayList {
	public static void main(String[] args){
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		int[] answer = solution(array, commands);
		
		System.out.println(answer[1]);
		
		
	}
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> temp = null;
        int tempInt = 0;
        int count = 0;
        /*
        1.  commands에서 요소 하나씩 뺀다. 
        2. 1. 에서 뺸 요소를 가지고 array의 배열을 자른다. 
        3. 자른 배열에서 위치값을 빼네 return 에 넣는다. 
        */
        
        for(int i=0; i<commands.length; i++){
            temp = new ArrayList<Integer>();
            for(int j=1; j<=array.length; j++){
                if(j == commands[i][0]){
                	count = commands[i][1];
                	for(int k=0; k <count; k++) {
                		temp.add(array[j-1+k]);
                	}
                }
            }
            Collections.sort(temp);
            answer[i] = temp.get(commands[i][2]-1);
        }
        return answer;
    }
}