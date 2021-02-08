package main;

import java.util.HashMap;

public class Q6_PhoneBook {
 /* 

*
*/
	
	public static void main(String[] args) {
		String[] phoneBook = {"119", "9767422", "119552442"};
		
		System.out.println(solution(phoneBook));

	}
	
    public static boolean solution(String[] phone_book) {
        
        HashMap<String, String> hm = new HashMap<String, String>();
        
        for(String phone : phone_book) {
            
            for(String key : hm.keySet()){
                if(key.startsWith(phone)) return false;
            }
            hm.put(phone, "1");
        }
        return true;
	}

}
