/* 
   Class
      
   DATA DICTIONARY
   ---------------
   NAME	        TYPE        VALUE RANGE	  DESCRIPTION
   ========     =========== ===========   ====================
   name         String       string       	string of words
   quiz1n		int		      1-100			number
   quiz2        int		      1-100			number
   quiz3		int			  1-100			number
   midterm		int			  1-100			number
   finalExam	int			  1-100			number
   finalScore	double		  1-100			number
   letterGrade	char		  A-F			Letter
   
   
*/

import java.util.*;

public class Student
{
	private String name;//a string of words
    private int quiz1;//a number from 1-100
    private int quiz2;// a number from 1-100
    private int quiz3; //a number from 1-100
    private int midterm;//a number from 1-100
    private int finalExam;//a number from 1-100
    private double finalScore;//percentage of all grades
    private char letterGrade;//assigned letter grade
      
       
    /* Outputting information to main class*/
    
    public void initializeStudent()
    {
    Scanner keyboard = new Scanner(System.in);
    
		
		System.out.println("Please enter your name.");
		name = keyboard.nextLine();
		System.out.println("Please enter your score for Quiz One.");
		quiz1 = keyboard.nextInt();
		System.out.println("Please enter your score for Quiz Two.");
		quiz2 = keyboard.nextInt();
		System.out.println("Please enter your score for Quiz Three.");
		quiz3 = keyboard.nextInt();
		System.out.println("Please enter your score for Midterm.");
		midterm = keyboard.nextInt();
		System.out.println("Please enter your score for Final Exam.");
		finalExam = keyboard.nextInt();
		
	}	
    public void generateScore()
    {
    	//quiz scores divided by 30 and multiply by .25 for 25% grade
    	//midterm score 35
    	//finalExam 40
    	finalScore = ((((((quiz1/10)*100)+((quiz2/10)*100)+((quiz3/10)*100))/3)*.25)+(((midterm/100)*100)*.35)+(((finalExam/100)*100)*.4));
    	
    }
    public void setLetterGrade()
    {
    	if (finalScore >= 90)
	        	letterGrade = 'A';
	        else if (finalScore >= 80)
	        		letterGrade = 'B';
	        	 else if (finalScore >= 70)
	        			letterGrade = 'C'; 
	        	      else if (finalScore >= 60)
	        				letterGrade = 'D'; 
	        	   		   else letterGrade = 'F';
    }    
    public void menu2(String name)
    {
    	System.out.println("Student name is " + name);
    }
    public String getName(String name)
    {
    	return name;
	}
    public int getQuiz1()
    {
    	return quiz1;
    }
    public int getQuiz2()
    {
    	return quiz2;
    }
    public int getQuiz3()
    {
  		return quiz3;
    }
    public int getMidterm()
    {
    	return midterm;
    }
    public int getFinalExam()
    {
    	return finalExam;
  	}
 	public char letterGrade()
 	{
 		return letterGrade;
 	}
  	 
    public void generateStudentInfo()
	{
		System.out.println("Name: " + name + 
		" Quiz One Entry: " + quiz1 + 
		" Quiz Two Entry: " + quiz2 + 
		" Quiz Three Entry: " + quiz3 + 
		" Midterm Entry: " + midterm + 
		" Final Exam Entry: " + finalExam +
		" Final Score: " + finalScore +
		" Final Letter Grade : " + letterGrade);
    }
   
}  /*END OF CLASS*/

