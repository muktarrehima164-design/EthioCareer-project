
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
		// Getter and Setter
		public String getEducation(){
			return education;
		}
		public void setEducation(String education){
			this.education = education;
		}
		public String getexperince(){
			return experince;
		}
		public void setExperince(String experince){
			this.experince = experince;
		}
        public String getLocation(){
			return location;
		}
         public void setLocation(String experince){
			this.location = location;
		}

}
//end Job sekeer