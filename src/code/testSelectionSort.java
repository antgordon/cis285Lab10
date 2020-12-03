package code;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	


    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
	
    public void testNegative(){
        
        /** Test data contains negative values only **/
    }
    
	@Test
    public void testMixed(){
        
		int[] arr = new int[5];
		arr[0] = -8;
        arr[1] = 9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = 0;
        Sortedarr[2] = 2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        
        SelectionSort sort = new SelectionSort();
        sort.basicSelectionSort(arr);
        
        Assert.assertArrayEquals(Sortedarr, arr);
    }
    
	@Test
    public void testDuplicates(){
        
		int[] arr = new int[5];
		arr[0] = 8;
        arr[1] = 9;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 8;
        Sortedarr[2] = 9;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        
        SelectionSort sort = new SelectionSort();
        sort.basicSelectionSort(arr);
        
        Assert.assertArrayEquals(Sortedarr, arr);
	        
    }



}
