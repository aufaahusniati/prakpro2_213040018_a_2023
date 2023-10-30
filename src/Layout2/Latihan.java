/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Pertemuan 5
package Layout2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author ACER
 * 
 * AUFAA HUSNIATI
 * 213040018
 */

public class Latihan extends JFrame {
    private boolean checkBoxSelected;

    public Latihan() {
        // checkBoxSelected diberi nilai awal false
        this.checkBoxSelected = false;
        // Memberikan perintah bahwa ketika tombol window X ditekan, maka JavaGUI akan diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controlPanel = new JPanel();
        // controlPanel diberi layout FlowLayout
        controlPanel.setLayout(new FlowLayout());

        // Panel untuk menyimpan label, input, radio button, checkbox
        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        JPanel panel2 = new JPanel();
        panel2.setSize(100, 100);

        // Instansiasi GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        // Instansiasi GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        // Membuat label untuk judul form
        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);

        // Membuat label untuk input nama
        JLabel labelNama = new JLabel("Nama: ");

        // Membuat textfield untuk input nama
        JTextField textFieldNama = new JTextField();

        // Membuat label untuk input telepon
        JLabel labelTelepon = new JLabel("Nomor HP: ");

        // Membuat textfield untuk input nama
        JTextField textFieldTelepon = new JTextField();

        // Membuat label untuk input radio button
        JLabel labelRadio = new JLabel("Jenis Kelamin:");

        // Membuat radio button dengan nilai laki-laki dan true
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);

        // Membuat radio button dengan nilai perempuan
        JRadioButton radioButton2 = new JRadioButton("Perempuan");

        // Instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // Memasukan semua radio button ke bg
        bg.add(radioButton1);
        bg.add(radioButton2);

        // Membuat checkbox untuk verifikasi WNA
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");

        // Membuat button untuk simpan data
        JButton button = new JButton("Simpan");

        // Membuat textarea untuk output data
        JTextArea textArea = new JTextArea("");
        // Mengatur ukuran dan letak textarea
        textArea.setBounds(15, 350, 350, 100);

        // Atur ukuran objek GridBagConstraints menjadi memenuhi panjang horizontal
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // Atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // Atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 0;
        // Masukan labelNama dan objek GridBagConstraints ke panel
        panel.add(labelNama, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // Atur letak objek GridBagConstraints ke posisi y = 1
        gbc.gridy = 1;
        // Masukan textFieldNama dan objek GridBagConstraints ke panel 
        panel.add(textFieldNama, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // Atur letak objek GridBagConstraints ke posisi y = 2
        gbc.gridy = 2;
        // Masukan labelTelepon dan objek GridBagConstraints ke panel
        panel.add(labelTelepon, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // Atur letak objek GridBagConstraints ke posisi y = 3
        gbc.gridy = 3;
        // Masukan textFieldTelepon dan objek GridBagConstraints ke panel
        panel.add(textFieldTelepon, gbc);

        // Atur ukuran objek GridBagConstraints menjadi memenuhi panjang horizontal
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // Atur letak objek GridBagConstraints ke posisi x = 1
        gbc.gridx = 1;
        // Atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 0;
        // masukan labelRadio dan objek GridBagConstraints ke panel
        panel.add(labelRadio, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 1
        gbc.gridx = 1;
        // Atur letak objek GridBagConstraints ke posisi y = 1
        gbc.gridy = 1;
        // masukan radioButton1 dan objek GridBagConstraints ke panel
        panel.add(radioButton1, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 1
        gbc.gridx = 1;
        // Atur letak objek GridBagConstraints ke posisi y = 2
        gbc.gridy = 2;
        // Masukan radioButton2 dan objek GridBagConstraints ke panel
        panel.add(radioButton2, gbc);

        // Atur letak objek GridBagConstraints ke posisi x = 1
        gbc.gridx = 1;
        // Atur letak objek GridBagConstraints ke posisi y = 3
        gbc.gridy = 3;
        // Masukan checkBox dan objek GridBagConstraints ke panel
        panel.add(checkBox, gbc);

        // Atur ukuran objek GridBagConstraints menjadi memenuhi panjang vertikal
        gbc.fill = GridBagConstraints.VERTICAL;
        // Atur letak objek GridBagConstraints ke posisi x = 1
        gbc.gridx = 1;
        // Atur letak objek GridBagConstraints ke posisi y = 4
        gbc.gridy = 4;
        // Masukan button dan objek GridBagConstraints ke panel, nantinya
        panel2.add(button);

        // Memberikan action listener kepada checkbox
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // checkbox bernilai true jika event e yang menampung nilai 1, sebaliknya jika
                // event e tidak menampung nilai 1 maka nilainya akan false
                checkBoxSelected = e.getStateChange() == 1;
            }
        });

        // Memberikan action listener kepada button simpan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Membuat variabel jenisKelamin untuk menampung nilai dari radio button yang diklik
                String jenisKelamin = "";

                // Jika Laki-Laki diklik,
                if (radioButton1.isSelected()) {
                    // Maka jenisKelamin akan bernilai Laki-Laki
                    jenisKelamin = radioButton1.getText();
                    // Kembalikan radio button ke kondisi semula
                    radioButton1.setSelected(false);
                }
                
                // Jika Perempuan diklik,
                if (radioButton2.isSelected()) {
                    // Maka jenisKelamin akan bernilai Perempuan
                    jenisKelamin = radioButton2.getText();
                    // Kembalikan radio button ke kondisi semula
                    radioButton2.setSelected(false);
                }

                // Isi dari textfield (input user) disimpan ke variable nama
                String nama = textFieldNama.getText();
                // Variable nama dimasukan kedalam textarea
                textArea.append("Nama\t: " + nama + "\n");
                // Isi dari textfield (input user) disimpan ke variable nama
                String telepon = textFieldTelepon.getText();
                // Variable telepon dimasukan kedalam textarea
                textArea.append("Nomor HP\t: " + telepon + "\n");
                // Variable jenisKelamin dimasukan kedalam textarea
                textArea.append("Jenis Kelamin\t: " + jenisKelamin + "\n");

                // Jika checkBoxSelected bernilai true,
                if (checkBoxSelected) {
                    // string WNA: Ya dimasukan ke textarea
                    textArea.append("WNA\t: " + "Ya\n");
                }
                // Jika checkBoxSelected bernilai false,
                else {
                    // string WNA: Bukan dimasukan ke textarea
                    textArea.append("WNA\t: " + "Bukan\n");
                }
                textArea.append("==================================\n");
                // Kembalikan textfield nama dan telepon ke kondisi awal
                textFieldNama.setText("");
                textFieldTelepon.setText("");
                // Kembalikan checkbox ke kondisi awal
                checkBox.setSelected(false);
            }
        });

        // Masukan panel dan panel2 ke controlPanel
        controlPanel.add(panel);
        controlPanel.add(panel2);

        // Atur layout frame menjadi GridLayout dengan 4 baris, 1 kolom
        this.setLayout(new GridLayout(4, 1));
        // Masukan semua komponen tadi (headerLabel, controlPanel, panel2, textArea) keframe
        this.add(headerLabel);
        this.add(controlPanel);
        this.add(panel2);
        this.add(textArea);
        // Membuat frame dengan ukuran 400 x 500
        this.setSize(500, 500);
    }

    // Fungsi main
    public static void main(String[] args) {
        // Fungsi java swing yang dioverride untuk menjalankan JavaGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Instansiasi java class
                Latihan latihan = new Latihan();
                // Objek tersebut ditampilkan ke frame
                latihan.setVisible(true);
            }
        });
    }
}