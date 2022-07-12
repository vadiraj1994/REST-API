package projectLibrary;

public class ProjectLibrary
{
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	
    
	public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {
	
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
  public ProjectLibrary()
  {
	  
  }


	public String getCreatedBy() {
		return createdBy;
	}



	public String getProjectName() {
		return projectName;
	}



	public String getStatus() {
		return status;
	}



	public int getTeamSize() {
		return teamSize;
	}
	
}
