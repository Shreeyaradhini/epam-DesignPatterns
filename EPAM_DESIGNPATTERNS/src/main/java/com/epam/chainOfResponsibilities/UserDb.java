package com.epam.chainOfResponsibilities;

import java.util.HashMap;

public class UserDb {
	protected HashMap<String,String> userDb;
	public UserDb(){
		userDb = new HashMap<String,String>();
		userDb.put("ram","ram111");
		userDb.put("asd","asd111");
	}
	public Boolean SignWithEmailAndPassword(String uname, String upass) {
		if( upass == (userDb.get(uname)))
			return true;
		return false;
	}
	public Boolean userExists(String user) {
		return userDb.containsKey(user);
	}
}
