package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.LectureManager;

public class WindowFrame extends JFrame {	

	LectureManager lectureManager;
	
	MenuSelection menuselection;
	LectureAdder lectureadder;
	LectureViewer lectureviewer;

	public WindowFrame(LectureManager lectureManager) {
		this.lectureManager = lectureManager;
		this.menuselection = new MenuSelection(this);
		this.lectureadder = new LectureAdder(this, this.lectureManager);
		this.lectureviewer = new LectureViewer(this, this.lectureManager);
		
		this.setTitle("My Frame");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public LectureAdder getLectureadder() {
		return lectureadder;
	}

	public void setLectureadder(LectureAdder lectureadder) {
		this.lectureadder = lectureadder;
	}

	public LectureViewer getLectureviewer() {
		return lectureviewer;
	}

	public void setLectureviewer(LectureViewer lectureviewer) {
		this.lectureviewer = lectureviewer;
	}
}
