package consec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class consecutiveTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//create an array to store user values
		int myArray[] = new int[10];
		
		
		System.out.println("Enter 10 numbers");
		
		//create loop to populate array
		for(int i = 0; i < myArray.length; i++){
			
			myArray[i] = scanner.nextInt();
		
		}
		
		String returnedArray = findConsecutiveRuns(myArray);
		
		System.out.println(returnedArray);
	}
	
	
	public static String findConsecutiveRuns(int[] array){
		
		
		//create a list to store new array values for easier manipulation
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//use a loop to find consecutive nums and add start to list
		for(int i = 0; i < array.length; i++){
			

				
				list.add(array[i]);
		}
			
			//create a new array to return values back to calling method
			int[] newArr = new int[list.size()];
			
			for(int j = 0; j < list.size(); j++){
				
				newArr[j] = list.get(j);
			}
			
			for(int i : newArr){
				
				System.out.println(i);
			}
			
		
		
		
		return Arrays.toString(newArr);
	}

}
