package CodeSoft;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int i;
		int m[]= new int[5];
		float sum=0, average;
		
		Scanner S1= new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.print("Enter the marks of Subject " +(i+1)+":");
			m[i]= S1.nextInt();
			sum= sum+m[i];
			
			
		}
		System.out.println("The Sum of all the Subjects is " + sum);
			average= sum/5;
			
			System.out.println("The average of all the Subjects is " + average);
		
		if(average>=80)
        {
            System.out.println("The grade accroding to the average is A");
        }
        else if(average>=60 && average<80)
        {
           System.out.println("The grade accroding to the average is B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.println("The grade according to the average is C");
        }
        else
        {
            System.out.println("The grade according to the average is D");
        }
    }
	



		
	
	
	


	}


