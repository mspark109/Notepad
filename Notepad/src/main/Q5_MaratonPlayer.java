package main;

import java.util.HashMap;

public class Q5_MaratonPlayer {
 /* 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

입출력 예
participant									completion							return
[leo, kiki, eden]							[eden, kiki]						leo
[marina, josipa, nikola, vinko, filipa]		[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]				[stanko, ana, mislav]				mislav
*
*
*/
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(solution2(participant, completion));

	}
	
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String player : participant) map.put(player, map.getOrDefault(player, 0)+1);
        for(String winner : completion) map.put(winner, map.get(winner)-1);
            
        for( String key : map.keySet() ) {
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
           
        return answer;
    }
    
    public static String solution1(String[] participant, String[] completion) {
    	String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String winner : completion) {
            if(map.containsKey(winner)){
                map.put(winner, (Integer)map.get(winner)+1);
            }else {
                map.put(winner, 0);
            }
            
        }
        
        for(String player : participant) {
            if(map.containsKey(player)){
                if(map.get(player) == 0){
                    map.remove(player);
                }else{
                    map.put(player, (Integer)map.get(player)-1);
                }
            }else{
                answer = player;
            }
        }
        
        
        return answer;
    }

}
