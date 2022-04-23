package studentRegSystem;

public class LecturerReg {
	
	public static String lecName(String lName) {
		String res;
		if (lName.equals("Ruwan")) {
			return res = "Lecture Name is valid";
		}else if (lName.equals("Dissanayaka")) {
			return res = "Lecture name is valid";
		}else {
			return res = "Lecture name not found.!";
		}
		
	}
	
	public static String LecID(String lId) {
		String res;
		if (lId.equals("LE1000")) {
			//System.out.println();
			return res = "Lecturer id is valid";
		}else if (lId.equals("LE2000")) {
			return res = "Lecturer id is valid";
			}
		else {
			return res = "Lecturer id not found.!";
		}
	}
	
	public static String LecGen(String LecGen) {
		String res;
		if (LecGen.equals("male")) {
			return res = "Lecturer gender is valid";
		}else if (LecGen.equals("female")) {
			return res = "Lecturer gender is valid";
			}
		else {
			return res = "Lecturer gender is invalid.!";
		}
	}
	
	public static String lecAddress(String lecAdd) {
		String res;
		if (lecAdd.equals("Kandy road,Colombo")) {
			return res = "Lecturer address is valid";
		}else if (lecAdd.equals("Pallidora road, Dehiwala")) {
			return res = "Lecturer address is valid";
			}
		else {
			return res = "Lecturer address not found.!";
		}
		
	}
	
	public static String lecPhoneNum(String lecCnum) {
		String res;
		if (lecCnum.equals("0719220099")) {
			
			return res = "Lecturer contact Number is correct";
		}else if (lecCnum.equals("0727224299")) {
			return res = "Lecturer contact Number is correct";
			}
		else {
			return res = "Lecturer contact Number is incorrect.!";
		}
	}
	
	public static String lecSalary(String lecSal) {
		String res;
		if (lecSal.equals("100000")) {
			return res = "Salaray match registered lecturers";
		}else {
			return res = "Salaray not match registered lecturers.!";
		}
	}
	
	

}
