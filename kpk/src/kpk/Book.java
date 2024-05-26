/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;

/**
 *
 * @author Dell
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import static kpk.conn.con;

class Book extends Frame {
	Label lblTitle,lblBookID,lblName,lblPublisher,lblPrice,lblEdition,lblStocks;
	TextField txtName,txtBookID,txtPublisher,txtPrice,textStocks;
	Choice Edition;
	Button btnSave,btnClear;
        PreparedStatement s;
        
 
	public  Book() {
            super("BookForm");
            setSize(700, 600);
            setLocationRelativeTo(null);
            Color formColor = new Color(53, 59, 72);

            Font titleFont = new Font("arial", Font.BOLD, 25);
            Font labelFont =new  Font("arial", Font.BOLD, 20);
            Font textFont =new  Font("arial", Font.PLAIN, 15);

            lblTitle=new Label("New Book");  
            lblTitle.setBounds(50,40,300,50);
            lblTitle.setFont(titleFont);
            lblTitle.setForeground(Color.BLUE);
            add(lblTitle);

            lblName=new Label("Name");
            lblName.setBounds(50,100,150,30);
            lblName.setFont(labelFont);  
            lblName.setForeground(Color.BLACK);

            add(lblName);

            txtName=new TextField();
            txtName.setBounds(200,100,400,30);
            txtName.setFont(textFont);

            add(txtName);

            lblBookID=new Label("BookID");  
            lblBookID.setBounds(50,150,150,30);
            lblBookID.setFont(labelFont);

            lblBookID.setForeground(Color.BLACK);
            add(lblBookID);

            txtBookID=new TextField();
            txtBookID.setBounds(200,150,400,30);
            txtBookID.setFont(textFont);
            add(txtBookID);

            lblPublisher=new Label("Publisher");  
            lblPublisher.setBounds(50,200,150,30);
            lblPublisher.setFont(labelFont);

            lblPublisher.setForeground(Color.BLACK);
            add(lblPublisher);

            txtPublisher=new TextField();
            txtPublisher.setBounds(200,200,400,30);
            txtPublisher.setFont(textFont);
            add(txtPublisher);



            lblEdition=new Label("Edition");  
            lblEdition.setBounds(50,250,150,30);
            lblEdition.setFont(labelFont);
            lblEdition.setForeground(Color.BLACK);
            add(lblEdition);

            Edition= new Choice();
            Edition.setBounds(200,250, 250, 30);
            Edition.setFont(labelFont);
            Edition.add("1st");
            Edition.add("2nd");
            Edition.add("3rd");
            Edition.add("4th");
            add(Edition);



            lblPrice=new Label("Price");  
            lblPrice.setBounds(50,300,150,30);
            lblPrice.setFont(labelFont);
            lblPrice.setForeground(Color.BLACK);
            add(lblPrice);

            txtPrice=new TextField();
            txtPrice.setBounds(200, 300, 400, 30);
            txtPrice.setFont(textFont);
            add(txtPrice);


            lblStocks=new Label("Stocks");  
            lblStocks.setBounds(50,350,150,30);
            lblStocks.setFont(labelFont);
            lblStocks.setForeground(Color.BLACK);
            add(lblStocks);

            textStocks=new TextField();
            textStocks.setBounds(200,350,400,30);
            textStocks.setFont(textFont);
            add(textStocks);




            btnSave=new Button("Add");
            btnSave.setBounds(200,450,150,30);
            btnSave.setFont(labelFont);
            btnSave.setBackground(Color.BLACK);
            btnSave.setForeground(Color.WHITE);
            add(btnSave);

            btnClear=new Button("Back");
            btnClear.setBounds(360,450,150,30);
            btnClear.setFont(labelFont);
            btnClear.setBackground(Color.BLACK);
            btnClear.setForeground(Color.WHITE);
            add(btnClear);
            
        btnSave.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //dispose();
                try{
                conn.dbconnect();
                insert();
                conn.close();
                }
                catch(Exception ee)
                {

                }
                
            }
        });


            this.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                            System.exit(0);
                    }
            });

            btnClear.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                           setVisible(false);
                           new home().setVisible(true);

                    }
            });

        setLayout(null);
		setVisible(true);
	}
        
        public void insert()
        {
            String sql="Insert into book values(?,?,?,?,?,?)";
                    try
                    {
                        int i=Edition.getSelectedIndex();
                        s=con.prepareStatement(sql);
                        s.setString(1,txtName.getText());
                        s.setString(2,txtBookID.getText());
                        s.setString(3,Edition.getItem(i));
                        s.setString(4,txtPrice.getText());
                        s.setString(5,textStocks.getText());
                        s.setString(6,txtPublisher.getText());
                        s.executeUpdate();
                        JOptionPane.showMessageDialog(null,"A new nook is added");
                        
                        
                        
                    }
                    catch(Exception ee)
                    {
                        
                    }
        }
 

 
	public static void main(String[] args) {
		new Book();
	}}