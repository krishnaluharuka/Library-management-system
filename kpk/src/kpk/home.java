/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home
{
    JFrame j;
    JLabel p2;
    JPanel p1,p3;
    Font f1,f2;
    JButton create,retrieve,delete,create2,return1,reset,book,students;
    home()
    {
        j=new JFrame("Our Home Page");
        j.setSize(600,250);
        j.setLocationRelativeTo(null);

        f1=new Font("TIMES NEW ROMAN",Font.PLAIN,24);
        f2=new Font("TIMES NEW ROMAN",Font.PLAIN,28);

        
        p3=new JPanel();
        p3.setBounds(0, 0, 500, 250);
        p2=new JLabel();
        p2.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\java 2\\kpk\\jmc.jpg"));
        p3.add(p2);
        
        p1=new JPanel();
        p1.setBounds(0, 250, 500, 50);
        p1.setLayout(new GridLayout(3,3));
        
        
        create=new JButton("ADD BOOK");
        p1.add(create);
        create.setFont(f1);

        create.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                j.setVisible(false);
            new Book().setVisible(true);
            }
        });

        create2=new JButton("ADD STUDENTS");
        p1.add(create2);
        create2.setFont(f1);

        create2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                j.setVisible(false);
            new student().setVisible(true);
            }
        } );


       

//        uptodate=new JButton("UPDATE USER");
//        j.add(uptodate);
//        uptodate.setFont(f1);

//        students=new JButton("STUDENTS DETAILS");
//        p1.add(students);
//        students.setFont(f1);
//        
//        students.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e1)
//            {
//                
//            }
//        } );
//
//        book=new JButton("BOOK DETAILS");
//        p1.add(book);
//        book.setFont(f1);
//
//        book.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e1)
//            {
//                
//            }
//        });
        
        retrieve=new JButton("ISSUE BOOK");
        p1.add(retrieve);
        retrieve.setFont(f1);
        
        retrieve.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                j.setVisible(false);
            new issue().setVisible(true);
            }
        } );
        
        create=new JButton("RETURN BOOK");
        p1.add(create);
        create.setFont(f1);

        create.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                j.setVisible(false);
                new returnbook().setVisible(true);
            }
        });

       

//        infou=new JButton("INFO USER");
//        p1.add(infou);
//        infou.setFont(f1);
//
//        infob=new JButton("INFO BOOK");
//        p1.add(infob);
//        infob.setFont(f1);

         delete=new JButton("STATISTICS");
        p1.add(delete);
        delete.setFont(f1);
        
        delete.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ee)
           {
               j.setVisible(false);
            new stat().setVisible(true);
           }
        });

        reset=new JButton("LOGOUT");
        p1.add(reset);
        reset.setFont(f1);
        
         reset.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ee)
           {
               j.setVisible(false);
            new login().setVisible(true);
           }
        });
        
       
        
        j.setLayout(new BorderLayout());
        j.add(p3,"North");
        j.add(p1,"South");

        j.setVisible(true);
    }
    public static void main(String[] args) {
        new home();

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
