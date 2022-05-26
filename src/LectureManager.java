import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import lecture.LectureKind;
import lecture.LectureInput;
import lecture.CoreCourse;
import lecture.ElectiveCourse;
import lecture.SelectiveMajorCourse;

public class LectureManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1193343822948840007L;

	ArrayList<LectureInput> lectures = new ArrayList<LectureInput>(); // Lecture class의 lecture 객체 생성
	transient Scanner ques; // Scanner 정의

	LectureManager(Scanner ques) {
		this.ques = ques;
	}// end of LectureMager

	public void addLecture() {
		LectureInput lectureInput;
		int kind = 0;
		while (kind != 1 && kind != 2 && kind != 3) {
			try {

				System.out.println("1 for Major_Course");
				System.out.println("2 for Selective_Major_Course");
				System.out.println("3 for Elective_Course");
				System.out.print("Select Lecture Kind 1 to 3 : ");
				kind = ques.nextInt();
				if (kind == 1) {
					lectureInput = new CoreCourse(LectureKind.CoreCourse); // ArrayList Lectures 생성
					lectureInput.getUserInput(ques);
					lectures.add(lectureInput); // lectures배열 목록에 정보 추가
					break;
				} else if (kind == 2) {
					lectureInput = new SelectiveMajorCourse(LectureKind.SelectiveMajorCourse);
					lectureInput.getUserInput(ques);
					lectures.add(lectureInput); // lectures배열 목록에 정보 추가
					break;
				} else if (kind == 3) {
					lectureInput = new ElectiveCourse(LectureKind.ElectiveCourse);
					lectureInput.getUserInput(ques);
					lectures.add(lectureInput);
					break;
				} else {
					System.out.print("Select Lecture Kind between 1 and 3 : ");
				} // end of if-else
			} // end of try
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3! ");
				if (ques.hasNext()) {
					ques.next();
					kind = -1;
				} // end of if
			} // end of catch
		} // end of while
	} // end of addLecutre

	public void deleteLecture() {

		System.out.print("Input Lecture Id : ");
		int LectureId = ques.nextInt();
		int index = findIndex(LectureId);
		removefromLecture(index, LectureId);
	} // end of deleteLecture

	public int findIndex(int LectureId) {
		int index = -1; // index 변수 정의
		for (int i = 0; i < lectures.size(); i++) { // ArrayList에 대한 null값을 찾는 반복문 생성
			if (lectures.get(i).getId() == LectureId) { // 반복문과 if문을 사용한 동일한 index의 위치 찾기
				index = i;
				break;
			} // end of if
		} // end of for
		return index;
	} // end of findIndex

	public int removefromLecture(int index, int LectureId) {
		if (index >= 0) {
			lectures.remove(index); // lectures의 index의 값을 삭제하는 함수
			System.out.println("The lecture(" + LectureId + ") is deleted.");
			return 1;
		} // end of if
		else { // lecture의 값이 남아있을때
			System.out.println("the lecture has not been registered");
			return -1;
		} // end of else
	} // end of removefromLecture

	public void editLecture() {
		System.out.print("Input Lecture Id : ");
		int lectureId = ques.nextInt();
		for (int i = 0; i < lectures.size(); i++) {
			LectureInput lectureInput = lectures.get(i);
			if (lectureInput.getId() == lectureId) {
				int num = -1;
				while (num != 8) {
					showEditMenu();
					num = ques.nextInt();
					switch (num) {
					case 1:
						lectureInput.setLectureID(ques);
						break;
					case 2:
						lectureInput.setLectureName(ques);
						break;
					case 3:
						lectureInput.setLectureDay(ques);
						break;
					case 4:
						lectureInput.setLectureTime(ques);
						break;
					case 5:
						lectureInput.setLecturePlace(ques);
						break;
					case 6:
						lectureInput.setLecturePname(ques);
						break;
					case 7:
						lectureInput.setLecturePnum(ques);
						break;
					default:
						continue;
					} // end of switch
				} // end of while
				break;
			} // end of if
		} // end of for
	} // end of editLecture

	public void viewLectures() {
		for (int i = 0; i < lectures.size(); i++) { // for문을 이용한 lectures get 함수 출력
			lectures.get(i).printInfo(); // 그 객체의 정보 출력
		} // end of for
	} // end of viewLecture

	public void showEditMenu() {
		System.out.print("MENU\n");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Day");
		System.out.println("4. View Time");
		System.out.println("5. Edit Place");
		System.out.println("6. Edit PName");
		System.out.println("7. Edit PNum");
		System.out.println("8. Exit");
		System.out.print("Select one number between 1 - 8 : ");
	}
} // end of class