package consec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class consecutiveTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//create an array to store user values
		int myArray[] = new int[5];
		
		
		System.out.println("Enter 5 numbers");
		
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
		for(int i = 0; i < array.length; i++){
			
			if(i <= 0 && i <= array.length)
			{
				//if i > current position +1 and current position +2
				if((array[i] > array[i+1]) && (array[i]) > array[i+2]) {
					
					
					
					
				}
				
				else{
					
					//if i is not less than current position +1 and +2 break out of current iteration
					break;	
					
				}
			
			}
			
			else{
				
				//break out loop if is out of bounds
				continue;
			}
				
			
		}
		

			
			//create a new array to return values back to calling method
			int[] newArr = new int[list.size()];
			
			for(int j = 0; j < list.size(); j++){
				
				newArr[j] = list.get(j);
			}
			
		
		
		
		return Arrays.toString(newArr);
	}

}
