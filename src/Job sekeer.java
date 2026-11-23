
public class Job sekeer extends User {

	private String education;
	private String experince;
	private String location;
	public Application m_Application;
	public Employer m_Employer;
	public Cv m_Cv;

	public Job sekeer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param jobID
	 * @param jobType
	 */
	public Boolean applyJob(Int jobID, String jobType){
		return false;
	}

	/**
	 * 
	 * @param jobId
	 * @param jobTitle
	 */
	public ArrayList <job list> searchJob(Int jobId, String jobTitle){
		return null;
	}

	/**
	 * 
	 * @param fileName
	 */
	public Boolean uploadCv(String fileName){
		return false;
	}

	public ArrayList <Application> viewApplication(){
		return null;
		}
		
	}
//end Job sekeer