package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.LecturerReg;
import studentRegSystem.StudentReg;

class StudentInformationTest {

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
	void testStuId() {
		StudentReg studentReg = new StudentReg();
		String stuId;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student ID :");
		stuId = scanner.nextLine();
		
		String Actual = studentReg.studId(stuId);
		System.out.println(Actual + "\n");
		String expected = ("Student id is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testStuName() {
		StudentReg studentReg = new StudentReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		name = scanner.nextLine();
		
		String Actual = studentReg.stuName(name);
		System.out.println(Actual + "\n");
		String expected = ("Student name is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testStuAddress() {
		StudentReg studentReg = new StudentReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Address :");
		name = scanner.nextLine();
		
		String Actual = studentReg.stuAddress(name);
		System.out.println(Actual + "\n");
		String expected = ("Student address is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testStuGen() {
		StudentReg studentReg = new StudentReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Gender :");
		name = scanner.nextLine();
		
		String Actual = studentReg.stuGen(name);
		System.out.println(Actual + "\n");
		String expected = ("Student gender is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testStuNICnum() {
		StudentReg studentReg = new StudentReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student NIC number :");
		name = scanner.nextLine();
		
		String Actual = studentReg.stuGen(name);
		System.out.println(Actual + "\n");
		String expected = ("Entered NIC number is correct NIC number");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testStuPhonenum() {
		StudentReg studentReg = new StudentReg();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student phone number :");
		name = scanner.nextLine();
		
		String Actual = studentReg.stuPhoneNum(name);
		System.out.println(Actual + "\n");
		String expected = ("Student contact number is correct");
		
		assertEquals(expected,Actual);
	}
	

}
