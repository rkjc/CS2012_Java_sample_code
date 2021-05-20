package finalexam_1;

public class MathCourse extends UniversityCourse {
	
	// attributes
	public enum MathCourseNum {MATH1040, MATH2110, MATH2120, MATH2550};
	
	private MathCourseNum courseNum;
	
	// constructors
	public MathCourse(MathCourseNum courseNumber, String name, double units) {
		super(name, units);
		courseNum = courseNumber;
	}

	// methods
	public MathCourseNum getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(MathCourseNum courseNum) {
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
