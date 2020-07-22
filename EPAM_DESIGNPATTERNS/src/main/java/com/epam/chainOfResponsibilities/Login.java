package com.epam.chainOfResponsibilities;

public class Login {
	private String userName;
	private String userPass;
	
	public Login(String userName, String userPass){
		this.userName = userName;
		this.userPass = userPass;
		LoginUser(userName,userPass);
	}
	
	
	
	private void LoginUser(String userName2, String userPass2) {
		// TODO Auto-generated method stub
		validateCredentials(userName,userPass);
	}



	private void validateCredentials(String userName, String userPass) {
		
		if(userName.isEmpty())
			System.out.println("Please enter the userId\n");
		
		UserDb user_db  = new UserDb();
		
		if(user_db.userExists(userName))
		{
			validatePassword(userName,userPass);
		}
		else
			System.out.println("oops .. User ID not found!");
	}
	
	private void validatePassword(String userName, String password) {
		PasswordValidator passwordValidator  = 
				new PasswordValidator();
		if(passwordValidator.isMappedTo(userName, password))
			System.out.println("Login succesfull! to "+userName);
		else
				System.out.println("Invalid password!");
	}
}
