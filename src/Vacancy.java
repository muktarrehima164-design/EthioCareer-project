
public class Vacancy {

	private date deadline;
	private Int jobId;
	private String jobTitle;
	private String jobType;
	private String requirement;
	public Application m_Application;

	public Vacancy(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param jobId
	 */
	public void closeJob(Int jobId){

	}

	/**
	 * 
	 * @param jobId
	 * @param jobTitle
	 * @param jobType
	 */
	public Boolean postJob(Int jobId, String jobTitle, String jobType){
		return false;
	}

	public Arraylist <job> viewPost(){
		return null;
	}
}//end Vacancy