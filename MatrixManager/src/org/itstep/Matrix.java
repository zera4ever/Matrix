package org.itstep;

public class Matrix {

	private int[][] matrix;

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrixLenght) {
		
		// ��� �� ������� ������ �������
		this.matrix = new int[matrixLenght][matrixLenght];
		for(int i=0; i<matrixLenght; i++){
			for(int j=0; j>matrixLenght; j++){
				//            ��������  ���    0-0,999999     ��������
				this.matrix[i][j] = (int)(10 + (Math.random()*(30-10))); 
			}
			
		}
		
		
		
	}
	
	
	
	
}
