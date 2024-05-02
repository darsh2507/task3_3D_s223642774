package sit707_tasks;

import java.util.Random;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {   
    	

    	System.out.println("Day D1: January 28, 2024 ,Increment should be January 29, 2024");
    	DateUtil date = new DateUtil(28, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	
    	System.out.println("Day D1: January 28, 2024 ,Decrement should be January 27, 2024");
    	 date = new DateUtil(28, 1, 2024);
    	System.out.println(date);
    	date.decrement();
    	System.out.println(date);

    	System.out.println("Day D2: January 29, 2024 ,Increment should be January 30, 2024");
    	date = new DateUtil(29, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	
    	System.out.println("Day D2: January 29, 2024 ,Decrement should be January 28, 2024");
    	date = new DateUtil(29, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	
    	System.out.println("Day D3: January 30, 2024 ,Increment should be January 31, 2024");
    	date = new DateUtil(30, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	System.out.println("Day D3: January 30, 2024 ,Decrement should be January 28, 2024");
    	date = new DateUtil(30, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);

    	System.out.println("Day D4: January 31, 2024 ,Increment should be March 30, 2024");
    	date = new DateUtil(31, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);

    	System.out.println("Month M1: April 30, 2024 ,Increment should be May 1, 2024");
    	date = new DateUtil(30, 4, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);

    	System.out.println("Month M2: January 31, 2024,Increment should be February 1, 2024");
    	date = new DateUtil(31, 1, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);

    	System.out.println("Month M3: February 28, 2023 ,Increment should be March 1, 2023");
    	date = new DateUtil(28, 2, 2023);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);

    	System.out.println("Month M4: February 28, 2024,Increment should be February 29, 2024");
    	date = new DateUtil(28, 2, 2024);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	date.decrement();
    	
    	
    	System.out.println("Year Y1: February 28, 2020 ,Increment should be February 29, 2020");
    	date = new DateUtil(28, 2, 2020);
    	System.out.println(date);
    	date.increment();
    	System.out.println(date);
    	
    	 System.out.println("Year Y2: February 28, 2023 , Increment should be March 1, 2023");
         date = new DateUtil(28, 2, 2023);
         System.out.println(date);
         date.increment();
         System.out.println(date);

//        
    }
}
