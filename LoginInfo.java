package application;

import java.util.HashMap;

public class LoginInfo {
	
	protected HashMap<String, String> info;
	
	public LoginInfo() {
		info = new HashMap<String, String>();
	}
	
	public void addUser(String u, String p){
		info.put(u, p);
	}
	
	
	
}
