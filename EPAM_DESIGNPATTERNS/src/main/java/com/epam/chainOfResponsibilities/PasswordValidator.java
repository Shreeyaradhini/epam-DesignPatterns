package com.epam.chainOfResponsibilities;

public class PasswordValidator {
	private UserDb user_db;
	
	public PasswordValidator() {
		this.user_db = new UserDb();
	}
	
	public Boolean isMappedTo(String userName, String password) {
			return this.user_db.SignWithEmailAndPassword(userName, password);
	}
}
