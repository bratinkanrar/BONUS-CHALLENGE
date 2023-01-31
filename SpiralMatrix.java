import java.util.Scanner;  
import java.lang.Math;  
public class SpiralMatrix 
{    
  static void PrintSpiralMatrix(int n)  
  {  
   int row = 0, col = 0;  
   int boundary = n - 1;  
   int sizeLeft = n - 1;  
   int flag = 1;  
   // r = right, l = left, d = down, u = upper  
   char move = 'r';  
   int[][] matrix =new int [n][n];  
   for (int i = 1; i < n * n + 1; i++)  
   {  
     matrix[row][col] = i;  
     switch (move)  
     { 
       case 'r':  
          col += 1;  
          break;  
       case 'l':  
          col -= 1;  
          break;    
       case 'u':  
          row -= 1;  
          break;  
       case 'd':  
          row += 1;  
          break;  
      }   
  
     if (i == boundary)//checks if the matrix has reached the array boundary  
     {    
        boundary = boundary + sizeLeft;  
        if (flag != 2)  
        {  
          flag = 2;  
        }  
        else  
        {  
          flag = 1;  
          sizeLeft -= 1;  
        }   
        switch (move)  
        {  
        case 'r':  
            move = 'd';  
            break;  
        
        case 'd':  
            move = 'l';  
            break;  
        
        case 'l':  
            move = 'u';  
            break;  
        
        case 'u':  
            move = 'r';  
            break;  
         }  
       }  
   }    
   for (row = 0; row < n; row++)  
   {  
          
        for (col = 0; col < n; col++)  
            {  
                int p = matrix[row][col];  
                if(p < 10)  
                    System.out.print(p +"   ");  
                else  
                    System.out.print(p +"  ");  
            }  
        System.out.println();  
    }  
 }   
 public static void main(String args[])  
 { 
  Scanner sc = new Scanner(System.in);  
  System.out.print("Enter the value of n: ");  
  int n = sc.nextInt();  
  System.out.println();   
  PrintSpiralMatrix(n);  
 }  
}
