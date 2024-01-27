//import required classes and packages   
import java.util.Scanner;  
  
//create ATMExample class to implement the ATM functionality  
public class  AtmInterface{
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner s = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = s.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = s.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = s.nextInt();  
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    } 
} 

/* 
// Creating Class Atm For Implementing ATM USing Java Swing
class AtmMachine{
    //Method for Creating Graphical User Interface for ATM
    public AtmGui(){
        // Creating a new frame using JFrame 
        JFrame g = new JFrame("AUTOMATED TELLER MACHINE");

        // Creating Buttons For OPtions Such as 
        // Withdrawing
        // Depositing 
        // And Balance Enquiry
        JButton b1, b2, b3;
        
        // Creating  labels 
		JLabel l1,l2,l3;

		// Creating two text fields. 
		// One for rupee and one for 
		// the dollar 
		JTextField t1, t2; 
     
        b1 = new JButton("Withdraw"); 
		b1.setBounds(50, 80, 60, 15); 
		b2 = new JButton("Deposit"); 
		b2.setBounds(190, 80, 60, 15); 
		b3 = new JButton("Balance Enquiry"); 
		b3.setBounds(150, 150, 60, 30); 

        //Adding Action Listener
        b1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 

				
			} 
		});
        b2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				
			} 
		}); 
        
        b3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				
			} 
		}); 
        





    }
    

}
*/
