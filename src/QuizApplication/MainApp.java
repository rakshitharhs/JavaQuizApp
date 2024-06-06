package QuizApplication;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Quip App ALL THE BEST");
		System.out.println("Please enter your name");
		String name = scan.next();
		System.out.println("Please enter your emailId");
		String email = scan.next();
		System.out.println("Please enter your Phone Number");
		int phoneNumber = scan.nextInt();
		
		Participant p = new Participant(name,email,phoneNumber);
		
		System.out.println("Welcome to guidelines"+ p.getName());
		System.out.println("The guideless are");
		System.out.println(Guidelines.guideline1 + " \n" + Guidelines.guideline2 + "\n" + Guidelines.guideline3 + " \n" + Guidelines.guideline4);
		System.out.println("Do you accect all the guidelines (true or false");
		boolean acceptance = scan.nextBoolean();
		if(acceptance == true) {
			Options op = new Options();
			System.out.println("Here is your question");
			System.out.println(Questions.question1);
			boolean res1 = op.optoinsforquestion1();
			if(res1 == true) {
				p.setAmount(1000);
				System.out.println("Corect answer, You have won"+p.getAmount());
				System.out.println("Here's your 2nd question");
				System.out.println(Questions.question2);
				boolean res2 = op.optionforquestion2();
				if(res2 == true) {
					p.setAmount(2000);
					System.out.println("Corect answer, You have won\n" +p.getAmount());
					System.out.println("Here's your 3rd question");
					System.out.println(Questions.question3);
					boolean res3 = op.optionforquestion3();
					if(res3 == true) {
						p.setAmount(3000);
						System.out.println("Corect answer, You have won\n" +p.getAmount());
						System.out.println("Here's your 4th question");
						System.out.println(Questions.question4);
						boolean res4 = op.optionforquestion4();
						if(res4 == true) {
							p.setAmount(4000);
							System.out.println("Corect answer, You have won\n" +p.getAmount());
							System.out.println("Here's your 5th question");
							System.out.println(Questions.question5);
							boolean res5 = op.optionforquestion5();
							if(res5 == true) {
								p.setAmount(5000);
								System.out.println("Corect answer, You have won\n" +p.getAmount());
								System.out.println("Here's your 6th question");
								System.out.println(Questions.question6);
								boolean res6 = op.optionforquestion6();
								if(res6 == true) {
									p.setAmount(6000);
									System.out.println("Corect answer, You have won\n" +p.getAmount());
									System.out.println("Here's your 7th question");
									System.out.println(Questions.question7);
									boolean res7 = op.optionforquestion7();
									if(res7 == true) {
										p.setAmount(7000);
										System.out.println("Corect answer, You have won\n" +p.getAmount());
										System.out.println("Here's your 8th question");
										System.out.println(Questions.question8);
										boolean res8 = op.optionforquestion8();
										if(res8 == true) {
											p.setAmount(8000);
											System.out.println("Corect answer, You have won\n" +p.getAmount());
											System.out.println("Here's your 9th question");
											System.out.println(Questions.question9);
											boolean res9 = op.optionforquestion9();
											if(res9 == true) {
												p.setAmount(9000);
												System.out.println("Corect answer, You have won\n" +p.getAmount());
												System.out.println("Here's your 10th question");
												System.out.println(Questions.question10);
												boolean res10 = op.optionforquestion5();
												if(res10 == true) {
													p.setAmount(10000);
													System.out.println("Corect answer, You have won\n" +p.getAmount());
											}
										else {
											System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
										}
										
									
										}
									else {
										System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
									}
									
								
									}
								else {
									System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
								}
								
							
								}
							else {
								System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
							}
							
						
							}
						else {
							System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
						}
						
					
						}
					else {
						System.out.println("Sorry. It was a wrong answer. \n You have won"  +p.getAmount());
					}
				}
			else {
				System.out.println("Sorry wrong answer, You have won\\n" +p.getAmount());
			}
			}
			else {
				System.out.println("Sorry,Wrong Answer and you have won"+ p.getAmount());
			}
		}else {
			System.out.println("Thanks for playing");
			System.exit(0);
		}
		}
	}
}

}

















