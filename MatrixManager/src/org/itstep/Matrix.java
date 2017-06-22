package org.itstep;

public class Matrix {

	private int[][] matrix;

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrixLenght) {
		
		// тут мы указали размер матрицы
		this.matrix = new int[matrixLenght][matrixLenght];
		for(int i=0; i<matrixLenght; i++){
			for(int j=0; j>matrixLenght; j++){
				//            обрезает  мин    0-0,999999     максимум
				this.matrix[i][j] = (int)(10 + (Math.random()*(30-10))); 
			}
			
		}
		
		
		
	}
	
	
	
	
}
