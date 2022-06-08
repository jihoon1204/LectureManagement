package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.LectureAdderCancleListener;
import event.LectureAdderListener;
import manager.LectureManager;

public class LectureAdder extends JPanel {
	WindowFrame frame;
	LectureManager lectureManager;	
	
	public LectureAdder(WindowFrame frame, LectureManager lectureManager) {
		this.frame = frame;
		this.lectureManager = lectureManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelID = new JLabel("ID :", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName = new JLabel("Name :", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelDay = new JLabel("Day :", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10);
		labelID.setLabelFor(fieldDay);
		panel.add(labelDay);
		panel.add(fieldDay);

		JLabel labelTime = new JLabel("Time :", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelID.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);

		JLabel labelPlace = new JLabel("Place :", JLabel.TRAILING);
		JTextField fieldPlace = new JTextField(10);
		labelID.setLabelFor(fieldPlace);
		panel.add(labelPlace);
		panel.add(fieldPlace);

		JLabel labelPname = new JLabel("Pname :", JLabel.TRAILING);
		JTextField fieldPname = new JTextField(10);
		labelID.setLabelFor(fieldPname);
		panel.add(labelPname);
		panel.add(fieldPname);

		JLabel labelPnum = new JLabel("Pnum :", JLabel.TRAILING);
		JTextField fieldPnum = new JTextField(10);
		labelID.setLabelFor(fieldPnum);
		panel.add(labelPnum);
		panel.add(fieldPnum);

		JButton saveButton = new JButton("save");
		
		saveButton.addActionListener(new LectureAdderListener(fieldID, fieldName, fieldDay, fieldTime,fieldPlace, fieldPname, fieldPnum, lectureManager));
		
		JButton cancleButton = new JButton("cancle");
		cancleButton.addActionListener(new LectureAdderCancleListener(frame));
		
		
		panel.add(saveButton);
		panel.add(cancleButton);

		SpringUtilities.makeCompactGrid(panel, 8, 2, 5, 5, 5, 5);


		this.add(panel);
		this.setVisible(true);
	}
}
