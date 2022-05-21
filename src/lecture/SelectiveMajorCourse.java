package lecture;

import java.util.Scanner;

import exceptions.PlaceFormatException;

public class SelectiveMajorCourse extends AdditionalLecture {

	public SelectiveMajorCourse(LectureKind kind) {
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

	public void setLecturePlaceQues(Scanner ques) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Does the lecture take in another place except 407? (Y/N) ");
			answer = ques.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					setLecturePlace(ques);
					break;
				} else if (answer == 'n' || answer == 'N') {
					this.setPlace("407동");
					break;
				} else {
				} // end of if-else
			} catch (PlaceFormatException e) {
				System.out.println("Incorrect Place Format. Please include the word '동'.");
			}
		} // end of while
	} // end of setLecturePlaceQues

	public void printInfo() { // printInfo 함수 생성
		String skind = getKindString();
		System.out.println("kind : " + skind + "\nLecture Id : " + id + "\nLecture name : " + name + "\nLecture day : "
				+ day + "\nLecture time : " + time + "\nLecture place : " + place
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
} // end of SelectiveMajorSubject Class
