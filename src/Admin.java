

/**
 * @author Hikmet
 * @version 1.0
 * @created 21-Nov-2026 8:19:24 PM
 */
public class Admin extends User {

	private String adminePermission;
	private String admineRole;

	public Admin(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param jobId
	 */
	public Boolean approveJobPosting(Int jobId){
		return false;
	}

	/**
	 * 
	 * @param jobId
	 */
	public void deletePost(Int jobId){

	}

	/**
	 * 
	 * @param employerId
	 * @param action
	 */
	public Boolean manageEmployer(Int employerId, String action){
		return false;
	}

	/**
	 * 
	 * @param userId
	 */
	public Boolean manageUser(Int userId){
		return false;
	}

	/**
	 * 
	 * @param fullName
	 * @param password
	 * @param email
	 */
	public Boolean register(String fullName, Int password, String email){
		return false;
	}
}//end Admin