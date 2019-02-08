package HangMan;

import java.util.Scanner;

public class Interface {
	public static Scanner input = new Scanner(System.in);
	String[] hangdMan = {
			"|",
			"|\no", 
			"|\no\n|", 
			" |\n o\n/|", 
			" |\n o\n/|"+"\\\\",
			" |\n o\n/|"+"\\\\"+"\n/" ,
			" |\n o\n/|"+"\\\\"+"\n/"+" \\\\" };
	public String CreateUser() {
		// TODO Auto-generated method stub
		System.out.println("Write your User Name");
		String userName = input.next();
		System.out.println("hi and wellcome your user name is" + userName);
		return userName;
	}
	public int doYouWantStart() {
		// TODO Auto-generated method stub
		System.out.println("Write 1 for Starting a new game and 2 for ending");
		return input.nextInt();
	}
	public String showPlayerWhatHeKnows(String st) {
		// TODO Auto-generated method stub
		System.out.println("each star * repensents an letter");
		System.out.println(st);
		System.out.println("Gues a letter");
		return input.next();
		
		
	}
	public void wrongGues(int i) {
		// TODO Auto-generated method stub
			System.out.println("guest wrong try again you have " +i+" tryes left before you will get hangd");
			System.out.println(hangdMan[7-i]);
	}
	public void lostGame() {
		// TODO Auto-generated method stub
		System.out.println("you have lost the game and will now be hanged");
		
	}
	public void wonGame() {
		// TODO Auto-generated method stub
		System.out.println("you won and shall be rewarded with another game if you like");
	}

}
