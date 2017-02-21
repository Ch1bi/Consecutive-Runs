package consec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConsecNums {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//create an array to store user values
		int myArray[] = new int[11];
		
		
		System.out.println("Enter 11 numbers");
		
		//create loop to populate array
		for(int i = 0; i < myArray.length; i++){
			
			myArray[i] = scanner.nextInt();
		
		}
		
		String returnedArray = findConsecutiveRuns(myArray);
		
		System.out.println(returnedArray);
	}
	
	
	public static String findConsecutiveRuns(int[] array){
		
	
		//create a list to store new array since am array can't increase size
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		//use a loop to find consecutive nums and add to list
		for(int i = 0; i < array.length-1; i++){
			
				
				//if array position +1 equals current value of array +1...-gets indexes in ascending order
				if((array[i+1] == array[i] + 1) && (array[i+2] == array[i] + 2)){
					
					list.add(i);
						
					
				}
				
				////if array position +1 equals current value of array -1...-gets indexes in descending order
				else if((array[i+1] == array[i] - 1) && (array[i+2] == array[i] - 2)){
					
					list.add(i);
				}
			
			}
		
		
			
			//create a new array equal to the collected list of indexes
			int[] newArr = new int[list.size()];
			
			//loops through newArr to populate it with the lists values of collected indexes
			for(int j = 0; j < list.size(); j++){
				
				newArr[j] = list.get(j);
			}
			
		
		
		//return the array values as a string1
		return Arrays.toString(newArr);
	}

}
