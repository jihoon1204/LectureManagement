package lecture;

import java.util.Scanner;

import exceptions.PlaceFormatException;

public abstract class Lecture implements LectureInput { // class Lecture에 대한 변수 생성 -> abstract 추가하여 Lecture라는 객체를 생성하지
														// 않는다.
	Scanner ques;

	protected LectureKind kind = LectureKind.CoreCourse;
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

	public void setPlace(String place) throws PlaceFormatException {
		if (!place.contains("동") && !place.equals("")) {
			throw new PlaceFormatException();
		}
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

	public abstract void printInfo(); // 인터페이스와 각각의 class에 입력시킴으로 abstract 사용

	public String getKindString() {
		String skind = "none";
		switch (this.kind) {
		case CoreCourse:
			skind = "Major";
			break;
		case ElectiveCourse:
			skind = "Elective";
			break;
		case SelectiveMajorCourse:
			skind = "Selective";
		default:
		}
		return skind;
	} // end of getKindString

	public void setLectureID(Scanner ques) {
		System.out.println("Lecture ID:");
		int id = ques.nextInt();
		this.setId(id);
	} // end of setLectureID

	public void setLectureName(Scanner ques) {
		System.out.println("Lecture Name:");
		String name = ques.next();
		this.setName(name);
	} // end of setLectureName

	public void setLectureDay(Scanner ques) {
		System.out.println("Lecture Day:");
		String day = ques.next();
		this.setDay(day);
	} // end of setLectureDay

	public void setLectureTime(Scanner ques) {
		System.out.println("Lecture Time:");
		String time = ques.next();
		this.setTime(time);
	} // end of setLectureTime

	public void setLecturePlace(Scanner ques) {
		String place = "";
		while (!place.contains("동")) {
			System.out.println("Lecture Place:");
			place = ques.next();
			try {
				this.setPlace(place);
			} // end of try
			catch (PlaceFormatException e) {
				System.out.println("Incorrect Place Format. Please include the word '동'.");
			} // end of catch
		} // end of while
	} // end of setLecturePlace

	public void setLecturePname(Scanner ques) {
		System.out.println("Lecture PName:");
		String Pname = ques.next();
		this.setPname(Pname);
	} // end of setLecturePname

	public void setLecturePnum(Scanner ques) {
		System.out.println("Lecture Pnum:");
		String Pnum = ques.next();
		this.setPnum(Pnum);
	} // end of setLecturePnum

} // end of class