package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.PaymentGateway;

class PaymentGatewayTest {

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
	void testStudentID() {
		PaymentGateway paymentgateway = new PaymentGateway();
		String studentID;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student ID :");
		studentID = sc.nextLine();
		
		String actual =  paymentgateway.StudentID(studentID);
		System.out.println(actual +"\n");
		String expected =("Valid Student ID Number..");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testPaymentID() {
		PaymentGateway paymentgateway = new PaymentGateway();
		String payID;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Payment ID :");
		payID = sc.nextLine();
		
		String actual =  paymentgateway.PaymentID(payID);
		System.out.println(actual +"\n");
		String expected =("Valid Payment ID..");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testCourseName() {
		PaymentGateway paymentgateway = new PaymentGateway();
		String courseName;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Course Name:");
		courseName = sc.nextLine();
		
		String actual =  paymentgateway.CourseName(courseName);
		System.out.println(actual +"\n");
		String expected =("Valid Coursename..");
		
		assertEquals(expected, actual);
	}

	@Test
	void testCourseFee() {
		PaymentGateway paymentgateway = new PaymentGateway();
		String courseFee;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Course Fee:");
		courseFee = sc.nextLine();
		
		String actual =  paymentgateway.CourseFee(courseFee);
		System.out.println(actual +"\n");
		String expected =("Valid Course Fee..");
		
		assertEquals(expected, actual);
	}

	@Test
	void testBankName() {
		PaymentGateway paymentgateway = new PaymentGateway();
		String bankName;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Bank Name:");
		bankName = sc.nextLine();
		
		String actual =  paymentgateway.BankName(bankName);
		System.out.println(actual +"\n");
		String expected =("Valid Bank Name..");
		
		assertEquals(expected, actual);
	}

}
