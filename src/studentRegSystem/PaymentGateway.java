package studentRegSystem;

public class PaymentGateway {
	
	public static String StudentID(String sID) {
		String res;
		if (sID.equals("IT19045678")) {
			return res ="Valid Student ID Number..";
			
		}else if (sID.equals("EF19223980")) {
			return res ="Valid Student ID Number..";
		}
		else if (sID.equals("BM19133789")) {
			return res ="Valid Student ID Number..";
		}
		else {
			return res ="Invalid Student ID Number..!";
		}
	}
	
	public static String PaymentID(String PayId) {
		String res;
		if (PayId.equals("p_004")) {
			return res ="Valid Payment ID..";
			
		}else if (PayId.equals("p_090")) {
			return res ="Valid Payment ID..";
		}
		else if (PayId.equals("p_023")) {
			return res ="Valid Payment ID..";
		}
		else {
			return res ="Invalid Payment ID..!";
		}
	}
	
	public static String CourseName(String name) {
		String res;
		if (name.equals("Information Technology")) {
			return res ="Valid Coursename..";
			
		}else if (name.equals("Engineering")) {
			return res ="Valid Coursename..";
		}
		else if (name.equals("Business Management")) {
			return res ="Valid Coursename..";
		}
		else {
			return res ="Invalid Coursename..";
		}
	}
	
	public static String CourseFee(String fee) {
		String res;
		if (fee.equals("Rs.200,000")) {
			return res ="Valid Course Fee..";
			
		}else if (fee.equals("Rs.250,000")) {
			return res ="Valid Course Fee..";
		}
		else if (fee.equals("Rs.300,000")) {
			return res ="Valid Course Fee..";
		}
		else {
			return res ="Invalid Course Fee..!";
		}
	}
	
	public static String BankName(String bankName) {
		String res;
		if (bankName.equals("BOC")) {
			return res ="Valid Bank Name..";
			
		}else if (bankName.equals("Peoples Bank")) {
			return res ="Valid Bank Name..";
		}
		else if (bankName.equals("NTB")) {
			return res ="Valid Bank Name..";
		}
		else {
			return res ="Invalid Bank Name..!";
		}
	}


}
