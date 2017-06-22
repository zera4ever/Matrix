package org.itstep;

public class MatrixManager {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();
		matrix.setMatrix(4);
		
		long result = 1;
		int [][] filledMatrix = matrix.getMatrix();
		
		
		for(int i=0; i<filledMatrix.length; i++){
			for(int j=0; j<filledMatrix[i].length; j++){
				System.out.print(filledMatrix[i][j] + ", ");
				
				// можно еще *=
				result = result*filledMatrix[i][j];
				
			}
			System.out.println();	
		}
		System.out.println(result);
		

	}

}
