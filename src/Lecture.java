public class Lecture { // class Lecture�� ���� ���� ����
	
	int id;
	String name;
	String day;
	String time;
	String place;
	String Pname;
	String Pnum;
	
	public Lecture() {
		
	} // end of Lecture 

	public Lecture(int id, String name, String day, String time, String place, String Pname, String Pnum) {
		this.id = id;
		this.name = name;
		this.day = day;
		this.time = time;
		this.place = place;
		this.Pname = Pname;
		this.Pnum = Pnum;
	} // end of Lecture
	
	public void printInfo() { // printInfo �Լ� ����
		System.out.println("Lecture Id : "+ id +"\nLecture name : " + name + 
				"\nLecture day : "+day+"\nLecture time : "+time+"\nLecture place : "+place+
				"\nProfessor Name : "+Pname+"\nProfessor Number : " +Pnum);
		
	} // end of printInfo
} // end of class