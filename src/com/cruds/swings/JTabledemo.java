package com.cruds.swings;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class JTabledemo  extends JFrame
{
JTable table;
JScrollPane scrollpane;
/*Object[] colNames={"rollno","Name"};
Object[] [] data= {

					{"101","sada"},
					{"202","sanjay"},
					
					};*/





Vector<String> colNames=new Vector<>();
//Vector<Vector<String>> data=new Vector<>();


public JTabledemo()
{
	setTitle("TextField Example");
	setSize(500,500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	colNames.add("Rollno");
	colNames.add("Name");
	
	
	
	StudentDAO dao=new StudentDAO();
	
	/*
	Vector<String> row1=new Vector<>();
	row1.add("101");
	row1.add("sada");
	
	Vector<String> row2=new Vector<>();
	row2.add("202");
	row2.add("sanjay");
	//Vector<E>
	
	data.add(row1);
	data.add(row2);
	*/
	table=new JTable(new DefaultTableModel(dao.getAllStudentForJTable(), colNames));
	//table=new JTable(data,colNames);//same as that as above line
	scrollpane=new JScrollPane(table);
	
	JButton btndel = new JButton("DELETE");
	btndel.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int index=table.getSelectedRow();
			//System.out.println(index);
			//data.remove(index);
			
			String selRollno=(String) table.getModel().getValueAt(index, 0);
			StudentDAO dao=new StudentDAO();
			dao.delete(Integer.parseInt(selRollno));
			
			table.setModel(new DefaultTableModel(dao.getAllStudentForJTable(),colNames));
			
		}
	});
	
	
	
	add(scrollpane);
	add(btndel,BorderLayout.SOUTH);
	setVisible(true);
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JTabledemo();
				
			}
		});
	}

}
	
	
	
	
	

