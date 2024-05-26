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
import javax.swing.table.DefaultTableModel;
import static kpk.conn.con;


public class stat {
    JFrame f;
    JTable t1,t2;
    JLabel l1,l2;
    JButton Back;
    JScrollPane p1,p2;
    Font f1;
    ResultSet rs;
    PreparedStatement pst;
    String column[]={"Bookid","Bookname","Edition","Publisher","Price","Stock"};
    String column2[]={"Std ID","Student Name","Father's Name","Course","Branch","Year","Semester"};
    
    stat()
    {
        
        
       f=new JFrame("Statistics");
       f.setSize(900,700);
       f.setLocationRelativeTo(null);
       f1=new Font("Times New Roman",Font.BOLD,28);
       
       l1=new JLabel("Issue Details");
       l1.setBounds(50,70,500,30);
       l1.setFont(f1);
       f.add(l1);
       
       
       
       String data[][]={};
       t1=new JTable(data,column);
       p1=new JScrollPane(t1);
       p1.setBounds(50, 100, 600, 500);
       p1.setSize(800,100);
       f.add(p1);
       
       l2=new JLabel("Return Details");
       l2.setBounds(50,370,500,30);
       l2.setFont(f1);
       f.add(l2);
       
       String data2[][]={};
       t2=new JTable(data2,column2);
       p2=new JScrollPane(t2);
       p2.setBounds(50, 400, 600, 500);
       p2.setSize(800,100);
       f.add(p2);
       
       Back=new JButton("Back");
       Back.setBounds(750, 50, 100, 30);
       f.add(Back);
       
////       Class.forName("com.mysql.cj.jdbc.Driver");
////        try
////        {
////           con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","krishna@123");
//////          result =  select * from book
//////          int id = result[id]
//////          String name = result[name]
//////          String author = result[author]
//////          Label j = new Label(id)
//////            Label j = new Label(name)
////
////        }
//
//        
//        
//        
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
        
       try{
       conn.dbconnect();
       jTable();
       jTable2();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        
       
       Back.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
          {
              f.dispose();
          }
       });
       
       f.setLayout(null);
       f.setVisible(true);
        
    }
    
    public void jTable()
    {
        try
        {
            String sql="Select bookid,bname,edition,publisher,price,stock from issue";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            //jTable.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model=new DefaultTableModel();
          
            model.setColumnIdentifiers(column);
           t1.setModel(model);
            String bookid1="";
            String bname1="";
            String edition1="";
            String publisher1="";
            String price1="";
            String stock1="";
            while(rs.next())
            {
                bookid1=rs.getString(1);
                 bname1=rs.getString(2);
                  edition1=rs.getString(3);
                   publisher1=rs.getString(4);
                    price1=rs.getString(5);
                     stock1=rs.getString(6);
                                 model.addRow(new Object[]{bookid1,bname1,edition1,publisher1,price1,stock1});

            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void jTable2()
    {
        try
        {
            String sql="Select stdid,name,fname,course,branch,year,semester from returnbook";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            //jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model=new DefaultTableModel();
          
            model.setColumnIdentifiers(column2);
           t2.setModel(model);
            String stdid1="";
            String name1="";
            String fname1="";
            String course1="";
            String branch1="";
            String year1="";
            String semester1="";
            while(rs.next())
            {
                stdid1=rs.getString(1);
                 name1=rs.getString(2);
                  fname1=rs.getString(3);
                   course1=rs.getString(4);
                    branch1=rs.getString(5);
                     year1=rs.getString(6);
                     semester1=rs.getString(7);
                                 model.addRow(new Object[]{stdid1,name1,fname1,course1,branch1,year1,semester1});

            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
//    public void JTable()
//    {
//        try
//        {
//           String sql="Select name,bookid,edition publisher,price,stock from book" ;
//           pst=con.prepareStatement(sql);
//           r=pst.executeQuery();
//           
//           
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        new stat();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
