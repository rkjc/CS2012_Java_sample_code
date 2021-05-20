package finalexam_1;

public abstract class UniversityCourse {

	// attributes
	private double gradePoints;  //on scale of 0.0-4.0
	private double courseUnits;
	private String courseName;
	
	// constructors
	public UniversityCourse(String name, double units) {
		gradePoints = 0.0;
		courseUnits = units;
		courseName = name;
	}
	
	// methods
	public double getGradePoints() {
		return gradePoints;
	}
	public void setGradePoints(double gradePoints) {
		this.gradePoints = gradePoints;
	}
	public double getCourseUnits() {
		return courseUnits;
	}
	public void setCourseUnits(double courseUnits) {
		this.courseUnits = courseUnits;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void getCourseName(String className) {
		this.courseName = className;
	}
	
	@Override
	public abstract String toString();
	
	
}
