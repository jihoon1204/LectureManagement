package lecture;

import java.util.Scanner;

import exceptions.PlaceFormatException;

public abstract class AdditionalLecture extends Lecture {

	public AdditionalLecture(LectureKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner ques);

	public void printInfo() { // printInfo 함수 생성
		String skind = getKindString();
		System.out.println("kind : " + skind + "\nLecture Id : " + id + "\nLecture name : " + name + "\nLecture day : "
				+ day + "\nLecture time : " + time + "\nOther Lecture place (except 407) : " + place
				+ "\nProfessor Name : " + Pname + "\nProfessor Number : " + Pnum);
	} // end of printInfo

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
					this.setPlace("");
					break;
				} else {
				} // end of if-else
			} catch (PlaceFormatException e) {
				System.out.println("Incorrect Place Format. Please include the word '동'.");

			}

		} // end of while

	} // end of setLecturePlaceQues
}
