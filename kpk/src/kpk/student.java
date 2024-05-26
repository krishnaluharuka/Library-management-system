/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;

/**
 *
 * @author Dell
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import static kpk.conn.con;

class student {
    JFrame F;
    JLabel l, lblsID, lblName, lblFname, lblCourse, lblBranch, lblYear, lblSem;
    JTextField sID, name, Fname, branch;
    Choice course, year, sem;
    JButton register, back;
    PreparedStatement stmt;

    student() {
        F = new JFrame("Form");
        F.setSize(700, 600);
        F.setLocationRelativeTo(null);

        l = new JLabel("New Student");
        l.setBounds(200, 30, 300, 30);
        l.setFont(new Font("Arial", Font.BOLD, 30));
        Font labelFont =new  Font("arial", Font.BOLD, 18);
        l.setForeground(Color.RED);
        F.add(l);

        lblsID = new JLabel("Student ID:");
        lblsID.setBounds(100, 100, 100, 30);
        lblsID.setFont(labelFont);
        F.add(lblsID);

        sID = new JTextField();
        sID.setBounds(310, 100, 300, 30);
        F.add(sID);

        lblName = new JLabel("Name:");
        lblName.setBounds(100, 150, 100, 30);
        lblName.setFont(labelFont);
        F.add(lblName);

        name = new JTextField();
        name.setBounds(310, 150, 300, 30);
        F.add(name);

        lblFname = new JLabel("Father's Name:");
        lblFname.setBounds(100, 200, 200, 30);
        lblFname.setFont(labelFont);
        F.add(lblFname);

        Fname = new JTextField();
        Fname.setBounds(310, 200, 300, 30);
        F.add(Fname);

        lblCourse = new JLabel("Course:");
        lblCourse.setBounds(100, 250, 100, 30);
        lblCourse.setFont(labelFont);
        F.add(lblCourse);

        course = new Choice();
        course.setBounds(310, 250, 300, 30);
        course.add("BBA");
        course.add("BIM");
        course.add("BBS");
        F.add(course);

        lblBranch = new JLabel("Branch:");
        lblBranch.setBounds(100, 300, 100, 30);
        lblBranch.setFont(labelFont);
        F.add(lblBranch);

        branch = new JTextField();
        branch.setBounds(310, 300, 300, 30);
        F.add(branch);

        lblYear = new JLabel("Year:");
        lblYear.setBounds(100, 350, 100, 30);
        lblYear.setFont(labelFont);
        F.add(lblYear);

        year = new Choice();
        year.setBounds(310, 350, 300, 30);
        year.add("1st");
        year.add("2nd");
        year.add("3rd");
        year.add("4th");
        F.add(year);

        lblSem = new JLabel("Semester:");
        lblSem.setBounds(100, 400, 100, 30);
        lblSem.setFont(labelFont);
        F.add(lblSem);

        sem = new Choice();
        sem.setBounds(310, 400, 300, 30);
        sem.add("1st");
        sem.add("2nd");
        sem.add("3rd");
        sem.add("4th");
        sem.add("5th");
        sem.add("6th");
        sem.add("7th");
        sem.add("8th");
        sem.add("9th");
        F.add(sem);

        register = new JButton("Register");
        register.setBounds(200, 480, 150, 40);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        register.setFont(labelFont);
        F.add(register);

        back = new JButton("Back");
        back.setBounds(400, 480, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(labelFont);
        F.add(back);
        
        back.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
            
            F.setVisible(false);
            new home().setVisible(true);
            

        }
        });        

        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                conn.dbconnect();
                insert();
                conn.close();
                }
                catch(Exception ee)
                {
                    
                }
                
            }
        });
        
        F.setLayout(null);
        F.setVisible(true);
    }
        public void insert()
        {
            String std="Insert into student values(?,?,?,?,?,?,?)";
               try 
               {
                   int i=course.getSelectedIndex();
                   int j=year.getSelectedIndex();
                   int k=sem.getSelectedIndex();
                   stmt=con.prepareStatement(std);
                   stmt.setString(1,sID.getText());
                   stmt.setString(2,name.getText());
                   stmt.setString(3,Fname.getText());
                   stmt.setString(4,course.getItem(i));
                   stmt.setString(5,branch.getText());
                   stmt.setString(6,year.getItem(j));
                   stmt.setString(7,sem.getItem(k));
                   stmt.executeUpdate();
                   stmt.close();
                   con.close();
                    
                   JOptionPane.showMessageDialog(null, "A student is added");
                   
                   
                   
               }
               catch(Exception ee)
               {
                   ee.printStackTrace();
               }
        }

        
    

    public static void main(String[] args) {
        new student();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
