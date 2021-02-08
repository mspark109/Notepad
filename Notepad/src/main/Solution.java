package main;
import java.util.Arrays;

public class Solution {
	
	public static  String solution(int U, int L, int[] C) {
        // write your code in Java SE 8
		int arrSize = C.length;
        int[] s1 = new int[arrSize];
        int[] s2 = new int[arrSize];
        int uSum = 0, lSum = 0;

        //s1 get
        for(int i=0; i<C.length; i++){
            if(C[i] > 1){
                s1[i] = 1;
                C[i] = 1;
                uSum++;
            }else if(C[i] == 1){
                s1[i] = 1;
                C[i] = 0;
                uSum++;
            }else{
                s1[i] = 0;
            }
            
            if(uSum == U) break;
        }
        
        //s2 get
        for(int i=0; i<C.length; i++){
            s2[i] = C[i];
        }
           
        for(int lNum : s2){
            lSum+=lNum;
        }
        if(lSum != L){
            return "IMPOSSIBLE";
        }
        
        return Arrays.toString(s1).replaceAll("[^0-9]","")+", "+Arrays.toString(s2).replaceAll("[^0-9]","");
        
    }
	public static void main(String[] args) {
		int[] arr= {2, 1, 1, 0, 1};
		
		System.out.println(solution(3, 2, arr));
	}
}
//
//package main;
//import java.util.*;
//import java.util.HashMap;
//
//public class Solution {
//	
//	public static String solution(String S) {
//        // write your code in Java SE 8
//		String resuilt = "";
//        String[] fileArr = S.split("\\\n");
//        String fileExtension = "";
//        int fileSize = 0;
//        
//        
//        HashMap<String, Integer> fileMap = new HashMap<String, Integer>();
//        fileMap.put("music", 0);
//        fileMap.put("images", 0);
//        fileMap.put("movies", 0);
//        fileMap.put("other", 0);
//        
//        for(String fileInfo : fileArr){
//            String[] tempA =  fileInfo.split(" ");
//            fileExtension = tempA[0].substring(tempA[0].lastIndexOf('.')+1);
//            fileSize = Integer.parseInt(tempA[1].substring(0, tempA[1].lastIndexOf('b')));
//            if("mp3".equals(fileExtension) ||
//               "aac".equals(fileExtension) ||
//               "flac".equals(fileExtension)) {
//               fileMap.put("music", fileMap.get("music")+fileSize);
//            } else if("jpg".equals(fileExtension) ||
//               "bmp".equals(fileExtension) ||
//               "gif".equals(fileExtension)) {
//               fileMap.put("images", fileMap.get("images")+fileSize);
//            } else if("mp4".equals(fileExtension) ||
//               "avi".equals(fileExtension) ||
//               "mkv".equals(fileExtension)) {
//               fileMap.put("movies", fileMap.get("movies")+fileSize);
//            } else {
//                fileMap.put("other", fileMap.get("other")+fileSize);
//            }
//        }
//        resuilt = "music "+ fileMap.get("music")+"b\n"
//                + "images "+ fileMap.get("images")+"b\n"
//                + "movies "+ fileMap.get("movies")+"b\n"
//                + "other "+ fileMap.get("other")+"b";
//        
//        return resuilt;
//    }
//	public static void main(String[] args) {
//		System.out.println(solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"));
//	}
//}

