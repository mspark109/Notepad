package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex13_Map_in_List_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map <String, Object> map = new HashMap<String, Object>();
			ArrayList arr = new ArrayList();
			
			arr.add(0, "111");
			arr.add(1, "222");
			arr.add(2, "333");
			
			map.put("list", arr);
			map.put("str", "스트링");
			
			// cast필수
			ArrayList arr2 = (ArrayList) map.get("list");
			
			for(int i=0; i<arr2.size(); i++) {
				System.out.println(arr2.toString());
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println(map.get("str").toString());
	}

}
