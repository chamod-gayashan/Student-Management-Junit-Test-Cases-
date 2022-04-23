package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.FacultyInformation;

class FacultyInformationTest {

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
	void testFacultyName() {
		FacultyInformation facInfo = new FacultyInformation();
		String facName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Faculty name:");
		facName = sc.nextLine();
		
		String actual = facInfo.FacultyName(facName);
		System.out.println(actual +"\n");
		String expected = ("valid Faculty Name..");
		
		assertEquals(expected,actual);
	}

	@Test
	void testFacultyID() {
		FacultyInformation facInfo = new FacultyInformation();
		String facID;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Faculty ID:");
		facID = sc.nextLine();
		
		String actual = facInfo.FacultyID(facID);
		System.out.println(actual +"\n");
		String expected = ("valid Faculty ID..");
		
		assertEquals(expected,actual);

	}

	@Test
	void testNamesOfFacultyHead() {
		FacultyInformation facInfo = new FacultyInformation();
		String headName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the Faculty's Head Name:");
		headName = sc.nextLine();
		
		String actual = facInfo.namesOfFacultyHead(headName);
		System.out.println(actual +"\n");
		String expected = ("valid Faculty Head Name..");
		
		assertEquals(expected,actual);
	}

	@Test
	void testNoOfStudentsInFaculty() {
		FacultyInformation facInfo = new FacultyInformation();
		String NoOfStudents;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the count of students per faculty:");
		NoOfStudents = sc.nextLine();
		
		String actual = facInfo.NoOfStudentsInFaculty(NoOfStudents);
		System.out.println(actual +"\n");
		String expected = ("valid Count of Faculty students..");
		
		assertEquals(expected,actual);
	}

	@Test
	void testNoOfLecturersInFaculty() {
		FacultyInformation facInfo = new FacultyInformation();
		String NoOfLecturers;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the count of lecurers per faculty:");
		NoOfLecturers = sc.nextLine();
		
		String actual = facInfo.NoOfLecturersInFaculty(NoOfLecturers);
		System.out.println(actual +"\n");
		String expected = ("valid Count of Faculty Lecturers..");
		
		assertEquals(expected,actual);
	}

}
