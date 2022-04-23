package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.LecturerReg;

class LecturerInformationTest {

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
	void testLecName() {
		LecturerReg lecturerReg = new LecturerReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Lecturer Name :");
		name = scanner.nextLine();
		
		String Actual = lecturerReg.lecName(name);
		System.out.println(Actual + "\n");
		String expected = ("Lecture Name is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testLecId() {
		LecturerReg lecturerReg = new LecturerReg();
		String lecId;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lecture ID :");
		lecId = scanner.nextLine();
		
		String Actual = lecturerReg.LecID(lecId);
		System.out.println(Actual + "\n");
		String expected = ("Lecturer id is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testLecAddress() {
		LecturerReg lecturerReg = new LecturerReg();
		String add;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lecture Address :");
		add = scanner.nextLine();
		
		String Actual = lecturerReg.lecAddress(add);
		System.out.println(Actual + "\n");
		String expected = ("Lecturer address is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testPhoneNum() {
		LecturerReg lecturerReg = new LecturerReg();
		String pnum;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lecture Phone Number :");
		pnum = scanner.nextLine();
		
		String Actual = lecturerReg.lecPhoneNum(pnum);
		System.out.println(Actual + "\n");
		String expected = ("Lecturer contact Number is correct");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testLecGen() {
		LecturerReg lecturerReg = new LecturerReg();
		String lGen;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lecture Name :");
		lGen = scanner.nextLine();
		
		String Actual = lecturerReg.LecGen(lGen);
		System.out.println(Actual + "\n");
		String expected = ("Lecturer gender is valid") ;
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testLecSal() {
		LecturerReg lecturerReg = new LecturerReg();
		String LecSal;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Salary Amount :");
		LecSal = scanner.nextLine();
		
		String Actual = lecturerReg.lecSalary(LecSal);
		
		System.out.println(Actual + "\n");
		String expected = ("Salaray match registered lecturers");
		
		assertEquals(expected,Actual);
	}

}
