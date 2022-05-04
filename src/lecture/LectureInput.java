package lecture;

import java.util.Scanner;

public interface LectureInput {
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setDay(String day);
	
	public void setTime(String time);
	
	public void setPlace(String place);
	
	public void setPname(String pname);
	
	public void setPnum(String pnum);
	
	public void getUserInput(Scanner ques);
	
	public void printInfo();
}
