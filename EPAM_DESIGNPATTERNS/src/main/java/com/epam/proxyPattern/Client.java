package com.epam.proxyPattern;

public class Client {
	private Internet internet;
	public Client()
	{
		
	}
	public void connectTo(String website)
	{
		internet = new ProxyInternet();
		try {
			internet.connectTo(website);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
