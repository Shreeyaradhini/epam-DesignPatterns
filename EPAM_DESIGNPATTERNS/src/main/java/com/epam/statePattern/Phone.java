package com.epam.statePattern;

import java.util.Scanner;

public class Phone {
	private Boolean phoneState;
	Phone(Boolean phoneState){
		this.phoneState = phoneState;
	}
	public Phone(){
		this.phoneState = false;
	}
	
	public void makeCallTo(String number) {
		if(this.phoneState == false)
		{
			System.out.println("Please Unlock the phone");
			changeState(number);
		}
		else
			System.out.println("Dailing to "+number+"...");
	}
	
	private void changeState(String number) {
		if(this.phoneState == false) {
			System.out.println("Do you want to unlock the phone ?");
			//
			Scanner sc = new Scanner(System.in);
			String state = "True";
			switch(state){
			case "True":
			{
				System.out.println("True  \nPhone unlocked");
				this.phoneState = true;
				makeCallTo(number);
				break;
			}
			case "False":
			{
				System.out.println("Couldn't place call...");
				break;
			}
			
			}
		}
	}
}
