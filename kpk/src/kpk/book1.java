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


class book1 {

    JFrame F;

    JLabel l, lblbID, lbluID, lblperiod, lblidate;

    JTextField bID, uID,period, idate;

    JButton submit;

    book1() {

        F = new JFrame("Form");

        F.setSize(700, 600);


        l = new JLabel("Issued book");

        l.setBounds(200, 30, 300, 30);

        l.setFont(new Font("Arial", Font.BOLD, 30));

        Font labelFont =new Font("arial", Font.BOLD, 18);

        l.setForeground(Color.RED);

        F.add(l);


        lblbID = new JLabel("Book ID(BID):");

        lblbID.setBounds(100, 100, 100, 30);

        lblbID.setFont(labelFont);

        F.add(lblbID);


        bID = new JTextField();

        bID.setBounds(210, 100, 300, 30);

        F.add(bID);


        lbluID = new JLabel("User Id(UID):");

        lbluID.setBounds(100, 150, 100, 30);

        lbluID.setFont(labelFont);

        F.add(lbluID);


        uID= new JTextField();

        uID.setBounds(210, 150, 300, 30);

        F.add(uID);


        lblperiod = new JLabel("Period(days):");

        lblperiod.setBounds(100, 200, 100, 30);

    

        F.add(lblperiod);


        period = new JTextField();

        period.setBounds(210, 200, 300, 30);

        F.add(period);


        lblidate= new JLabel("Issue Date(DD-MM-YYYY):");

        lblidate.setBounds(100, 250, 100, 30);

        lblidate.setFont(labelFont);

        F.add(lblidate);


        idate = new JTextField("DD-MM-YYYY");

        idate.setBounds(210, 250, 150, 30);

        F.add(idate);

        submit = new JButton("Submit");

        submit.setBounds(100, 300, 100, 30);

        submit.setBackground(Color.BLACK);

        submit.setForeground(Color.WHITE);

        F.add(submit);


        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               if(e.getSource()==submit)
               {
                   System.out.println("Book Issued!");
               }


            }

        });


        F.setLayout(null);

        F.setVisible(true);

    }


    public static void main(String[] args) {

        new book1();

    }

}




