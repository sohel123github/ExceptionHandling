package com.unchecked;

public class Voting {
	public static void main(String[] args) {
		int age=15;
		
//		exception handle by try catch block
		try {
			if(age<18) {
				throw new YoungerAgeException("Your not eligible to vote..");
			}else {
				System.out.println("Vote successfully..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		exception not handle by try catch block
		/*if(age<18) {
			throw new YoungerAgeException("Your not eligible to vote..");
		}else {
			System.out.println("Vote successfully..");
		}*/
		
		
	}
}
