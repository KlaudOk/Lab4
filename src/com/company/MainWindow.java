package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainWindow extends JFrame{


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("undefined");
    }

    public MainWindow(String title) throws HeadlessException {
        super(title);
        buildFrame();
    }

    protected void buildFrame() {

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        //JLabel lblLogin = new JLabel("Login:");
        //lblLogin.setBounds(50,50,90,50);
        //contentPane.add(lblLogin);

        //JLabel lblPassword = new JLabel("Password:");
        //lblPassword.setBounds(50,100,90,50);
        //contentPane.add(lblPassword);

        //JTextField loginField;
        //loginField = new JTextField();
        //loginField.setBounds(120,65,100,20);
        //contentPane.add(loginField);

        //JPasswordField passField;
        //passField = new JPasswordField();
        //passField.setBounds(120,115,100,20);
        //contentPane.add(passField);

        JButton logButton = new JButton("Log in");
        logButton.setBounds(170,150,80,20);
        logButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Random r = new Random();
                int x = r.nextInt(200);
                int y = r.nextInt(200);
                logButton.setLocation(x,y);
            }
        });
        logButton.setEnabled(true);
        logButton.setMnemonic(KeyEvent.VK_L);
        contentPane.add(logButton);

        JButton canButton = new JButton("Cancel");
        canButton.setBounds(270,150,80,20);
        canButton.setEnabled(true);
        canButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                logButton.setLocation(170,150);
            }
        });
        contentPane.add(canButton);



    }


}
