import java.util.InputMismatchException;
import java.util.Scanner;

//import LectureManagements.LectureManager;

public class MenuManager {
	public static void main(String[] args) {
		Scanner ques = new Scanner(System.in);
		LectureManager lecturemanager = new LectureManager(ques);

		selectMenu(ques, lecturemanager);
	} // end of void

	public static void selectMenu(Scanner ques, LectureManager lecturemanager) {
		int select_menu = -1;

		while (select_menu != 5) {
			try {
				showMenu();
				select_menu = ques.nextInt();
				switch (select_menu) {
				case 1:
					lecturemanager.addLecture();
					break;
				case 2:
					lecturemanager.deleteLecture();
					break;
				case 3:
					lecturemanager.editLecture();
					break;
				case 4:
					lecturemanager.viewLectures();
					break;
				default:
					continue;
				} // end of switch
			} // end of try
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5! ");
				if (ques.hasNext()) {
					ques.next();
					select_menu = -1;
				} // end of if
			} // end of catch
		} // end of while
	} // end of selectMenu

	public static void showMenu() {
		System.out.print("MENU\n");
		System.out.println("1. Add Lecture");
		System.out.println("2. Delete Lecture");
		System.out.println("3. Edit Lecture");
		System.out.println("4. View Lectures");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	} // end of showMenu
} // end of class
