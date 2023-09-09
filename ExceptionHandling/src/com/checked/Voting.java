package com.checked;

public class Voting {
	public static void main(String[] args){
		int age=17;
		
//		Exception handle by try-catch block
		try {
			if(age<18) {
				throw new UnderAgeException("Sorry! you cannot vote..");
			}else {
				System.out.println("vote successfully..");
			}	
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}
		
//		Exception without not handle by try-catch block
//		(when uncomment this code it will give you error because;
//		at the time program execution in checked exception compiler 
//		check possibilty of errors thats why it is also called as compile exception..)
		
			/*if(age<18) {
				throw new UnderAgeException("Sorry! you cannot vote..");
			}else {
				System.out.println("vote successfully..");
			}	*/
		
	}
	
}
