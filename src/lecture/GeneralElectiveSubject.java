package lecture;

import java.util.Scanner;

public class GeneralElectiveSubject extends Lecture {
	
	
	protected String anotherPlace;
	
	public GeneralElectiveSubject(LectureKind kind) {
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
			System.out.print("Does the lecture take in another place except 407? (Y/N) ");
			answer = ques.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Input the another Place of Lecture : ");
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
		String Pname = ques.nextLine();
		this.setPname(Pname);
		Pname = ques.nextLine();

		System.out.print("Input Professor's Number of Lecture : ");
		String Pnum = ques.nextLine();
		this.setPnum(Pnum);
	} // end of getUserInput()
	
	public void printInfo() { // printInfo �Լ� ����
		String skind = "none";
		switch(this.kind) {
		case MajorSubject:
			skind = "Major";
			break;
		case GeneralElectiveSubject:
			skind = "Elective";
			break; 
		case SelectiveMajorSubject:
			skind = "Selective";
		default:
			
		}
		System.out.println("kind : "+skind+ "Lecture Id : " + id + "\nLecture name : " + name + "\nLecture day : " + day
				+ "\nLecture time : " + time + "\nOther Lecture place (except 407) : " + anotherPlace + "\nProfessor Name : " + Pname
				+ "\nProfessor Number : " + Pnum);
	} // end of printInfo
}
