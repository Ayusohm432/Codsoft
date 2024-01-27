//Task2
// Java Program for Student Grade Calculator Creted bu Ayush..

//Importing Packages
import java.util.Scanner;

//Declring class Grade Calculator
class GradeCaculator{
  //Declaring and Initializing variables
  private float[] marks = new float[10];
  private float totalMarks=0;
  private int totalSubject;
  private float avg;
  private String grade = "";
 

  //Creating object of Scanner Class
  Scanner sc = new Scanner(System.in);

  //Method for Taking input for Number of Subjects.
  public void TotalSubject(){
      
      System.out.print("\n\nEnter Total Number of Subjects: ");
      totalSubject = sc.nextInt();
  }
  //Method for Taking Input Marks in Each Suject.
  public void MarksInEachSubject(){
      System.out.println();
      for(int i=0; i<totalSubject; i++)
      {
         System.out.print("Enter Marks Obtained in Subject " +(i+1)+ " : ");
         marks[i] = sc.nextFloat();
         totalMarks += marks[i];
      }
      System.out.println("\nMaximunm Marks  = "+(totalSubject*100));
      System.out.println("Total Marks Obtained = "+totalMarks);

  }

  //Method for Calculating Average of Marks
  public void Average(){
      avg = totalMarks/totalSubject;
      System.out.println("Average Marks Obtained in each Subject = "+avg);
      System.out.println("Percentage of Marks Obtained = "+avg+"%");
   }
   
  //Method for Grade Calculation
   public void GradeCalculation(){
      if(avg>=94 && avg<=100)
         grade = "A";
      else if(avg>=90 && avg<94)
         grade = "A-";
      else if(avg>=87 && avg<90)
         grade = "B+";
      else if(avg>=83 && avg<87)
         grade = "B";
      else if(avg>=80 && avg<83)
         grade = "B-";
      else if(avg>=77 && avg<80)
         grade = "C+";
      else if(avg>=73 && avg<77)
         grade = "C";
      else if(avg>=70 && avg<73)
         grade = "C-";
      else if(avg>=67 && avg<70)
         grade = "D+";
      else if(avg>=63 && avg<67)
         grade = "D";
      else if(avg>=60 && avg<63)
         grade = "D-";
      else if(avg>=0 && avg<60)
         grade = "F";
      else
         grade = "Invalid Input!";
		 
      if(grade.equals("Invalid Input!"))
         System.out.println("\nInvalid Input!");
      else
         System.out.println("\nYour Grade = " +grade);

   }
   //method for Separation.
	public void separate() {
      System.out.println();
		for (int i = 0; i <= 73; i++) {
			System.out.print("-");
		}
	}

} 
//Main Class
public class StudentGradeCalculator
{
   //Main Method
   public static void main(String[] args)
   {
      //declaring and initializing Variable
      char choice;
      //Creating Object For Class GradeCaculator
      GradeCaculator gc = new GradeCaculator();
      //Starting
      System.out.println("\n\n\t\t\tStudent Marks Grade Calculator");
      System.out.println("\n\n\t\t\tEnter Your Marks Out Of 100");
      gc.separate();
      //Calling function to Take Input for Number of Subject  
      gc.TotalSubject();
      //Calling function to Take Input for Marks in each Subject  
      gc.MarksInEachSubject();
      //Calling function to Calculate Average
      gc.Average();
      //Calling function to Calculate Grade
      gc.GradeCalculation();
      gc.separate();
      //Replay For Game
      System.out.println("\n\t\t\tIf you want to Use again \n\n\t\t\t1.Press  y to continue \n\t\t\t2.press q to exit..");
      System.out.print("\n\t\t\tEnter Your Chioce:");
      Scanner scan = new Scanner(System.in);
      choice= scan.next().charAt(0);
      switch(choice){
          case 'y':
                main(null);
                break;
          case 'q':
                System.exit(0);
                break;
          default:
                System.exit(0);
                 break;
      }
      gc.separate();

   }
}