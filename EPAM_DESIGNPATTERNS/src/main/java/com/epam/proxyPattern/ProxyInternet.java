package com.epam.proxyPattern;

import java.util.ArrayList;

public class ProxyInternet implements Internet{
	private ArrayList<String> bannedWebsites;
	public ProxyInternet() {
		bannedWebsites = new ArrayList<String>();
		bannedWebsites.add("abc.com");
		bannedWebsites.add("facebook.com");
		bannedWebsites.add("orkut.com");
		bannedWebsites.add("instagram.com");
	}
	
	
	public void connectTo(String website) throws Exception {
		if(bannedWebsites.contains(website))
			System.out.println("Acess Denied to "+website);//throw new Exception("Access Denied");
		else
			System.out.println("Successfully Connected to "+website);
	}
}
