package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.StudentShuttleService;

class StudentShuttleServiceTest {

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
	void testBusLicenseNumber() {
		StudentShuttleService shuttleService = new StudentShuttleService();
		String LicenseNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus License Number:");
		LicenseNum = sc.nextLine();
		
		String actual = shuttleService.busLicenseNumber(LicenseNum);
		System.out.println(actual +"\n");
		String expected =("valid Bus License Number..");
		
		assertEquals(expected, actual);
	}

	@Test
	void testBusRouteNumber() {
		StudentShuttleService shuttleService = new StudentShuttleService();
		String routeNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus Route Number:");
		routeNum = sc.nextLine();
		
		String actual = shuttleService.busRouteNumber(routeNum);
		System.out.println(actual +"\n");
		String expected =("valid Bus Route Number..");

		assertEquals(expected, actual);
	}

	@Test
	void testBusRouteName() {
		StudentShuttleService shuttleService = new StudentShuttleService();
		String routeName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus Route Name:");
		routeName = sc.nextLine();
		
		String actual = shuttleService.busRouteName(routeName);
		System.out.println(actual +"\n");
		String expected =("valid Bus Route Name..");

		assertEquals(expected, actual);
	}

	@Test
	void testBusTicketPrice() {
		StudentShuttleService shuttleService = new StudentShuttleService();
		String ticketPrice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus Ticket Price:");
		ticketPrice = sc.nextLine();
		
		String actual = shuttleService.busTicketPrice(ticketPrice);
		System.out.println(actual +"\n");
		String expected =("valid Bus Ticket Price..");

		assertEquals(expected, actual);
	}

	@Test
	void testBusStartTime() {
		StudentShuttleService shuttleService = new StudentShuttleService();
		String startTime;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bus Start time:");
		startTime = sc.nextLine();
		
		String actual = shuttleService.busStartTime(startTime);
		System.out.println(actual +"\n");
		String expected =("valid Bus route start Time..");

		assertEquals(expected, actual);
	}

}
