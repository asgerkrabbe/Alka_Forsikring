package com.kea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends Frame implements ActionListener{

    private Label header, elL, brillerL, l1;
    private Button calculate, elY, elN, brillerY, brillerN;
    private TextField test;

    public void insuranceFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        header = new Label("KRABBE INSURANCE INC.");
        header.setBounds(150, 50, 400, 50);
        add(header);

        elL = new Label("Dækning ved skade på elektronik.");
        elL.setBounds(20, 100, 250, 50);
        add(elL);

        elY = new Button("Ja");
        elY.setBounds(300, 110, 50, 25);
        add(elY);

        elN = new Button("Nej");
        elN.setBounds(350, 110, 50, 25);
        add(elN);

        elY.addActionListener(this::coverageSelection);

        brillerL = new Label("Dækning ved skade på briller.");
        brillerL.setBounds(20, 150, 250, 50);
        add(brillerL);

        brillerY = new Button("Ja");
        brillerY.setBounds(300, 160, 50, 25);
        add(brillerY);

        brillerN = new Button("Nej");
        brillerN.setBounds(350, 160, 50, 25);
        add(brillerN);


        calculate = new Button("Beregn");
        calculate.setBounds(225, 400, 50, 25);
        add(calculate);


        l1 = new Label("Test");
        l1.setBounds(400, 400, 50, 25);
        add(l1);

        test = new TextField("");
        test.setBounds(100,400,100,25);
        add(test);
    }


    public void coverageSelection(ActionEvent e) {

        if (e.getSource() == elY) {
            test.setText("success");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
