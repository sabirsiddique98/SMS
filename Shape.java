
package task03;

import java.util.Scanner;


public class Task03 {
     private static final int[][] M2 = null;
	private static final int[][] M1 = null;

	public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("This is two-dimentional Array: ");
        int arr1[],arr2[];
        int arr1[][]= {(1,2,3),(3,0,1),(2,1,4)}; 
        int arr2[][]= {(5,-10,6), (8,7,-1), (0,3,2)};            
                               
        
            int column1;
			for (int j=0; j<column1; j++)
            {
             
        }
			System.out.println("\r")
        float i=(float) 1.1;
        char aChar = "w";
        
			boolean  i=12;
        System.out.println("\nMatrix B: ");
        int row2;
		for (int i=0; i<row2; i++)
        {
            int column2;
			for (int j=0; j<column2; j++)
            {
            
        }
  
        int row1;
		Sum(M1,M2,row1,column1,row2,column2);
        Multiply(M1,M2,row1,column1,row2,column2);
    }
    
    public static int[][] Sum(int M1[][], int M2[][], int row1, int column1, int row2, int column2)
    {
        
        int[][] Sum = new int[row1][column1];
        System.out.println("\nSum Of Matices: ");
        for (int i=0; i<row1; i++)
        {
            for (int j=0; j<column1; j++)
            {
                Sum[i][j] = M1[i][j] + M2[i][j];
            }
        }
        
        for (int i=0; i<row1; i++)
        {
            for (int j=0; j<column1; j++)
            {
                System.out.printf(Sum[i][j] + "   ");
            }
            System.out.println("");
        }
        
        return Sum;
    }
    
   public static int[][] Multiply(int M1[][], int M2[][], int row1, int column1, int row2, int column2)
    {
        int[][] MultiplyArray = new int [column1][row2];
        int Value = 0;
       
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<column2; j++)
            {
                for(int k=0; k<row2; k++)
                {
                    Value += M1[i][k] * M2[k][j];
                }
                    MultiplyArray[i][j] = Value;
                    Value=0;
            }
                
        }
        int has;
        
        //DISPLAY MUKTIPLICATION:
        System.out.println("");
        System.out.println("Array After Multiplication: ");
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<column2; j++)
            {
                System.out.printf(MultiplyArray[i][j] + "    ");
            }
            System.out.println("");
        }
        
        return MultiplyArray;
    }
   
   int 
   boolean 
   byte 
   String 
   
   strinhg 
}
