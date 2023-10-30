/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomponenSwingDasar;

/**
 *
 * @author ACER
 */
import java.awt.event.*;
import javax.swing.*;

public class Latihan2 extends JFrame {
    public Latihan2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("INPUT NAMA : ");
        labelInput.setBounds(130, 40, 400, 10);
        
        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);
        
         JLabel labelInput2 = new JLabel("INOMOR TELEPON : ");
        labelInput2.setBounds(130, 100, 400, 10);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(130, 120, 100, 30);
        
        JButton button = new JButton("SUBMIT");
        button.setBounds(130, 165, 100, 40);
        
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(105, 210, 150, 100);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String nomor = textField2.getText();
                txtOutput.append("Nama : " + nama + "\n" + "No. Telp : " + nomor +"\n");
                textField.setText("");
            }
        });
        
        this.add(textField2);
        this.add(labelInput2);
        this.add(txtOutput);
        this.add(textField);
        this.add(button);
        this.add(labelInput);
        
        this.setSize(400, 500);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan2 b = new Latihan2();
                b.setVisible(true);
            }
        });
    }
}   
