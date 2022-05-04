import java.util.ArrayList;
import java.util.Scanner;

import lecture.LectureKind;
import lecture.Lecture;
import lecture.LectureInput;
import lecture.CoreCourse;
import lecture.ElectiveCourse;
import lecture.SelectiveMajorCourse;

public class LectureManager {
	ArrayList<LectureInput> lectures = new ArrayList<LectureInput>(); // Lecture class�� lecture ��ü ����
	Scanner ques; // Scanner ����

	LectureManager(Scanner ques) {
		this.ques = ques;
	}// end of LectureMager

	public void addLecture() {
		LectureInput lectureInput;
		int kind = 0;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Major_Course");
			System.out.println("2 for Selective_Major_Course");
			System.out.println("3 for Elective_Course");
			System.out.print("Select Lecture Kind 1 to 3 : ");
			kind = ques.nextInt();
			if (kind == 1) {
				lectureInput = new CoreCourse(LectureKind.CoreCourse); // ArrayList Lectures ����
				lectureInput.getUserInput(ques);
				lectures.add(lectureInput); // lectures�迭 ��Ͽ� ���� �߰� 
				break;
			} else if (kind == 2) {
				lectureInput = new SelectiveMajorCourse(LectureKind.SelectiveMajorCourse);
				lectureInput.getUserInput(ques);
				lectures.add(lectureInput); // lectures�迭 ��Ͽ� ���� �߰� 
				break;
			} else if (kind == 3) {
				lectureInput = new ElectiveCourse(LectureKind.ElectiveCourse);
				lectureInput.getUserInput(ques);
				lectures.add(lectureInput);
				break;
			} else {
				System.out.print("Select Lecture Kind between 1 and 3 : ");
			} // end of if-else
		} // end of while
	} // end of addLecutre()

	public void deleteLecture() {

		System.out.print("Input Lecture Id : ");
		int LectureId = ques.nextInt();
		int index = -1; // index ���� ���� 

		for (int i = 0; i < lectures.size(); i++) { // ArrayList�� ���� null���� ã�� �ݺ��� ���� 
			if (lectures.get(i).getId() == LectureId) { // �ݺ����� if���� ����� ������ index�� ��ġ ã��
				index = i;
				break;
			} // end of if
		} // end of for

		if (index >= 0) {
			lectures.remove(index); // lectures�� index�� ���� �����ϴ� �Լ�
			System.out.println("The lecture(" + LectureId + ") is deleted.");
		} // end of if

		else { // lecture�� ���� ���������� 
			System.out.println("the lecture has not been registered");
			return;
		} // end of else
	} // end of deleteLecture()

	public void editLecture() {
		System.out.print("Input Lecture Id : ");
		int lectureId = ques.nextInt();
		for (int i = 0; i < lectures.size(); i++) {
			LectureInput lectureInput = lectures.get(i);
			if (lectureInput.getId() == lectureId) {
				int num = -1;
				while (num != 8) {
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
					num = ques.nextInt();
					if (num == 1) {
						System.out.println("Lecture ID:");
						int id = ques.nextInt();
						lectureInput.setId(id);
					} // end of if
					else if (num == 2) {
						System.out.println("Lecture Name:");
						String name = ques.next();
						lectureInput.setName(name);
					} // end of else if
					else if (num == 3) {
						System.out.println("Lecture Day:");
						String day = ques.next();
						lectureInput.setDay(day);
					} // end of else if
					else if (num == 4) {
						System.out.println("Lecture Time:");
						String time = ques.next();
						lectureInput.setTime(time);
					} // end of else if
					else if (num == 5) {
						System.out.println("Lecture Place:");
						String place = ques.next();
						lectureInput.setPlace(place);
					} // end of else if
					else if (num == 6) {
						System.out.println("Lecture PName:");
						String Pname = ques.next();
						lectureInput.setPname(Pname);
					} // end of else if
					else if (num == 7) {
						System.out.println("Lecture Pnum:");
						String Pnum = ques.next();
						lectureInput.setPnum(Pnum);
					} // end of else if
					else {
						continue;
					} // end of if
				} // end of while
				break;
			} // end of if
		} // end of for
	} // end of editLecture()

	public void viewLectures() {
		for (int i = 0; i < lectures.size(); i++) { // for���� �̿��� lectures get �Լ� ��� 
			lectures.get(i).printInfo(); // �� ��ü�� ���� ���
		} // end of for
	} // end of viewLecture
} // end of class