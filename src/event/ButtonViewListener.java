package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import gui.LectureViewer;
import gui.WindowFrame;
import manager.LectureManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		LectureViewer lectureviewer = frame.getLectureviewer();
		LectureManager lectureManager = getObject("lecturemanager.ser");
		lectureviewer.setLectureManager(lectureManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(lectureviewer);
		frame.revalidate();
		frame.repaint();

//		frame.setupPanel(viewer);
	}
	
	public static LectureManager getObject(String filename) {
		LectureManager lecturemanager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			lecturemanager = (LectureManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return lecturemanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lecturemanager;
	}
}
