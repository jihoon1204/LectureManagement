package lecture;

import java.util.Scanner;

public class Lecture { // class Lecture에 대한 변수 생성
	Scanner ques;

	protected LectureKind kind = LectureKind.MajorSubject;
	protected int id;
	protected String name;
	protected String day;
	protected String time;
	protected String place;
	protected String Pname;
	protected String Pnum;

	public Lecture() {

	} // end of Lecture

	public Lecture(LectureKind kind) {
		this.kind = kind;
	}

	public Lecture(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Lecture(int id, String name, String day, String time, String place) {
		this.id = id;
		this.name = name;
		this.day = day;
		this.time = time;
		this.place = place;
	}

	public Lecture(int id, String name, String day, String time, String place, String Pname, String Pnum) {
		this.id = id;
		this.name = name;
		this.day = day;
		this.time = time;
		this.place = place;
		this.Pname = Pname;
		this.Pnum = Pnum;
	} // end of Lecture

	public LectureKind getKind() {
		return kind;
	}
	public void setKind(LectureKind kind) {
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPnum() {
		return Pnum;
	}
	public void setPnum(String pnum) {
		Pnum = pnum;
	}
	public void printInfo() { // printInfo 함수 생성
		String skind = "none";
		switch (this.kind) {
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
		System.out.println("kind : " + skind + "Lecture Id : " + id + "\nLecture name : " + name + "\nLecture day : "
				+ day + "\nLecture time : " + time + "\nLecture place : " + place + "\nProfessor Name : " + Pname
				+ "\nProfessor Number : " + Pnum);
	} // end of printInfo

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
} // end of class