package studentRegSystem;

public class GenerateCourse {
	
	public static String generateCourse(String cName) {
		String res;
		if (cName.equals("Information Communication Technology")){
			return res = "Generate Course is valid";
		}else if (cName.equals("Business Management")) {
			return res = "Generate Course is valid";
		}else if (cName.equals("Mechanical Engineering")) {
			return res = "Generate Course is valid";
		}
		else {
			return res = "Generate Course is not valid.!";
		}
	}
	
	public static String courseID(String cID) {
		String res;
		if (cID.equals("IT001")){
			return res = "Course ID is valid";
		}else if (cID.equals("BM001")) {
			return res = "Course ID is valid";
		}else if (cID.equals("LAW001")) {
			return res = "Course ID is valid";
		}
		else {
			return res = "Course ID is not valid.!";
		}
	}
	
	public static String courseFee(String cFee) {
		String res;
		if (cFee.equals("100,000")){
			return res = "Course fee is valid";
		}else if (cFee.equals("200,000")) {
			return res = "Course fee is valid";
		}
		else {
			return res = "Course fee is not valid.!";
		}
	}
	
	public static String department(String deparName) {
		String res;
		if (deparName.equals("Faculty of Computing")){
			return res = "Department Name is valid";
		}else if (deparName.equals("Faculty of Business Management")) {
			return res = "Department Name is valid";
		}
		else if (deparName.equals("Faculty of Engineering")) {
			return res = "Department Name is valid";
		}
		else {
			return res = "Department Name is not valid.!";
		}
	}
	
	public static String courseDuration(String cDuration) {
		String res;
		if (cDuration.equals("4 years")){
			return res = "Course duration is valid";
		}else if (cDuration.equals("3 years")) {
			return res = "Course duration is valid";
		}
		else {
			return res = "Course duration is not valid.!";
		}
	}
}
