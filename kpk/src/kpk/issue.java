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
import static kpk.conn.con;
import java.sql.*;
import java.text.SimpleDateFormat;
import kpk.conn;
import java.util.ArrayList;

public class issue extends Frame{
    Label lblTitle,lblBookID,lblName,lblPublisher,lblPrice,lblEdition,lblStocks;
    TextField txtName,txtBookID,txtPublisher,txtPrice,textStocks,Edition;
    Button search1;
    JLabel l, lblsID, lblname, lblFname, lblCourse, lblBranch, lblYear, lblSem,lbldate;
    JTextField sID, name, Fname, branch,course, year, sem, date;
    JButton search2,issue2,back;
    PreparedStatement p,q,r;
    public issue() {
    super("Issue Book");
    setSize(1500, 1000);
    setLocationRelativeTo(null);
 
    
    Font titleFont = new Font("arial", Font.BOLD, 25);
    Font labelFont =new  Font("arial", Font.BOLD, 20);
    Font textFont =new  Font("arial", Font.PLAIN, 15);

    lblTitle=new Label("Book Details");  
    lblTitle.setBounds(50,40,300,50);
    lblTitle.setFont(titleFont);
    lblTitle.setForeground(Color.BLUE);
    add(lblTitle);

    lblName=new Label("BookID");
    lblName.setBounds(50,100,130,30);
    lblName.setFont(labelFont);  
    lblName.setForeground(Color.BLACK);

    add(lblName);

    txtName=new TextField();
    txtName.setBounds(180,100,350,30);
    txtName.setFont(textFont);

    add(txtName);

    lblBookID=new Label("Name");  
    lblBookID.setBounds(50,150,130,30);
    lblBookID.setFont(labelFont);

    lblBookID.setForeground(Color.BLACK);
    add(lblBookID);

    txtBookID=new TextField();
    txtBookID.setBounds(180,150,350,30);
    txtBookID.setFont(textFont);
    add(txtBookID);

    lblPublisher=new Label("Edition");  
    lblPublisher.setBounds(50,200,130,30);
    lblPublisher.setFont(labelFont);

    lblPublisher.setForeground(Color.BLACK);
    add(lblPublisher);

    txtPublisher=new TextField();
    txtPublisher.setBounds(180,200,350,30);
    txtPublisher.setFont(textFont);
    add(txtPublisher);



    lblEdition=new Label("Publisher");  
    lblEdition.setBounds(50,250,130,30);
    lblEdition.setFont(labelFont);
    lblEdition.setForeground(Color.BLACK);
    add(lblEdition);

    Edition= new TextField();
    Edition.setBounds(180,250, 350, 30);
    Edition.setFont(labelFont);
    add(Edition);



    lblPrice=new Label("Price");  
    lblPrice.setBounds(50,300,130,30);
    lblPrice.setFont(labelFont);
    lblPrice.setForeground(Color.BLACK);
    add(lblPrice);

    txtPrice=new TextField();
    txtPrice.setBounds(180, 300, 350, 30);
    txtPrice.setFont(textFont);
    add(txtPrice);


    lblStocks=new Label("Stocks");  
    lblStocks.setBounds(50,350,130,30);
    lblStocks.setFont(labelFont);
    lblStocks.setForeground(Color.BLACK);
    add(lblStocks);

    textStocks=new TextField();
    textStocks.setBounds(180,350,350,30);
    textStocks.setFont(textFont);
    add(textStocks);

    search1=new Button("Search");
    search1.setBounds(560,100,80,30);
    search1.setFont(labelFont);
    search1.setBackground(Color.BLACK);
    search1.setForeground(Color.WHITE);
    add(search1);

    
    txtName.setEditable(true);
    txtBookID.setEditable(false);
    txtPublisher.setEditable(false);
    txtPrice.setEditable(false);
    textStocks.setEditable(false);
    Edition.setEditable(false);

    this.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent we) {
            System.exit(0);
    }
    });
    
    search1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ee) 
        {
        try
        {
            conn.dbconnect();
            searching();
            conn.close();
        }
        catch(Exception e)
        {
            
        }
        }
    });
    
    l = new JLabel("Student Details");
    l.setBounds(650, 40, 300, 50);
    l.setFont(new Font("Arial", Font.BOLD, 30));
    l.setForeground(Color.RED);
    add(l);

    lblsID = new JLabel("Student ID:");
    lblsID.setBounds(650, 100, 150, 30);
    lblsID.setFont(labelFont);
    add(lblsID);

    sID = new JTextField();
    sID.setBounds(800, 100, 400, 30);
    add(sID);

    lblname = new JLabel("Name:");
    lblname.setBounds(650, 150, 150, 30);
    lblname.setFont(labelFont);
    add(lblname);

    name = new JTextField();
    name.setBounds(800, 150, 400, 30);
    add(name);

    lblFname = new JLabel("Father's Name:");
    lblFname.setBounds(650, 200, 150, 30);
    lblFname.setFont(labelFont);
    add(lblFname);

    Fname = new JTextField();
    Fname.setBounds(800, 200, 400, 30);
    add(Fname);

    lblCourse = new JLabel("Course:");
    lblCourse.setBounds(650, 250, 150, 30);
    lblCourse.setFont(labelFont);
    add(lblCourse);

    course = new JTextField();
    course.setBounds(800, 250, 400, 30);
    add(course);

    lblBranch = new JLabel("Branch:");
    lblBranch.setBounds(650, 300, 150, 30);
    lblBranch.setFont(labelFont);
    add(lblBranch);

    branch = new JTextField();
    branch.setBounds(800, 300, 400, 30);
    add(branch);

    lblYear = new JLabel("Year:");
    lblYear.setBounds(650, 350, 150, 30);
    lblYear.setFont(labelFont);
    add(lblYear);

    year = new JTextField();
    year.setBounds(800, 350, 400, 30);
    add(year);

    lblSem = new JLabel("Semester:");
    lblSem.setBounds(650, 400, 150, 30);
    lblSem.setFont(labelFont);
    add(lblSem);

    sem = new JTextField();
    sem.setBounds(800, 400, 400, 30);
    add(sem);

    search2 = new JButton("Search");
    search2.setBounds(1220, 100, 100, 30);
    search2.setBackground(Color.BLACK);
    search2.setForeground(Color.WHITE);
    search2.setFont(labelFont);
    add(search2);
    
    search2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ee)
        {
        try
        {
            conn.dbconnect();
            searching2();
            conn.close();
        }
        catch(Exception e)
        {
            
        }
        }
    });
    
    lbldate = new JLabel("Date of Issue");
    lbldate.setBounds(800, 480, 200, 30);
    lbldate.setFont(labelFont);
    add(lbldate);

    date = new JTextField("YYYY-MM-DD");
    date.setBounds(1000, 480, 200, 30);
    add(date);
    
    back = new JButton("Back");
    back.setBounds(1060, 530, 140, 30);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.setFont(labelFont);
    add(back);
    
     issue2= new JButton("Issue");
    issue2.setBounds(900, 530, 140, 30);
    issue2.setBackground(Color.BLACK);
    issue2.setForeground(Color.WHITE);
    issue2.setFont(labelFont);
    add(issue2);
    
    sID.setEditable(true);
    name.setEditable(false);
    Fname.setEditable(false);
    branch.setEditable(false);
    course.setEditable(false);
    year.setEditable(false);
    sem.setEditable(false); 
    date.setEditable(true);
    
    
    
    issue2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                conn.dbconnect();
                issue1();
                conn.close();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
    });


    back.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        dispose();

    }
    });        

    setLayout(null);
    setVisible(true);
    }

    
    public void searching()
    {
       String s="Select * from book where bookid=?" ;
       try
       {
           p=con.prepareStatement(s);
           p.setString(1,txtName.getText());
           ResultSet rs=p.executeQuery();
           if(rs.next())
           {
               
               txtBookID.setText(rs.getString(1));
               txtPublisher.setText(rs.getString(3));
               txtPrice.setText(rs.getString(4));
               textStocks.setText(rs.getString(5));
               Edition.setText(rs.getString(6));
               
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Book Id Not Found");
           }
           
       }
       catch(Exception ee)
       {
           System.out.println(ee);
       }
    }
    
    public void searching2()
    {
        String std="Select *from student where stdid=?";
        try{
            
            q=con.prepareStatement(std);
            q.setString(1,sID.getText());
            ResultSet rst=q.executeQuery();
            if(rst.next())
            {
                
                name.setText(rst.getString(2));
                Fname.setText(rst.getString(3));
                branch.setText(rst.getString(4));
                course.setText(rst.getString(5));
                year.setText(rst.getString(6));
                sem.setText(rst.getString(7));
                
            }
            else
                JOptionPane.showMessageDialog(null, "Student id not found");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
//    public ArrayList<issue> issueList(){
//       ArrayList<issue> iss = new ArrayList<>();
//       String query = "select * from issue";
//       try{
//           PreparedStatement pstmt;
//           pstmt = con.prepareStatement(query);
//           ResultSet rs = pstmt.executeQuery();
//           
//           while(rs.next()){
//              issue is;
//               is = new issue(rs.getInt(1),rs.getInt(2),rs.getDate(3));
//               iss.add(is);
//              // System.out.println("abcd"+iss);
//                       
//           }
//       }
//       catch(Exception e){
//           e.printStackTrace();
//       }
//       return iss;
//    }
    
    
    public void issue1()
    {
        String stmt="Insert into issue values(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        try
        {
        PreparedStatement st=con.prepareStatement(stmt);
        st.setString(1, txtBookID.getText());
        st.setString(2, txtName.getText());
        st.setString(3, txtPublisher.getText());
        st.setString(4, txtPrice.getText());
        st.setString(5, textStocks.getText());
        st.setString(6, Edition.getText());
        st.setString(7, sID.getText());
        st.setString(8, name.getText());
        st.setString(9, Fname.getText());
        st.setString(10, course.getText());
        st.setString(11, branch.getText());
        st.setString(12, year.getText());
        st.setString(13, sem.getText());
        st.setString(14, date.getText());
        
        st.executeUpdate();
//        if(textStocks.getText()=='0')
//        {
//            JOptionPane.showMessageDialog(null, "Book is out of stock");
//        }
//JTextField sID, name, Fname, branch,course, year, sem, date;
//(bname varchar(30),bookid int,edition varchar(4),price int,stock int,
//publisher varchar(30),stdid int,name varchar(30),fname varchar(30),
//course varchar(20),branch varchar(20),year varchar(20),semester varchar(5));
//Query OK, 0 rows affected (0.19 sec)

//TextField txtName,txtBookID,txtPublisher,txtPrice,textStocks,Edition;
        
        JOptionPane.showMessageDialog(null, "The book is issued");
        }
        catch(SQLException ee)
        {
            System.out.println(ee);
        }
        }
        
//        public ArrayList<issue> xyz()
//        {
//            ArrayList<issue> pk=new ArrayList()
//            {
//                String query="select * from book";
//                try
//                {
//                    PreparedStatement pstm=DB.getConnection().prepareStatement(query);
//                    ResultSet rs=pstm.executeQuery();
//                    while(rs.next())
//                    {
//                        issue i;
//                        i =new issue(rs.getInt(1),
//                                rs.getString(2),
//                                rs.getInt(3),
//                                rs.getString(4);
//                        System.out.println(i);
//                        pk.add(i);
//                        
//                    }
//             
//                }
//                catch(SQLException e)
//                {
//                    e.printStackTrace();
//                }
//                return pk;
//                
//            }
//        }
        

    
    public static void main(String[] args) {
        new issue();
        
    }
}
