/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;

/**
 *
 * @author Dell
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static kpk.conn.con;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class returnbook{
    JFrame F;
    JLabel l, lblsID, lblName, lblFname, lblCourse, lblBranch, lblYear, lblSem;
    JTextField sID, name, Fname, branch,course,year,sem;
    JButton search;
    Label lblBookID,lblname,lblPublisher,lblPrice,lblEdition,lblStocks,idate,rdate;
    TextField txtName,txtBookID,txtPublisher,txtPrice,textStocks,textidate,textrdate,Edition;
    Button return1,back;
    PreparedStatement p,q,r;
    returnbook()
    {
        F = new JFrame("Form");
        F.setSize(1500, 1000);
        F.setLocationRelativeTo(null);

        l = new JLabel("Return Book");
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

        course = new JTextField();
        course.setBounds(310, 250, 300, 30);
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

        year = new JTextField();
        year.setBounds(310, 350, 300, 30);
        F.add(year);

        lblSem = new JLabel("Semester:");
        lblSem.setBounds(100, 400, 100, 30);
        lblSem.setFont(labelFont);
        F.add(lblSem);

        sem = new JTextField();
        sem.setBounds(310, 400, 300, 30);
        F.add(sem);

        search = new JButton("Search");
        search.setBounds(630, 100, 100, 30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.setFont(labelFont);
        F.add(search);
        
        search.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            try{
              conn.dbconnect();
              searching();
              conn.close();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
            }
        });
        
        
        
        
        
        
        
        
        Color formColor = new Color(53, 59, 72);

        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont1 =new  Font("arial", Font.BOLD, 20);
        Font textFont =new  Font("arial", Font.PLAIN, 15);

        lblname=new Label("Name");
        lblname.setBounds(750,100,150,30);
        lblname.setFont(labelFont);  
        lblname.setForeground(Color.BLACK);

        F.add(lblname);

        txtName=new TextField();
        txtName.setBounds(900,100,400,30);
        txtName.setFont(textFont);

        F.add(txtName);

        lblBookID=new Label("BookID");  
        lblBookID.setBounds(750,150,150,30);
        lblBookID.setFont(labelFont);

        lblBookID.setForeground(Color.BLACK);
        F.add(lblBookID);

        txtBookID=new TextField();
        txtBookID.setBounds(900,150,400,30);
        txtBookID.setFont(textFont);
        F.add(txtBookID);

        lblPublisher=new Label("Publisher");  
        lblPublisher.setBounds(750,200,150,30);
        lblPublisher.setFont(labelFont);

        lblPublisher.setForeground(Color.BLACK);
        F.add(lblPublisher);

        txtPublisher=new TextField();
        txtPublisher.setBounds(900,200,400,30);
        txtPublisher.setFont(textFont);
        F.add(txtPublisher);



        lblEdition=new Label("Edition");  
        lblEdition.setBounds(750,250,150,30);
        lblEdition.setFont(labelFont);
        lblEdition.setForeground(Color.BLACK);
        F.add(lblEdition);

        Edition= new TextField();
        Edition.setBounds(900,250, 400, 30);
        Edition.setFont(labelFont);
        F.add(Edition);



        lblPrice=new Label("Price");  
        lblPrice.setBounds(750,300,150,30);
        lblPrice.setFont(labelFont);
        lblPrice.setForeground(Color.BLACK);
        F.add(lblPrice);

        txtPrice=new TextField();
        txtPrice.setBounds(900, 300, 400, 30);
        txtPrice.setFont(textFont);
        F.add(txtPrice);


        lblStocks=new Label("Stocks");  
        lblStocks.setBounds(750,350,150,30);
        lblStocks.setFont(labelFont);
        lblStocks.setForeground(Color.BLACK);
        F.add(lblStocks);

        textStocks=new TextField();
        textStocks.setBounds(900,350,400,30);
        textStocks.setFont(textFont);
        F.add(textStocks);
        
        idate=new Label("Date of Issue");  
        idate.setBounds(750,400,150,30);
        idate.setFont(labelFont);
        idate.setForeground(Color.BLACK);
        F.add(idate);

        textidate=new TextField("YYYY-MM-DD");
        textidate.setBounds(900,400,400,30);
        textidate.setFont(textFont);
        F.add(textidate);
        
        rdate=new Label("Return Date");  
        rdate.setBounds(750,480,150,30);
        rdate.setFont(labelFont);
        rdate.setForeground(Color.BLACK);
        F.add(rdate);

        textrdate=new TextField("YYYY-MM-DD");
        textrdate.setBounds(900,480,400,30);
        textrdate.setFont(textFont);
        F.add(textrdate);

        return1=new Button("Return");
        return1.setBounds(920,530,150,30);
        return1.setFont(labelFont);
        return1.setBackground(Color.BLACK);
        return1.setForeground(Color.WHITE);
        F.add(return1);

        return1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    try {
                        conn.dbconnect();
                        returning();
                    returnupdate();
                    conn.close();
                    } catch (Exception ex) {
                        Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });

        back = new Button("Back");
        back.setBounds(1090, 530, 150, 30);
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
        
        
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    public void paintComponent(Graphics g)
//    {
//        super.paintComponent(g);
//        g.drawRect(20, 50, 1100, 425);
//    }
    
    public void searching()
    {
        String std="Select *from issue where stdid=?";
        try
        {
          q=con.prepareStatement(std);
          q.setInt(1,Integer.parseInt(sID.getText()));
          ResultSet rst=q.executeQuery();
            if(rst.next())
            {
                txtName.setText(rst.getString(1));
                txtBookID.setText(rst.getString(2));
                Edition.setText(rst.getString(3));
                txtPrice.setText(rst.getString(4));
                textStocks.setText(rst.getString(5));
                txtPublisher.setText(rst.getString(6));
                name.setText(rst.getString(8));
                Fname.setText(rst.getString(9));
                course.setText(rst.getString(10));
                branch.setText(rst.getString(11));
                year.setText(rst.getString(12));
                sem.setText(rst.getString(13));
                textidate.setText(rst.getString(14));
                rst.close();
                q.close();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Book is not issued by this student");
            }
          
        }
            
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void returning()
    {
       String sql="delete from issue where stdid=?";
       try
       {
           p=con.prepareStatement(sql);
           p.setString(1,sID.getText());
           p.execute();    
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
        
    }
    
    public void returnupdate() 
    {
        String sql="insert into returnbook values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
        p=con.prepareStatement(sql);
        //txtName,txtBookID,txtPublisher,txtPrice,textStocks,textidate,textrdate,Edition;
        //sID, name, Fname, branch,course,year,sem;
        p.setString(1,sID.getText());
        p.setString(2,name.getText());
        p.setString(3,Fname.getText());
        p.setString(4,course.getText());
        p.setString(5,branch.getText());
        p.setString(6,year.getText());
        p.setString(7,sem.getText());
        p.setString(8,txtName.getText());
        p.setString(9,txtBookID.getText());
        p.setString(10,Edition.getText());
        p.setString(11,txtPrice.getText());
        p.setString(12,textStocks.getText());
        p.setString(13,txtPublisher.getText());
        p.setString(14,textidate.getText());
        p.setString(15,textrdate.getText());
        p.execute();
        JOptionPane.showMessageDialog(null,"Book Returned");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        new returnbook();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
