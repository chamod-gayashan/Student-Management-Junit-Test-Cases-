package studentRegSystem;

public class FacultyInformation {
	
	public static String FacultyName(String FacName) {
		String res;
		if (FacName.equals("Information Technology")) {
			return res ="valid Faculty Name..";
			
		}else if (FacName.equals("Business Management")) {
			return res ="valid Faculty Name..";
			
		}else if (FacName.equals("Engineering")) {
			return res ="valid Faculty Name..";
		}
		else if (FacName.equals("Human Resource")) {
			return res ="valid Faculty Name..";
		}
		else {
			return res ="Invalid Faculty Name..!";
		}
	}
	
	public static String FacultyID(String FacID) {
		String res;
		if (FacID.equals("IT_001")) {
			return res ="valid Faculty ID..";
			
		}else if (FacID.equals("BM_002")) {
			return res ="valid Faculty ID..";
			
		}else if (FacID.equals("EF_003")) {
			return res ="valid Faculty ID..";
		}
		else if (FacID.equals("HR_004")) {
			return res ="valid Faculty ID..";
		}
		else {
			return res ="Invalid Faculty ID..!";
		}
	}
	
	
	public static String namesOfFacultyHead(String headName) {
		String res;
		if (headName.equals("Lasantha Perera")) {
			return res ="valid Faculty Head Name..";
			
		}else if (headName.equals("Kamal Perera")) {
			return res ="valid Faculty Head Name..";
		}
		else if (headName.equals("Nimal Rathnayake")) {
			return res ="valid Faculty Head Name..";
		}
		else if (headName.equals("Sunil Dissanayake")) {
			return res ="valid Faculty Head Name..";
		}
		else {
			return res ="Invalid Faculty Head Name..!";
		}
	}
	
	public static String NoOfStudentsInFaculty(String studentsNum) {
		String res;
		if (studentsNum.equals("400 Students")) {
			return res ="valid Count of Faculty students..";
			
		}else if (studentsNum.equals("500 Students")) {
			return res ="valid Count of Faculty students..";
		}
		else if (studentsNum.equals("600 Students")) {
			return res ="valid Count of Faculty students..";
		}
		else if (studentsNum.equals("700 Students")) {
			return res ="valid Count of Faculty students..";
		}
		else {
			return res ="Invalid Count of Faculty students..";
		}
	}
	
	public static String NoOfLecturersInFaculty(String LecNum) {
		String res;
		if (LecNum.equals("20 lecturers")) {
			return res ="valid Count of Faculty Lecturers..";
			
		}else if (LecNum.equals("30 lecturers")) {
			return res ="valid Count of Faculty Lecturers..";
		}
		else if (LecNum.equals("10 lecturers")) {
			return res ="valid Count of Faculty Lecturers..";
		}
		else if (LecNum.equals("60 lecturers")) {
			return res ="valid Count of Faculty Lecturers..";
		}
		else {
			return res ="Invalid Count of Faculty Lecturers..";
		}
	}

}
