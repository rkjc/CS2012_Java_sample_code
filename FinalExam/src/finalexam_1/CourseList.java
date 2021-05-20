package finalexam_1;

import java.util.ArrayList;

public class CourseList {

	// attributes
	private ArrayList<UniversityCourse> courseList;
	
	// constructors
	public CourseList() {
		courseList = new ArrayList<>();
	}
	
	// methods
	public ArrayList<UniversityCourse> getCourseList() {
		return courseList;
	}
	
	public double getCumulativeGPA() {
		double cumePoints = 0;
		double cumUnits = 0;	
		for (UniversityCourse course : courseList) {
				cumePoints += course.getGradePoints() * course.getCourseUnits();
				cumUnits += course.getCourseUnits();
		}
		double gpaVal = cumePoints/cumUnits;
		double gpaRoundOff = (double) Math.round(gpaVal * 100) / 100; // optional
		return gpaRoundOff;
	}
	
}
