package QuizApplication;

import java.util.Scanner;

public class Options {
	Scanner sc = new Scanner(System.in);
	boolean optoinsforquestion1() {
		System.out.println("1.James Goslings\n"+
							"2. Dennis\n" + 
							"3. Steve Jobs\n" +
							"4. E F Codd");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 1) {
			return true;
		}
		else
			return false;
		
	}
	public boolean optionforquestion2() {
		System.out.println("Virat\n"+
		"2. Dhone\n"+
		"3.Rohith\n"+
		"4. Rahul");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 1) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion3() {
		System.out.println("1) H2O\r\n"
				+ "2) CO2\r\n"
				+ "3) NaCl\r\n"
				+ "4) O2" );
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 1) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion4() {
		System.out.println("1) 5\n"
				+ "2) 4\n"
				+ "3) 8\n"
				+ "4) 9" );
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 4) {
			return true;
		}
		else
			return false;
	}

	public boolean optionforquestion5() {
		System.out.println("1) J.R.R. Tolkien\r\n"
				+ "2) J.K. Rowling\r\n"
				+ "3) Stephen King\r\n"
				+ "4) George R.R. Martin");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 2) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion6() {
		System.out.println("1) Berlin\n"
				+ "2) Rome\n"
				+ "3)Paris\n"
				+ "4) Madrid");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 3) {
			return true;
		}
		else
			return false;
	}
	
	public boolean optionforquestion7() {
		System.out.println("1) 4.56 \n"
				+ "2) 3.99\n"
				+ "3) 3.14 \n"
				+ "4) 6.13");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 3) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion8() {
		System.out.println("1)Tiger\n"
				+ "2) Snake\n"
				+ "3) Lion\n"
				+ "4) Bear");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 3) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion9() {
		System.out.println("1) Vincent van Gogh\n"
				+ "2) Leonardo da Vinci\n"
				+ "3) Stephen King\n"
				+ "4) George R.R. Martin");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 2) {
			return true;
		}
		else
			return false;
	}
	public boolean optionforquestion10() {
		System.out.println("1) Elephant\n"
				+ "2) Blue Whale\n"
				+ "3) Giraffe\n"
				+ "4)  Hippopotamus");
		System.out.println("Enter the option");
		int num = sc.nextInt();
		if(num == 2) {
			return true;
		}
		else
			return false;
	}
	
	

}
