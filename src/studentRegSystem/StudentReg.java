package studentRegSystem;

public class StudentReg {
	
	public static String stuName(String sName) {
		String res;
		if (sName.equals("Sandaru")){
			return res = "Student name is valid";
		}else if (sName.equals("Dissanayaka")) {
			return res = "Student name is valid";
		}else {
			return res = "Student name not found.!";
		}
		
	}
	
	public static String studId(String sId) {
		String res;
		if (sId.equals("ST1000")) {
			//System.out.println();
			return res = "Student id is valid";
		}else if (sId.equals("ST2000")) {
			return res = "Student id is valid";
			}
		else {
			return res = "Student id not found.!";
		}
	}
	
	public static String stuAddress(String stuAdd) {
		String res;
		if (stuAdd.equals("241/A High Level Road, 06,Colombo")) {
			return res = "Student address is valid";
		}else if (stuAdd.equals("37, PALLIYAWATTE ROAD, Hendala")) {
			return res = "Student address is valid";
			}
		else {
			return res = "Student address not found.!";
		}
		
	}
	
	public static String stuGen(String stuGen) {
		String res;
		if (stuGen.equals("male")) {
			return res = "Student gender is valid";
		}else if (stuGen.equals("female")) {
			return res = "Student gender is valid";
			}
		else {
			return res = "Student gender is invalid.!";
		}
	}
	
	
	public static String stuNICnum(String nicNum) {
		String res;
		if (nicNum.equals("732130006V")) {
			return res = "Entered NIC number is correct NIC number";
		}else if(nicNum.equals("732140006V")){
			return res = "Entered NIC number is correct NIC number";
		}
		else {
			return res = "NIC number is invalid.!";
		}
	}
	
	public static String stuPhoneNum(String stuNum) {
		String res;
		if (stuNum.equals("0749220099")) {
			return res = "Student contact number is correct";
		}else if (stuNum.equals("0717524299")) {
			return res = "Student contact number is correct";
			}
		else {
			return res = "Student contact number is incorrect.!";
		}
	}
}
