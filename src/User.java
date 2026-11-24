
public class User {

	protected String email;
	protected String fullName;
	protected String password;
	protected int userId;
	
	//constructor
	public User(String email,String fullName,String password,int userId)
	{
this.email = email;
this.fullName = fullName;
this.password = password;
this.userId = userId;
	}


	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param fullName
	 * @param password
	 */
	public Boolean logIn(String fullName, int password){
		return false;
	}

	public void logOut(){

	}

	/**
	 * 
	 * @param fullName
	 * @param password
	 * @param email
	 */
	public Boolean register(String fullName, int password, String email){
		return false;
	}

	/**
	 * 
	 * @param fullName
	 * @param email
	 * @param password
	 */
	public void updateProfile(String fullName, String email, int password){

	}
}//end User