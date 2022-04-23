package studentRegSystem;

public class CreateProject {
	
	public static String projectStartDate(String pStart) {
		String res;
		if (pStart.equals("12/02/2022")){
			return res = "Project Start Date is valid";
		}else if (pStart.equals("14/02/2022")) {
			return res = "Project Start Date is valid";
		}else if (pStart.equals("15/02/2022")) {
			return res = "Project Start Date is valid";
		}
		else {
			return res = "Project Start Date is invalid.!";
		}
	}
	
	public static String projectEndDate(String pEnd) {
		String res;
		if (pEnd.equals("12/03/2022")){
			return res = "Project End Date is valid";
		}else if (pEnd.equals("14/03/2022")) {
			return res = "Project End Date is valid";
		}else if (pEnd.equals("15/03/2022")) {
			return res = "Project End Date is valid";
		}
		else {
			return res = "Project End Date is invalid.!";
		}
	}
	
	public static String projectName(String projectName) {
		String res;
		if (projectName.equals("Research Project")){
			return res = "Project Name is valid";
		}else if (projectName.equals("ITP Project")) {
			return res = "Project Name is valid";
		}else if (projectName.equals("SQA Project 01")) {
			return res = "Project Name is valid";
		}
		else {
			return res = "Project Name is invalid.!";
		}
	}
	
	public static String projectModuleName(String projectName) {
		String res;
		if (projectName.equals("ITP")){
			return res = "Project Module Name is valid";
		}else if (projectName.equals("IWT")) {
			return res = "Project Module Name is valid";
		}else {
			return res = "Project Module Name is invalid.!";
		}
	}
	
	public static String projectID(String projectName) {
		String res;
		if (projectName.equals("ITP_01")){
			return res = "Project Module ID is valid";
		}else if (projectName.equals("IWT_01")) {
			return res = "Project Module ID is valid";
		}else {
			return res = "Project Module ID is invalid.!";
		}
	}

}
