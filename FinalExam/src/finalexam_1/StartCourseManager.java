package finalexam_1;

import java.util.Scanner;

import finalexam_1.CSCourse.CSCourseNum;
import finalexam_1.MathCourse.MathCourseNum;

public class StartCourseManager {

	public static void main(String[] args) {
		System.out.println("To enter data and print out my University Course data");

		// Make 2 CSCourse objects and fill out the attributes, EXCEPT leave the
		// gradePoints at it's default of 0.0.
		CSCourse course_1 = new CSCourse(CSCourseNum.CS2011, "Java Programming I", 4);
		CSCourse course_2 = new CSCourse(CSCourseNum.CS2012, "Java Programming II", 4);
		CSCourse course_3 = new CSCourse(CSCourseNum.CS2470, "Cybersecurity", 3);

		// Make 2 MathCourse  objects and fill out the attributes, EXCEPT leave
		// the gradePoints at it's default of 0.0.
		MathCourse course_4 = new MathCourse(MathCourseNum.MATH2110, "Calculus I", 5);
		MathCourse course_5 = new MathCourse(MathCourseNum.MATH2120, "Calculus II", 5);
		MathCourse course_6 = new MathCourse(MathCourseNum.MATH2550, "Linear Algebra", 3);

		// Make a CourseList object.
		CourseList courseList = new CourseList();

		// Add all the courses to the courseList.
		courseList.getCourseList().add(course_1);
		courseList.getCourseList().add(course_2);
		courseList.getCourseList().add(course_3);
		courseList.getCourseList().add(course_4);
		courseList.getCourseList().add(course_5);
		courseList.getCourseList().add(course_6);

		
		// get the number of items in the list of courses 
		int numberItems = courseList.getCourseList().size();

		// loop through the list of courses and set the grades for each course
		Scanner userinput = new Scanner(System.in);
		double tempGrade = 0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Course Number,\tCourse Name,\t\tCourse Units,\tGrade Points");
			// get the next course object in the list
			UniversityCourse tempItem = courseList.getCourseList().get(item);
			// display Course info
			System.out.println(tempItem.toString());

			// input the grade value
			System.out.print("\nEnter a grade of 0.0 to 4.0 for the above course: "); 
			tempGrade = userinput.nextDouble(); // just going to trust the user for good input values
			
			// set the grade value for the course
			tempItem.setGradePoints(tempGrade);

			//increment for next loop
			item += 1;
		}
		// clean up resources
		userinput.close();

		
		// display all of the courses together one last time
		System.out.println("-----------------------------------------------------");
		System.out.println("Course Number,\tCourse Name,\t\tCourse Units,\tGrade Points");
		for (int i = 0; i < numberItems; i++) {
			// display University Course info item
			System.out.println(courseList.getCourseList().get(i).toString());
		}
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Cumulative GPA: " + courseList.getCumulativeGPA());

		System.out.println("-----------------------------------------------------");
	}

}
