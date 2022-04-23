package studentManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import studentRegSystem.GenerateCourse;


class CourseInformationTest {

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
	void testGenerateCourse() {
		GenerateCourse generateCourse = new GenerateCourse();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course :");
		name = scanner.nextLine();
		
		String Actual = GenerateCourse.generateCourse(name);
		System.out.println(Actual + "\n");
		String expected = ("Generate Course is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testCourseID() {
		GenerateCourse generateCourse = new GenerateCourse();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course ID :");
		name = scanner.nextLine();
		
		String Actual = GenerateCourse.courseID(name);
		System.out.println(Actual + "\n");
		String expected = ("Course ID is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testCourseFee() {
		GenerateCourse generateCourse = new GenerateCourse();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course Fee :");
		name = scanner.nextLine();
		
		String Actual = GenerateCourse.courseFee(name);
		System.out.println(Actual + "\n");
		String expected = ("Course fee is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testDepartment() {
		GenerateCourse generateCourse = new GenerateCourse();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Department name :");
		name = scanner.nextLine();
		
		String Actual = GenerateCourse.department(name);
		System.out.println(Actual + "\n");
		String expected = ("Department Name is valid");
		
		assertEquals(expected,Actual);
	}
	
	@Test
	void testDuration() {
		GenerateCourse generateCourse = new GenerateCourse();
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course duration :");
		name = scanner.nextLine();
		
		String Actual = GenerateCourse.courseDuration(name);
		System.out.println(Actual + "\n");
		String expected = ("Course duration is valid");
		
		assertEquals(expected,Actual);
	}

}
