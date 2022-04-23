package studentRegSystem;

public class StudentShuttleService {
	
	public static String busLicenseNumber(String busLicenseNum) {
		String res;
		if (busLicenseNum.equals("ND-6674")) {
			return res ="valid Bus License Number..";
		}else if (busLicenseNum.equals("NB-1442 ")) {
			return res ="valid Bus License Number..";
		}
		else if (busLicenseNum.equals("NC-7745")) {
			return res ="valid Bus License Number..";
		}
		else {
			return res ="Invalid Bus License Number..!";
		}
	}
	
	public static String busRouteNumber(String busRouteNum) {
		String res;
		if (busRouteNum.equals("177")) {
			return res ="valid Bus Route Number..";
		}else if (busRouteNum.equals("228")) {
			return res ="valid Bus Route Number..";
		}
		else if (busRouteNum.equals("190")) {
			return res ="valid Bus Route Number..";
		}
		else {
			return res ="Invalid Bus Route Number..!";
		}
	}
	
	public static String busRouteName(String busRouteName) {
		String res;
		if (busRouteName.equals("Kaduwela-Colombo")) {
			return res ="valid Bus Route Name..";
		}else if (busRouteName.equals("Colombo-Gampaha")) {
			return res ="valid Bus Route Name..";
		}
		else if (busRouteName.equals("Homagama-Malabe")) {
			return res ="valid Bus Route Name..";
		}
		else {
			return res ="Invalid Bus Route Name..!";
		}
	}
	
	public static String busTicketPrice(String busTicketPrice) {
		String res;
		if (busTicketPrice.equals("Rs.100")) {
			return res ="valid Bus Ticket Price..";
		}else if (busTicketPrice.equals("Rs.200")) {
			return res ="valid Bus Ticket Price..";
		}
		else if (busTicketPrice.equals("Rs.300")) {
			return res ="valid Bus Ticket Price..";
		}
		else {
			return res ="Invalid Bus Ticket Price..!";
		}
	}
	
	public static String busStartTime(String busStartTime) {
		String res;
		if (busStartTime.equals("5.00 a.m")) {
			return res ="valid Bus route start Time..";
		}else if (busStartTime.equals("7.00 a.m")) {
			return res ="valid Bus route start Time..";
		}
		else if (busStartTime.equals("9.00 a.m")) {
			return res ="valid Bus route start Time..";
		}
		else {
			return res ="Invalid Bus route start Time..!";
		}
	}

}
