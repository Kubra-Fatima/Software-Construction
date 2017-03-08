/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mult;

/**
 *
 * @author sfatima.bese14seecs
 */
public class matrix {
  public int[][]  iterative(int A[][],int B[][],int size){
      int i, j, k;
	int sum;
        int C[][]= new int[size][size];
	for (i = 0; i < size; i++)
	{
		for (j = 0; j < size; j++){
			sum = 0;
			for (k = 0; k < size; k++){
				sum += A[i][k] * B[k][j];
			}
			C[i][j] = sum;
		}
	}
	return C;
  }
  public int[][] strassen(int A[][],int B[][])
  {
      int m1,m2,m3,m4,m5,m6,m7;
     int C[][]= new int[2][2];
      m1 = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
	m2 = (A[1][0] + A[1][1]) * B[0][0];
	m3 = A[0][0] * (B[0][1] - B[1][1]);
	m4 = A[1][1] * (B[1][0] - B[0][0]);
	m5 = (A[0][0] + A[0][1]) * B[1][1];
	m6 = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
	m7 = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

	C[0][0] = m1 + m4 - m5 + m7;
	C[0][1] = m3 + m5;
	C[1][0] = m2 + m4;
	C[1][1] = m1 - m2 + m3 + m6;
        return C;
  }
  
}
