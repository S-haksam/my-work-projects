package loopassignment;

public class loop {

	public static void main(String[] args) {
		// print the first 5 even numbers using a while loop
		System.out.println("the first 5 even numbers are:");
		
		int number = 2; //start with the first even number
		 int count = 0; //count of even numbers printed
		 
		 //countinue the loop until 5 even numbers are printed
		 while (count < 5) {
			 System.out.println("even number:"+ number);
			 
			 number +=2; //move to the next even number
			 count++; //increment the count of even numbers
		 }
 
	}

}
