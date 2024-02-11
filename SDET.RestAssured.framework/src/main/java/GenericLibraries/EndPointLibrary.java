package GenericLibraries;
/**
 * this contain generic method for endpoint 
 * @author ZEESHAN AHMED
 *
 */
public interface EndPointLibrary {
	String createProject = "/addProject";
	String getAllProjects = "/projects";
	String getSingleProject = "/projects/";
	String deleteProject = "/projects/";
	String updateProject = "/projects/";  
}
