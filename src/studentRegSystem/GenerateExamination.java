package studentRegSystem;

public class GenerateExamination {
	
	public static String examCategory(String category) {
		String res;
		if (category.equals("Mid Exam")) {
			return res ="Valid Exam Category..";
		}else if (category.equals("Final Exam")) {
			return res ="Valid Exam Category..";
		}
		else {
			return res ="Invalid Exam Category..!";
		}
	}
	
	
	public static String examModuleCode(String ModuleCode) {
		String res;
		if (ModuleCode.equals("IT1030")) {
			return res ="Valid Exam Module Code..";
		}else if (ModuleCode.equals("IT2030")) {
			return res ="Valid Exam Module Code..";
		}
		else if (ModuleCode.equals("IT3030")) {
			return res="Valid Exam Module Code..";
		}
		else if (ModuleCode.equals("IT4030")) {
			return res="Valid Exam Module Code..";
		}
		else {
			return res ="Invalid Exam Module Code..!!";
		}
	}
	
	public static String examModuleName(String MdouleName) {
		String res;
		if (MdouleName.equals("SQA")) {
			return res ="valid Exam Module Name..";
		}
		else if (MdouleName.equals("ITPM")) {
			return res ="valid Exam Module Name..";
		}
		else if (MdouleName.equals("DBMS")) {
			return res ="valid Exam Module Name..";
		}
		else if (MdouleName.equals("PAF")) {
			return res ="valid Exam Module Name..";
		}
		else {
			return res ="Invalid Exam Module Name..!";
		}
	}
	
	public static String examTimePeriod(String period) {
		String res;
		if (period.equals("1 hour")) {
			return res ="Valid Exam Time Period..";
		}
		else if (period.equals("2 hour")) {
			return res ="Valid Exam Time Period..";
		}
		else if (period.equals("3 hour")) {
			return res ="Valid Exam Time Period..";
		}
		else {
			return res ="Invalid Exam Time Period..!";
		}
	}
	
	public static String examModulePassMark(String ModulePassMark) {
		String res;
		if (ModulePassMark.equals("45")) {
			return res ="Valid Module Pass Mark..";
		}
		else {
			return res ="Invalid Module Pass mark..!";
		}
	}
	
	

}
