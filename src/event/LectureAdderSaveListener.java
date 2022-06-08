package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exceptions.PlaceFormatException;
import lecture.CoreCourse;
import lecture.LectureInput;
import lecture.LectureKind;
import manager.LectureManager;

public class LectureAdderSaveListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldDay;
	JTextField fieldTime;
	JTextField fieldPlace;
	JTextField fieldPname;
	JTextField fieldPnum;
	
	LectureManager lectureManager;
	
	public LectureAdderSaveListener(JTextField fieldID, JTextField fieldName, JTextField fieldDay, JTextField fieldTime,
			JTextField fieldPlace, JTextField fieldPname, JTextField fieldPnum, LectureManager lectureManager) {
		
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldDay = fieldDay;
		this.fieldTime = fieldTime;
		this.fieldPlace = fieldPlace;
		this.fieldPname = fieldPname;
		this.fieldPnum = fieldPnum;
		this.lectureManager = lectureManager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		LectureInput lecture = new CoreCourse(LectureKind.CoreCourse);
		try {
			lecture.setId(Integer.parseInt(fieldID.getText()));
			lecture.setName(fieldName.getName());
			lecture.setDay(fieldDay.getText());
			lecture.setTime(fieldTime.getText());
			lecture.setPlace(fieldPlace.getText());
			lecture.setPname(fieldPname.getText());
			lecture.setPnum(fieldPnum.getText());
			lectureManager.addLecture(lecture);
			putObject(lectureManager, "lecturemanager.ser");
			lecture.printInfo();
		} catch (PlaceFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(LectureManager lecturemanager, String filename) {

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
	}
}
