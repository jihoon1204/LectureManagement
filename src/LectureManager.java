import java.util.Scanner;

import LectureMangements.Lecture;

public class LectureManager {
	Lecture lecture; // Lecture class의 lecture 객체 생성
	Scanner ques; // Scanner 정의
	
	LectureManager(Scanner ques) {
		this.ques = ques;
	}// end of LectureMager
	
	public void addLecture() {		
		lecture = new Lecture();
		System.out.print("Input Lecture Id : ");
		lecture.id = ques.nextInt();
		
		ques.nextLine();
		System.out.print("Input Lecture Name : ");
		lecture.name = ques.nextLine();

		System.out.print("Input the Day of Lecture : ");
		lecture.day = ques.nextLine();

		System.out.print("Input the Time of Lecture : ");
		lecture.time = ques.nextLine();
	
		System.out.print("Input the Place of Lecture : ");
		lecture.place = ques.nextLine();

		System.out.print("Input Professor's Name of Lecture : ");
		lecture.Pname = ques.nextLine();

		System.out.print("Input Professor's Number of Lecture : ");
		lecture.Pnum = ques.nextLine();
	} // end of addLecutre()
	
	public void deleteLecture() {

		System.out.print("Input Lecture Id : ");
		int LectureId = ques.nextInt();
		if(lecture == null) {
			System.out.println("The lecture has not been registered.");
			return; // null값을 가질때 종료(값이 있는지 체크)
		} // end of if
		if(lecture.id == LectureId) {
			lecture = null;
			System.out.println("The lecture is deleted.");
		} // end of if
	} // end of deleteLecture()
	
	public void editLecture() {
		System.out.print("Input Lecture Id : ");
		int LectureId = ques.nextInt();
		if(lecture.id == LectureId) {
			System.out.println("The student to be edited is "+ LectureId);
		} // end of if
	} // end of editLecture()
	
	public void viewLecture() {
		System.out.print("Input Lecture Id : ");
		ques.nextLine();
		int LectureId = ques.nextInt();
		if(lecture.id == LectureId) {
			lecture.printInfo();
		} // end of if
	} // end of viewLecture
} // end of class