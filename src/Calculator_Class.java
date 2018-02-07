import java.util.Scanner;
import java.util.function.Function;

public class Calculator_Class {

//Created 2/6/18

	public static <var> void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		System.out.print(System.lineSeparator() +  "Please Enter One of the Following Options, Add, Subtract, Multiply, Divide, and Type Exit to Quit" + System.lineSeparator());
		//Asks the user for input
		Scanner UserInput = new Scanner(System.in); // allows the user to input
		String ChooseOption = UserInput.next(); // translates the user input to a variable
		
		switch(ChooseOption) { 
			case "Add":// if user inputs the word "Add" then the following code is initialized.
			System.out.print("What is the First Number You Want to Add" + System.lineSeparator());//prompt user for input
			String AddFirstNumber = UserInput.next(); // allows input
			int AddFirstNumberResult = Integer.parseInt(AddFirstNumber); //translates the string to an integer so that they can be added
			System.out.print("What is the Second Number You Want to Add" + System.lineSeparator()); // prompt for input
			String AddSecondNumber = UserInput.next(); //allows input
			int AddSecondNumberResult = Integer.parseInt(AddSecondNumber); //translates the second string to an integer
			System.out.print("Your Solution is: "); //prints the phrase
			System.out.print(AddFirstNumberResult + AddSecondNumberResult); // adds the two translated integers together
			continue;
		
			
		case "Subtract": // if user inputs the word "Subtract" then the following code is initialized.
			System.out.print("What is the First Number You Want to Subtract" + System.lineSeparator()); 
			String SubtractFirstNumber = UserInput.next();
			int SubtractFirstNumberResult = Integer.parseInt(SubtractFirstNumber);
			System.out.println("What is the Second Number You Want to Subtract" + System.lineSeparator());
			String SubtractSecondNumber = UserInput.next();
			int SubtractSecondNumberResult = Integer.parseInt(SubtractSecondNumber);
			System.out.print("Your Solution is: ");
			System.out.print(SubtractFirstNumberResult - SubtractSecondNumberResult);
			continue;
			
			
		case "Multiply":
			System.out.print("What is the First Number You Want to Multiply" + System.lineSeparator());
			String MultiplyFirstNumber = UserInput.next();
			int MultiplyFirstNumberResult = Integer.parseInt(MultiplyFirstNumber);
			System.out.print("What is the Second Number You Want to Multiply" + System.lineSeparator());
			String MultiplySecondNumber = UserInput.next();
			int MultiplySecondNumberResult = Integer.parseInt(MultiplySecondNumber);
			System.out.print("Your Solution is: ");
			System.out.print(MultiplyFirstNumberResult * MultiplySecondNumberResult);
			continue;
			
		
		case "Divide":
			System.out.print("What is the First Number You Want to Divide" + System.lineSeparator());
			String DivideFirstNumber = UserInput.next();
			int DivideFirstNumberResult = Integer.parseInt(DivideFirstNumber);
			System.out.print("What is the Second Number You Want to Divide" + System.lineSeparator());
			String DivideSecondNumber = UserInput.next();
			int DivideSecondNumberResult = Integer.parseInt(DivideSecondNumber);
			System.out.print(DivideFirstNumberResult / DivideSecondNumberResult);
			continue;
					
			
		case "Exit":{
			System.exit(0);
			
		}
		default:
			System.out.print("You Entered a Wrong Option, Please Try Again");
			continue;
		
		}
		}
		
	}
	
}
