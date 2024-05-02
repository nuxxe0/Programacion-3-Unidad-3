package mvc;

public class AuthModel {

	public AuthModel() {
		
	}
	public boolean login(String username, String password) {
		if(username == "admin" && password == "123")
			return true;
		return false;
		
	}
}
