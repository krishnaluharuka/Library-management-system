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
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class statistics extends JFrame {
    private JTable issuedTable;
    private JTable returnTable;
    Label lblTitle;
    private DefaultTableModel issuedTableModel;
    private DefaultTableModel returnTableModel;

    public statistics() {
        setTitle("Statistics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 500));
       
        lblTitle = new Label("Issued Details");
        lblTitle.setBounds(60, 10, 150, 30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 21));
        lblTitle.setForeground(Color.BLUE);
      


       
        lblTitle=new Label("Return Details");  
		lblTitle.setBounds(60,350,150,30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 21));
        lblTitle.setForeground(Color.BLUE);
    add(lblTitle);

        
        issuedTableModel = new DefaultTableModel();
        issuedTableModel.addColumn("Book ID");
        issuedTableModel.addColumn("Book Name");
        issuedTableModel.addColumn("Edition");
        issuedTableModel.addColumn("Publisher");
        issuedTableModel.addColumn("Price");
        issuedTableModel.addColumn("Stock");

        issuedTable = new JTable(issuedTableModel);
        JScrollPane issuedScrollPane = new JScrollPane(issuedTable);

   
        addIssuedSampleData();

    
        returnTableModel = new DefaultTableModel();
        returnTableModel.addColumn("Student ID");
        returnTableModel.addColumn("Student Name");
        returnTableModel.addColumn("Father's Name");
        returnTableModel.addColumn("Course");
        returnTableModel.addColumn("Branch");
        returnTableModel.addColumn("Year");
        returnTableModel.addColumn("Semester");

        returnTable = new JTable(returnTableModel);
        JScrollPane returnScrollPane = new JScrollPane(returnTable);

    
        addReturnSampleData();

        
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        });

        // Layout
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(issuedScrollPane, BorderLayout.NORTH);
        panel.add(returnScrollPane, BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.EAST);

        add(panel);

        pack();
        setLocationRelativeTo(null); 
    }

    public void JPopulate(){
        issue ist = new issue();
      //  ArrayList<
       ArrayList<kpk.issue> issue = ist.issueList();
    
}
    private void addIssuedSampleData() {
    
        Object[] book1 = {"", "", "", "", "", };
        Object[] book2 = {"", "", "", "", "", };
        Object[] book3 = {"", "", "", "", "", };

        issuedTableModel.addRow(book1);
        issuedTableModel.addRow(book2);
        issuedTableModel.addRow(book3);
    }

    private void addReturnSampleData() {
    
        Object[] student1 = {"", "","", "", "", "", ""};
        Object[] student2 = {"", "", "", "", "", "", ""};
        Object[] student3 = {"", "", "", "", "", "", ""};

        returnTableModel.addRow(student1);
        returnTableModel.addRow(student2);
        returnTableModel.addRow(student3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
             statistics app =new  statistics();
            app.setVisible(true);
        });
    }
}

