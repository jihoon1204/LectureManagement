package lecture;

import java.util.Scanner;

public class ElectiveCourse extends AdditionalLecture{


	public ElectiveCourse(LectureKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner ques) {
		setLectureID(ques);
		setLectureName(ques);
		setLectureDay(ques);
		setLectureTime(ques);
		setLecturePlaceQues(ques);
		setLecturePname(ques);
		setLecturePnum(ques);
	} // end of getUserInput()


	
	public void printInfo() { // printInfo 함수 생성
		String skind = getKindString();
		System.out.println("kind : " + skind + "\nLecture Id : " + id + "\nLecture name : " + name + "\nLecture day : "
				+ day + "\nLecture time : " + time + "\nOther Lecture place (except 407) : " + place
				+ "\nProfessor Name : " + Pname + "\nProfessor Number : " + Pnum);
	} // end of printInfo
	
	public String getKindString() {
		String skind = "none";
		switch (this.kind) {
		case CoreCourse:
			skind = "Major";
			break;
		case ElectiveCourse:
			skind = "Elective";
			break;
		case SelectiveMajorCourse:
			skind = "Selective";
		default:
		}
		return skind;
	} // end of getKindString

} // end of GeneralElectiveSubject Class
