package lecture;

import java.util.Scanner;

public abstract class Lecture { // class Lecture에 대한 변수 생성 -> abstract 추가하여 Lecture라는 객체를 생성하지 않는다.
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

	public abstract void printInfo(); // 인터페이스와 각각의 class에 입력시킴으로 abstract 사용
	
} // end of class