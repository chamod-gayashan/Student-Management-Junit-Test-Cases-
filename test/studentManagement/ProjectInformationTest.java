package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.CreateProject;
import studentRegSystem.LecturerReg;

class ProjectInformationTest {

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
	void testProjectStartDate() {
		CreateProject createProject = new CreateProject();
		String date;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project Start Date :");
		date = scanner.nextLine();
		
		String Actual = createProject.projectStartDate(date);
		System.out.println(Actual + "\n");
		String expected = ("Project Start Date is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testProjectEndDate() {
		CreateProject createProject = new CreateProject();
		String date;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project End Date :");
		date = scanner.nextLine();
		
		String Actual = createProject.projectEndDate(date);
		System.out.println(Actual + "\n");
		String expected = ("Project End Date is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testProjectName() {
		CreateProject createProject = new CreateProject();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project Name :");
		name = scanner.nextLine();
		
		String Actual = createProject.projectName(name);
		System.out.println(Actual + "\n");
		String expected = ("Project Name is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testProjectModuleName() {
		CreateProject createProject = new CreateProject();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project Module Name :");
		name = scanner.nextLine();
		
		String Actual = createProject.projectModuleName(name);
		System.out.println(Actual + "\n");
		String expected = ("Project Module Name is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testProjectModuleID() {
		CreateProject createProject = new CreateProject();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project Module ID :");
		name = scanner.nextLine();
		
		String Actual = createProject.projectID(name);
		System.out.println(Actual + "\n");
		String expected = ("Project Module ID is valid");
		
		assertEquals(expected,Actual);
	}
	
	

}
