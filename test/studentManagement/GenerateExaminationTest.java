package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.GenerateExamination;

class GenerateExaminationTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testExamCategory() {
		GenerateExamination generateExams = new GenerateExamination();
		String category;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the exam category:");
		category = sc.nextLine();
		
		String actual = generateExams.examCategory(category);
		System.out.println(actual +"\n");
		String expected = ("Valid Exam Category..");
		
		assertEquals(expected,actual);
		
	}

	@Test
	void testExamModuleCode() {
		GenerateExamination generateExams = new GenerateExamination();
		String code;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Module Code:");
		code = sc.nextLine();
		
		String actual = generateExams.examModuleCode(code);
		System.out.println(actual +"\n");
		String expected = ("Valid Exam Module Code..");
		
		assertEquals(expected,actual);
	}

	@Test
	void testExamModuleName() {
		GenerateExamination generateExams = new GenerateExamination();
		String moduleName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Module Name:");
		moduleName = sc.nextLine();
		
		String actual = generateExams.examModuleName(moduleName);
		System.out.println(actual +"\n");
		String expected =("valid Exam Module Name..");
		
		assertEquals(expected,actual);
		
	}

	@Test
	void testExamTimePeriod() {
		GenerateExamination generateExams = new GenerateExamination();
		String period;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Exam Time Period:");
		period = sc.nextLine();
		
		String actual = generateExams.examTimePeriod(period);
		System.out.println(actual +"\n");
		String expected = ("Valid Exam Time Period..");
		
		assertEquals(expected,actual);
	}

	@Test
	void testExamModulePassMark() {
		GenerateExamination generateExams = new GenerateExamination();
		String passmark;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Module Pass Mark:");
		passmark = sc.nextLine();
		
		String actual = generateExams.examModulePassMark(passmark);
		System.out.println(actual +"\n");
		String expected = ("Valid Module Pass Mark..");
		
		assertEquals(expected,actual);
	}

}
