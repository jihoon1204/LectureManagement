package lecture;

import java.util.Scanner;

public class CoreCourse extends Lecture implements LectureInput{
	
	public CoreCourse(LectureKind kind) {
		super(kind);
	}

	
	public void getUserInput(Scanner ques) {
		System.out.print("Input Lecture Id : ");
		int id = ques.nextInt();
		this.setId(id);

		ques.nextLine();
		System.out.print("Input Lecture Name : ");
		String name = ques.nextLine();
		this.setName(name);

		System.out.print("Input the Day of Lecture : ");
		String day = ques.nextLine();
		this.setDay(day);

		System.out.print("Input the Time of Lecture : ");
		String time = ques.nextLine();
		this.setTime(time);

		System.out.print("Input the Place of Lecture : ");
		String place = ques.nextLine();
		this.setPlace(place);

		System.out.print("Input Professor's Name of Lecture : ");
		String Pname = ques.nextLine();
		this.setPname(Pname);

		System.out.print("Input Professor's Number of Lecture : ");
		String Pnum = ques.nextLine();
		this.setPnum(Pnum);
	} // end of getUserInput()
	
	public void printInfo() { // printInfo 함수 생성
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
		System.out.println("kind : " + skind + "Lecture Id : " + id + "\nLecture name : " + name + "\nLecture day : "
				+ day + "\nLecture time : " + time + "\nLecture place : " + place + "\nProfessor Name : " + Pname
				+ "\nProfessor Number : " + Pnum);
	} // end of printInfo
}
