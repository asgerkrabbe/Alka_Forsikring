package com.kea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class GUI extends Frame implements ActionListener {
    InsuranceData insuranceData = new InsuranceData();
    ArrayList<Integer> price = new ArrayList<>();

    private Label header, elL, brillerL, ekstremL, tandL, cykelL;
    private Button calculate, elY, elN, brillerY, brillerN, ekstremY, ekstremN, tandY, tandN, cykelY,cykelN;
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
        elN.addActionListener(this::coverageSelection);


        brillerL = new Label("Dækning ved skade på briller.");
        brillerL.setBounds(20, 150, 250, 50);
        add(brillerL);

        brillerY = new Button("Ja");
        brillerY.setBounds(300, 160, 50, 25);
        add(brillerY);

        brillerN = new Button("Nej");
        brillerN.setBounds(350, 160, 50, 25);
        add(brillerN);
        brillerY.addActionListener(this::coverageSelection);
        brillerN.addActionListener(this::coverageSelection);

        calculate = new Button("Beregn");
        calculate.setBounds(225, 400, 50, 25);
        add(calculate);
        calculate.addActionListener(this::coverageSelection);


        ekstremL = new Label("Dækning af ekstremsport");
        ekstremL.setBounds(20, 200, 50, 25);
        add(ekstremL);

        test = new TextField();
        test.setBounds(100, 400, 100, 25);
        add(test);

    }


    public void coverageSelection(ActionEvent e) {

        if (e.getSource() == elY) {
            elY.setVisible(false);
            elN.setVisible(false);
            price.add(insuranceData.getElektronik());
        } else if (e.getSource() == elN) {
            elY.setVisible(false);
            elN.setVisible(false);
        }

        if (e.getSource() == brillerY) {
            brillerY.setVisible(false);
            brillerN.setVisible(false);
            price.add(insuranceData.getBriller());
        } else if (e.getSource() == brillerN) {
            brillerY.setVisible(false);
            brillerN.setVisible(false);
        }
        int sum = 0;
        if (e.getSource() == calculate) {

            for (int i = 0; i < price.size(); i++) {
                sum += price.get(i);
            }
            test.setText(Integer.toString(sum));
        }
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
