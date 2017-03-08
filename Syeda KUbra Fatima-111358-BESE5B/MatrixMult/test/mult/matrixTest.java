/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mult;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sfatima.bese14seecs
 */
public class matrixTest {
    
    public matrixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of iterative method, of class matrix.
     */
    @Test
    public void testIterative() {
        System.out.println("iterative");
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 1, 2 }, { 2, 3 } };;
        int size = 2;
        
        matrix instance = new matrix();
        int[][] expResult ={{5,8},{8,13}};
        int[][] result = instance.iterative(A, B, size);
        for (int i = 0; i < 2; i++){
		for (int j = 0; j < 2; j++){
			System.out.println(result[i][j]);
		}
		
	}
        
        assertArrayEquals(expResult, result);
        
        
    }

    
    @Test
    public void testStrassen() {
        System.out.println("strassen");
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 1, 2 }, { 2, 3 } };
        matrix instance = new matrix();
        int[][] expResult = {{5,8},{8,13}};
        int[][] result = instance.strassen(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
