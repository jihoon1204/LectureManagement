package lecture;

import java.util.Scanner;

import exceptions.PlaceFormatException;

public interface LectureInput {
	public int getId();

	public void setId(int id);

	public void setName(String name);

	public void setDay(String day);

	public void setTime(String time);

	public void setPlace(String place) throws PlaceFormatException;

	public void setPname(String pname);

	public void setPnum(String pnum);

	public void getUserInput(Scanner ques);

	public void printInfo();

	public void setLectureID(Scanner ques);

	public void setLectureName(Scanner ques);

	public void setLectureDay(Scanner ques);

	public void setLectureTime(Scanner ques);

	public void setLecturePlace(Scanner ques);

	public void setLecturePname(Scanner ques);

	public void setLecturePnum(Scanner ques);
}
