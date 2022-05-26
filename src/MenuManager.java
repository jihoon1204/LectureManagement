import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner ques = new Scanner(System.in);
		LectureManager lecturemanager = getObject("lecturemanager.ser");
		if (lecturemanager == null) {
			lecturemanager = new LectureManager(ques);
		} else {
			lecturemanager.ques = ques;
		}
		selectMenu(ques, lecturemanager);
		putObject(lecturemanager, "lecturemanager.ser");
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
					logger.log("add a lecture");
					break;
				case 2:
					lecturemanager.deleteLecture();
					logger.log("delete a lecture");
					break;
				case 3:
					lecturemanager.editLecture();
					logger.log("edit a lecture");
					break;
				case 4:
					lecturemanager.viewLectures();
					logger.log("view lectures");
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

	public static LectureManager getObject(String filename) {
		LectureManager lecturemanager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			lecturemanager = (LectureManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return lecturemanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lecturemanager;
	}

	public static LectureManager putObject(LectureManager lecturemanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(lecturemanager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lecturemanager;
	}
} // end of class
