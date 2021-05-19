package finalexam;

import java.util.Scanner;

public class StartCourseManager {

	public static void main(String[] args) {
		System.out.println("To enter data and print out my University Course data");

		// TODO - Make 3 CSCourse objects and fill out the attributes
		   // EXCEPT - do not set the gradePoints, make sure the constructor sets it to default of 0.0.

		// TODO - Make 3 MathCourse objects and fill out the attributes
		   // EXCEPT - do not set the gradePoints, make sure the constructor sets it to default of 0.0.

		// TODO - Make a CourseList object.

		// TODO - Add all the courses to the courseList.

		
		// get the number of items in the list of courses
		int numberItems = 1; // <-- TODO - actually not '1', fix this

		// loop through the list of courses and set the grades for each course
		Scanner userinput = new Scanner(System.in);
		double tempGrade = 0.0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Course Number,\tCourse Name,\t\tCourse Units,\tGrade Points"); // or whatever format you use
			// TODO - get the next course object in the list
			// something something .get(item)

			// TODO - display Course info
			System.out.println("*your class info goes here*"); // <-- fix this 

			System.out.print("\nEnter a grade of 0.0 to 4.0 for the above course: ");
			
			tempGrade = userinput.nextDouble(); // we are going to assume the user enters valid data
			
			// TODO - set the grade value for the course
			// use the setter to change the grade for the course object

			item += 1; 
		}
		userinput.close(); 

		
		// display all of the courses together one last time
		System.out.println("-----------------------------------------------------");
		System.out.println("Course Number,\tCourse Name,\t\tCourse Units,\tGrade Points");
		for (int i = 0; i < numberItems; i++) {
			// TODO - display University Course info item
			System.out.println("*your class info goes here*");
		}
		System.out.println("-----------------------------------------------------");
		
		// TODO - fix this
		System.out.println("Cumulative GPA: " + "*get the GPA and put it here*");

		System.out.println("-----------------------------------------------------");
	}

}
