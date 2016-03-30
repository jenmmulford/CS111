/* Chapter No. 4	   Program No. 6
   File Name:          Program4_6_Mulford
   Programmers:        Jennifer Mulford
   Date Last Modified: March 29, 2016

Problem Statement: Write a grading program that pulls student information and 
calculates percentages and final grades.
   
   Overall Plan (Algorithm - step-by-step plan to make it happen):
   1.Call methods from the Student Class.
      
  
   
   Classes needed and Purpose (Scanner, IO, next)
   main class - next
   Student class
   
   
   
    
  
*/
import java.util.*;
import java.io.*;

public class Program4_6_Mulford
{
	public static void main(String[] args)
	{
		
    Student studentObject = new Student();
	studentObject.initializeStudent();
	studentObject.generateScore();
	studentObject.generateStudentInfo();
	
		
		System.out.println();
        System.out.println("End of program.");
		
		}
		
	}
    
    

