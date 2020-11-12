package com.kea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends Frame {

    private Label header, elL, brillerL;
    private Button calculate, elY, elN, brillerY, brillerN;

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
    }


    public void coverageSelection() {


    }


}
