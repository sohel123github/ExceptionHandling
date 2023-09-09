package com.checked;

public class UnderAgeException extends Exception{
	
	UnderAgeException (){
		super("You can't vote..");
	}
	
	UnderAgeException (String msg){
		super(msg);
	}

}
