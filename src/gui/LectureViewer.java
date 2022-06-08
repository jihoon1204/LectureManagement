package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lecture.LectureInput;
import manager.LectureManager;

public class LectureViewer extends JPanel {
	LectureManager lectureManager;
	
	public LectureManager getLectureManager() {
		return lectureManager;
	}

	public void setLectureManager(LectureManager lectureManager) {
		this.lectureManager = lectureManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("DAY");
		model.addColumn("TIME");
		model.addColumn("PLACE");
		model.addColumn("PNAME");
		model.addColumn("PNUM");
		
		for (int i = 0; i < lectureManager.size(); i++) {
			Vector row = new Vector();
			LectureInput li = lectureManager.get(i);
			row.add(li.getId());
			row.add(li.getName());
			row.add(li.getDay());
			row.add(li.getTime());
			row.add(li.getPlace());
			row.add(li.getPname());
			row.add(li.getPnum());
			model.addRow(row);
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	WindowFrame frame;
	
	public LectureViewer(WindowFrame frame, LectureManager lectureManager) {
		this.frame = frame;
		this.lectureManager = lectureManager;
		 
		System.out.println("***" + lectureManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("DAY");
		model.addColumn("TIME");
		model.addColumn("PLACE");
		model.addColumn("PNAME");
		model.addColumn("PNUM");
		
		for (int i = 0; i < lectureManager.size(); i++) {
			Vector row = new Vector();
			LectureInput li = lectureManager.get(i);
			row.add(li.getId());
			row.add(li.getName());
			row.add(li.getDay());
			row.add(li.getTime());
			row.add(li.getPlace());
			row.add(li.getPname());
			row.add(li.getPnum());
			model.addRow(row);
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
