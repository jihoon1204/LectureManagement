package lecture;

import java.util.Scanner;

public class SelectiveMajorSubject extends Lecture {
	
	public SelectiveMajorSubject(LectureKind kind) {
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

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Does the lecture take in 407? (Y/N) ");
			answer = ques.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Input the Place of Lecture : ");
				String place = ques.next();
				ques.nextLine();
				this.setPlace(place);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setPlace(" ");
				break;
			} else {
			} // end of if-else
		} // end of while

		System.out.print("Input Professor's Name of Lecture : ");
		String Pname = ques.next();
		this.setPname(Pname);
		Pname = ques.next();
//		ques.next();
		System.out.print("Input Professor's Number of Lecture : ");
		String Pnum = ques.next();
		this.setPnum(Pnum);
	} // end of getUserInput()
}
