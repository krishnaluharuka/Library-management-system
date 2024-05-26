/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login {
    JFrame f;
    JLabel un,pw;
    JTextField username;
    JPasswordField password;
    Font f1,f2;
    JButton b;


    login()
    {
            f = new JFrame("login");
            f.setSize(500,400);
            f.setLocationRelativeTo(null);
            f1=new Font("TIMES NEW ROMAN",Font.PLAIN,24);
            f2=new Font("TIMES NEW ROMAN",Font.PLAIN,28);

            un=new JLabel("Username");
            un.setBounds(70, 100, 150, 50);
            f.add(un);
            un.setFont(f2);

            pw=new JLabel("Password");
            pw.setBounds(70, 180, 150, 50);
             pw.setFont(f2);
            f.add(pw);
        
        
        username=new JTextField(20);
        username.setBounds(220, 100, 200, 50);
        f.add(username);
        username.setFont(f1);
        
        password=new JPasswordField( 50);
        password.setBounds(220, 180, 200, 50);
        f.add(password);
        
        b=new JButton("LOGIN");
        b.setBounds(200, 250, 100, 50);
        f.add(b);

        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    String uname=username.getText();
                    String pword=password.getText();
                    if(uname.equals("")&&pword.equals(""))
                    {
                            JOptionPane.showMessageDialog(f, 
                            "enter username and password", "warning", 0);
                    }
                    else if(uname.equals("")&&!pword.equals(""))
                    {
                       JOptionPane.showMessageDialog(f, 
                            "enter username", "warning", 0); 
                    }
                    else if(!uname.equals("")&&pword.equals(""))
                    {
                        JOptionPane.showMessageDialog(f, 
                            "enter password", "warning", 0);
                    }
                    else if(uname.equals("admin") && pword.equals("admin@123"))
                    {
                        new home();
                        f.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f, 
                            "enter correct password and username ", "warning", 0);
                    }
                    
                }
            });

            f.setLayout(null);
            f.setVisible(true);
           
    }
    public static void main(String[] args) {
        new login();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
