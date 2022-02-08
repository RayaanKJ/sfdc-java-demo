package group.assignment.rayaan;

import java.util.Scanner;

public class A2assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int  i,num ;
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
             num = sc.nextInt();
             System.out.println("Table of num "+num );
         for (i=1 ; i<=10 ; i++){
        	 
        	 System.out.println(+num+"x" +i +"="+ num * i );
        	 
         }
         
         
			
		}
}
