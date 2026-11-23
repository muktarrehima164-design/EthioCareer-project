
public class Application {

	private date applicationDate;
	private Int applicationId;
	private String applicationStatus;

	public Application(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param jobsekeerId
	 * @param jobId
	 * @param jobTtle
	 * @param jobType
	 * @param cvId
	 */
	public Boolean submitApplication(Int jobsekeerId, Int jobId, String jobTtle, String jobType, Int cvId){
		return false;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public ArrayList<application> viewApplication(Int applicationId){
		return null;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public Boolean withdrawApplication(Int applicationId){
		return false;
	}
}//end Application