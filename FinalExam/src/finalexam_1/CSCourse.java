package finalexam_1;

public class CSCourse extends UniversityCourse {
	// attributes
	public enum CSCourseNum {CS1010, CS2011, CS2012, CS2013, CS2470};
	
	private CSCourseNum courseNum;

	// constructors
	public CSCourse(CSCourseNum courseNumber, String name, double units) {
		super(name, units);
		courseNum = courseNumber;
	}
	
	// methods
	public CSCourseNum getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(CSCourseNum courseNum) {
		this.courseNum = courseNum;
	}

	@Override
	public String toString() {
		String cNum = this.courseNum.toString();
		String blank15 = "               ";
		String padNum = cNum  + blank15.substring(0, 15 - cNum.length());
		String cName = super.getCourseName();
		String blank22 = "                      ";
		String padName = cName  + blank22.substring(0, 22 - cName.length());
		String tempStr = padNum  + "\t" + padName + "\t" + super.getCourseUnits()  + "\t\t" + super.getGradePoints();
 		return tempStr;
	}	
	
//	@Override
//	public String toString() {
//		return this.courseNum.toString()  + ", " + super.getCourseName() + ", " + super.getCourseUnits()  + ", " + super.getGradePoints();
//	}	
	
}
