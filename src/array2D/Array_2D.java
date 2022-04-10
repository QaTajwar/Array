package array2D;

public class Array_2D {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// 2D array = array of arrays
	/*   0  1  2
	 * 0 *  *  *
	 * 1 *  *  *
	 * 2 *  *  *
	 */
	
		String [][] cars = {{"camaro","toyota","mustang"},     //Another way to write it
				            {"chevy","Tesla","mercedes"},
				            {"honda","lambo","ferarri"}};	
//	String [][] cars = new String[3][3];

	cars [0][0] = "camaro";
	cars [0][1] = "toyota";
	cars [0][2] = "mustang";
	cars [1][0] = "chevy";
	cars [1][1] = "Tesla";
	cars [1][2] = "mercedes";
	cars [2][0] = "honda";
	cars [2][1] = "lambo";
	cars [2][2] = "ferarri";
	
	for(int i=0; i<cars.length;i++) {
		System.out.println();
		for(int j=0; j<cars[i].length;j++) {
			System.out.print(cars[i][j]+" ");          
		}
	}
	}

}
