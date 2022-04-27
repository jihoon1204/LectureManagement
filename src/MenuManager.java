import java.util.Scanner;

//import LectureManagements.LectureManager;

public class MenuManager {
	public static void main(String[] args) {		
		Scanner ques = new Scanner(System.in);
		LectureManager lecturemanager = new LectureManager(ques);
		
		int select_menu = 0;

		while(select_menu != 5) {
			System.out.print("MENU\n");
			System.out.println("1. Add Lecture");
			System.out.println("2. Delete Lecture");
			System.out.println("3. Edit Lecture");
			System.out.println("4. View Lectures");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
			select_menu = ques.nextInt();
				
			if(select_menu == 1) {
				lecturemanager.addLecture();
			} // end of if
			else if(select_menu == 2) {
				lecturemanager.deleteLecture();
			} // end of else if
			else if(select_menu == 3) {
				lecturemanager.editLecture();
			} // end of else if
			else if(select_menu == 4) {
				lecturemanager.viewLectures();
			} // end of else if
			else {
				continue;
			} // end of else
		} // end of while 
	} // end of void
} // end of class
