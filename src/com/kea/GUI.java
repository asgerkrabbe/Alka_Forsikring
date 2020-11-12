package com.kea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class GUI extends Frame implements ActionListener {
    Job job = new Job();
    Choice c = new Choice();
    InsuranceData insuranceData = new InsuranceData();
    ArrayList<Integer> price = new ArrayList<>();

    private Label header, elL, brillerL, ekstremL, tandL, cykelL, lb1;
    private Button calculate, elY, elN, brillerY, brillerN, ekstremY, ekstremN, tandY, tandN, cykelY, cykelN;
    private TextField tf;

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
        elL.setBounds(20, 100, 250, 45);
        elY = new Button("Ja");
        elY.setBounds(300, 100, 50, 45);
        elN = new Button("Nej");
        elN.setBounds(350, 100, 50, 45);
        elY.addActionListener(this::coverageSelection);
        elN.addActionListener(this::coverageSelection);
        add(elL);
        add(elY);
        add(elN);

        brillerL = new Label("Dækning ved skade på briller.");
        brillerL.setBounds(20, 150, 250, 45);
        brillerY = new Button("Ja");
        brillerY.setBounds(300, 150, 50, 45);
        brillerN = new Button("Nej");
        brillerN.setBounds(350, 150, 50, 45);
        brillerY.addActionListener(this::coverageSelection);
        brillerN.addActionListener(this::coverageSelection);
        add(brillerL);
        add(brillerY);
        add(brillerN);


        ekstremL = new Label("Dækning af ekstremsport");
        ekstremL.setBounds(20, 200, 250, 45);
        ekstremY = new Button("Ja");
        ekstremY.setBounds(300, 200, 50, 45);
        ekstremN = new Button("Nej");
        ekstremN.setBounds(350, 200, 50, 45);
        ekstremY.addActionListener(this::coverageSelection);
        ekstremN.addActionListener(this::coverageSelection);
        add(ekstremL);
        add(ekstremY);
        add(ekstremN);

        tandL = new Label("Dækning ved tandskade.");
        tandL.setBounds(20, 250, 250, 50);
        tandY = new Button("Ja");
        tandY.setBounds(300, 250, 50, 45);
        tandN = new Button("Nej");
        tandN.setBounds(350, 250, 50, 45);
        tandY.addActionListener(this::coverageSelection);
        tandN.addActionListener(this::coverageSelection);
        add(tandL);
        add(tandY);
        add(tandN);

        cykelL = new Label("Dækning ved cykeltyvri.");
        cykelL.setBounds(20, 300, 250, 50);
        cykelY = new Button("Ja");
        cykelY.setBounds(300, 300, 50, 45);
        cykelN = new Button("Nej");
        cykelN.setBounds(350, 300, 50, 45);
        cykelY.addActionListener(this::coverageSelection);
        cykelN.addActionListener(this::coverageSelection);
        add(cykelL);
        add(cykelY);
        add(cykelN);

        calculate = new Button("Beregn");
        calculate.setBounds(225, 400, 50, 20);
        add(calculate);
        calculate.addActionListener(this::coverageSelection);

        tf = new TextField();
        tf.setBounds(100, 400, 100, 20);
        add(tf);
        tf.setEditable(false);

        lb1 = new Label("Vælg uddannelse");
        lb1.setBounds(350,350,120,50);
        add(lb1);

        c.setBounds(350, 400, 120, 50);
        add(c);

        for (int i = 0; i < job.jobs.length; i++) {
            c.add(job.jobs[i]);
    }

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

        if (e.getSource() == ekstremY) {
            ekstremY.setVisible(false);
            ekstremN.setVisible(false);
            price.add(insuranceData.getEkstremSport());
        } else if (e.getSource() == ekstremN) {
            ekstremY.setVisible(false);
            ekstremN.setVisible(false);
        }

        if (e.getSource() == tandY) {
            tandY.setVisible(false);
            tandN.setVisible(false);
            price.add(insuranceData.getTandskader());
        } else if (e.getSource() == tandN) {
            tandY.setVisible(false);
            tandN.setVisible(false);
        }

        if (e.getSource() == cykelY) {
            cykelY.setVisible(false);
            cykelN.setVisible(false);
            price.add(insuranceData.getCykelErstatning());
        } else if (e.getSource() == cykelN) {
            cykelY.setVisible(false);
            cykelN.setVisible(false);
        }


        int sum = 0;
        if (e.getSource() == calculate) {

            for (int i = 0; i < price.size(); i++) {
                sum += price.get(i);
            }
            tf.setText(Integer.toString(sum));
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
