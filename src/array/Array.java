package array;

public class Array { public static void main(String[]args) {
	
	// Array = used to store multiple values in a single array
	
	String[] cars = {"Toyota","Audi","Honda"};
	
	cars[0] ="Tesla";          // changing the value of array
	
	
	System.out.println(cars[1]);
	 
	
//	String[]cars = new String[4];              // Another way to assign value using array
//	
//	cars[0] = "Ferrari";
//	cars[1] = "Lambo";
//	cars[2] = "Tesla";
//	cars[3] = "Bugatti";
//	
	                                                            //System.out.println(cars[1]);
	
	for(int i=0; i<cars.length;i++) {
		System.out.println(cars[i]);
		
	}
	
	
	
	
	
}

}
