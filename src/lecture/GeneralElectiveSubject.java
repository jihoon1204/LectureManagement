package lecture;

import java.util.Scanner;

public class GeneralElectiveSubject extends Lecture {
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
			System.out.print("Does the lecture take in another place except 407? (Y/N) ");
			answer = ques.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Input the Place of Lecture : ");
				String place = ques.nextLine();
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
		String Pname = ques.nextLine();
		this.setPname(Pname);

		System.out.print("Input Professor's Number of Lecture : ");
		String Pnum = ques.nextLine();
		this.setPnum(Pnum);
	} // end of getUserInput()
}
