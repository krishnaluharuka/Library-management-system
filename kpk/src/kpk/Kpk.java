package kpk;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;


public class Kpk
{
    JFrame f;
    Kpk()
    {
        JFrame j=new JFrame("Welcome To K.P.K. Project");
        j.setLocation(350, 50);
        ImageIcon i=new ImageIcon("C:\\Users\\Dell\\Desktop\\java 2\\kpk\\tech.jpg");
        j.add(new JLabel(i));
        j.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e)
        {
           j.dispose();
           new login();
        }  
        });
       j.pack();
       j.setVisible(true);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Kpk kpk = new Kpk();
    }
}

