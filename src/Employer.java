
public class Employer extends User {

	private String companyAddress;
	private String companyEmail;
	private String companyName;
	public Application m_Application;
	public Vacancy m_Vacancy;

	public Employer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param applicationId
	 */
	public void acceptApplicion(int applicationId){

	}

	/**
	 * 
	 * @param jobId
	 */
	public Boolean deleteJob(int jobId){
		return false;
	}

	/**
	 * 
	 * @param jobId
	 * @param jobTaype
	 * @param jobTitle
	 */
	public Boolean postJob(int jobId, String jobTaype, String jobTitle){
		return false;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public void rejectApplication(int applicationId){

	}

	/**
	 * 
	 * @param jobId
	 */
	public Boolean updateJob(int jobId){
		return false;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public ArrayList<application> viewApplication(int applicationId){
		return null;
	}


}//end Employer