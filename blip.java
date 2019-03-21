import java.util.*;
public class blip{
public static void main(String[] args){
	Scanner inputNumber = new Scanner(System.in);
	int testcase = Integer.parseInt(args[0]);//adds the input numbers to be checked
	
	for (int i = 0; i < testcase ; i++){ 
		int numberToCheck = inputNumber.nextInt();

		if(numberToCheck < -10 || numberToCheck > 10 || numberToCheck == 0){//determines is the variable is within the parameters
			System.out.println("The input number is outside of parameters");
			break;
			}//if		
 		boolean isEven = false;
		
			if(numberToCheck == (int) (2* (numberToCheck/2))){//tests to see if the number is even or odd
			isEven = true;
			}//if
		System.out.println(isEven);
		}//for
	

}//main
}//class
