package main;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = null;
		
		
		int[][] array1 = new int [2][3];
		
		/*
		 * array1
		 * [0] - {[],[],[]}
		 * [1] - {[],[],[]}
		 */
		
		int[][] array2 = new int[3][];
		array2[2] = new int[3];
		
		array2[2][2] = 10;
		/*
		 * array2
		 * [0] - {}
		 * [1] - {}
		 * [2] - {[],[],[10]}
		 */
		
		System.out.println(array2[2][2]);
	}

}
