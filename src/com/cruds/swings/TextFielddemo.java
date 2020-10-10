package com.cruds.swings;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Address;
import com.cruds.demo.Student;
import com.cruds.exception.SMSException;

public class TextFielddemo extends JFrame
{
	
	JTable table;
	JScrollPane scrollpane;
	
	
	Vector<String> colNames=new Vector<>();
	
	
	
	JLabel lblname,lblrollno,lblLine1,lblcity,lblpin;
	
	JTextField txtname,txtrollno,txtLine1,txtcity,txtpin;
	JButton btnclick,btndel;
	JPanel panel;
	
	
	
	
	public TextFielddemo() {
		
		setTitle("Textfeild demo");
		setSize(600,750);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		lblname=new JLabel("Name :");
		lblrollno=new JLabel("Rollno:");
		lblLine1=new JLabel("Line 1:");
		lblcity=new JLabel("city :");
		lblpin=new JLabel("pin :");
		
		
		txtname=new JTextField(10);
		txtrollno=new JTextField(5);
		txtLine1=new JTextField(10);
		txtcity=new JTextField(10);
		txtpin=new JTextField(5);
		
		panel=new JPanel();
		
		btnclick=new JButton("CLICK");
		btndel=new JButton("DELETE");
		
		StudentDAO dao=new StudentDAO();
		
		colNames.add("Rollno");
		colNames.add("Name");
		colNames.add("Line1");
		colNames.add("city");
		colNames.add("pin");
		
		
		table=new JTable(new DefaultTableModel(dao.getAllStudentForJTable(), colNames));
		
		
		scrollpane=new JScrollPane(table);
		
		
		
		
		
//////////////////////////////CLICK BUTTON/////////////////////////////////
		
		btnclick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txtname.getText().trim();
				String strrollno=txtrollno.getText().trim();
				String strLine1=txtLine1.getText().trim();
				String strcity=txtcity.getText().trim();
				String strpin=txtpin.getText().trim();
				
				try
				{
					if(name.equals("") ||strrollno.equals(""))
						
					{
						JOptionPane.showMessageDialog(panel,"details cannot be empty", "WARNING", JOptionPane.WARNING_MESSAGE);
						return;
					} 
					
					Address ad=new Address(strLine1,strcity,strpin);
					Student s=new Student(Integer.parseInt(strrollno),name,ad);
							StudentDAO dao=new StudentDAO();
					if(dao.create(s))
					{
						//help to enter nxt data////
						txtrollno.setText("");
						txtname.setText("");
						txtLine1.setText("");
						txtcity.setText("");
						txtpin.setText("");
					
						
						table.setModel(new DefaultTableModel(dao.getAllStudentForJTable(),colNames));
						JOptionPane.showMessageDialog(panel,"student data added succesfully", "success", JOptionPane.INFORMATION_MESSAGE);

					}	
				
					
				}catch(NumberFormatException nfe){
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel,"invaloid data", "error", JOptionPane.ERROR_MESSAGE);
				}catch(SMSException smse){
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, smse.getInfo(), "error", JOptionPane.ERROR_MESSAGE);
				
				}
			
				
				
			}
		}); 
		
/////////////////////////////DELETE BUTTON////////////////////////////
		
		
		btndel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				int index=table.getSelectedRow();
				//System.out.println(index);
				//data.remove(index);
				
				String selRollno=(String) table.getModel().getValueAt(index, 0);
				StudentDAO dao=new StudentDAO();
				dao.delete(Integer.parseInt(selRollno));
				
				 int response = JOptionPane.showConfirmDialog(panel, "Do you want to delete student?", "Confirm",
					        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				 
				 if (response == JOptionPane.YES_OPTION)
				 {
					 
					 
					 table.setModel(new DefaultTableModel(dao.getAllStudentForJTable(),colNames));
						JOptionPane.showMessageDialog(panel,"student data deleted succesfully", "success", JOptionPane.INFORMATION_MESSAGE);
				
						
				 }
				else
				{
					
					JOptionPane.showMessageDialog(panel,"student data deleted unsuccesfully", "unsuccess", JOptionPane.PLAIN_MESSAGE);
				return;
				}
				     
				
				
			}
		});
		
		
		panel.add(lblrollno);
		panel.add(txtrollno);
		panel.add(lblname);
		panel.add(txtname);
		panel.add(lblLine1);
		panel.add(txtLine1);
		panel.add(lblcity);
		panel.add(txtcity);
		panel.add(lblpin);
		panel.add(txtpin);
		panel.add(btnclick);
		panel.add(scrollpane);
		panel.add(btndel);
		
		add(panel);
		 setVisible(true);
		 
	
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TextFielddemo();
				
			}
		});
	}
	


}
