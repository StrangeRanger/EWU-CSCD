import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Calculator2 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JButton                   btn1             = new JButton("1");
    JButton                   btn2             = new JButton("2");
    JButton                   btn3             = new JButton("3");
    JButton                   btn_add          = new JButton("+");
    JButton                   btn4             = new JButton("4");
    JButton                   btn5             = new JButton("5");
    JButton                   btn6             = new JButton("6");
    JButton                   btn_sub          = new JButton("-");
    JButton                   btn7             = new JButton("7");
    JButton                   btn8             = new JButton("8");
    JButton                   btn9             = new JButton("9");
    JButton                   btn_mult         = new JButton("*");
    JButton                   btn0             = new JButton("0");
    JButton                   btn_dot          = new JButton(".");
    JButton                   btn_del          = new JButton("DEL");
    JButton                   btn_div          = new JButton("/");

    JButton btn_lpr = new JButton("(");
    JButton btn_rpr = new JButton(")");
    JButton btn_pow = new JButton("^");
    JButton btn_equ = new JButton("=");

    JTextArea txt        = new JTextArea();
    String    str_number = "";

    public Calculator2() {
        JFrame frame = new JFrame("Simple Java Caculator");
        frame.setSize(320, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        // frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));

        JPanel HeadPanel   = new JPanel();
        JPanel NumberPanel = new JPanel();
        JPanel LabelPanel  = new JPanel();

        LabelPanel.setBackground(Color.LIGHT_GRAY);
        HeadPanel.setBackground(Color.LIGHT_GRAY);
        NumberPanel.setLayout(new GridLayout(5, 4));
        // LabelPanel.setLayout(new BorderLayout());
        LabelPanel.setLayout(new GridLayout(1, 1));

        NumberPanel.add(btn1);
        btn1.addActionListener(this);
        NumberPanel.add(btn2);
        btn2.addActionListener(this);
        NumberPanel.add(btn3);
        btn3.addActionListener(this);
        NumberPanel.add(btn_add);
        btn_add.addActionListener(this);

        NumberPanel.add(btn4);
        btn4.addActionListener(this);
        NumberPanel.add(btn5);

        btn5.addActionListener(this);
        NumberPanel.add(btn6);
        btn6.addActionListener(this);
        NumberPanel.add(btn_sub);
        btn_sub.addActionListener(this);

        NumberPanel.add(btn7);
        btn7.addActionListener(this);
        NumberPanel.add(btn8);
        btn8.addActionListener(this);
        NumberPanel.add(btn9);
        btn9.addActionListener(this);
        NumberPanel.add(btn_mult);
        btn_mult.addActionListener(this);

        NumberPanel.add(btn0);
        btn0.addActionListener(this);
        NumberPanel.add(btn_dot);
        btn_dot.addActionListener(this);
        NumberPanel.add(btn_del);
        btn_del.addActionListener(this);
        NumberPanel.add(btn_div);
        btn_div.addActionListener(this);
        LabelPanel.add(txt);

        // LabelPanel.add(btn_equ);
        NumberPanel.add(btn_lpr);
        btn_lpr.addActionListener(this);
        NumberPanel.add(btn_rpr);
        btn_rpr.addActionListener(this);
        NumberPanel.add(btn_pow);
        btn_pow.addActionListener(this);
        NumberPanel.add(btn_equ);
        btn_equ.addActionListener(this);

        txt.setEditable(false);
        // btn_del.setEnabled(false);
        HeadPanel.add(new JLabel("A Java Calculator"));
        frame.add(LabelPanel);
        frame.add(NumberPanel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            str_number += "1";
            txt.setText(str_number);
        } else if (e.getSource() == btn2) {
            str_number += "2";
            txt.setText(str_number);
        } else if (e.getSource() == btn3) {
            str_number += "3";
            txt.setText(str_number);
        } else if (e.getSource() == btn4) {
            str_number += "4";
            txt.setText(str_number);
        } else if (e.getSource() == btn5) {
            str_number += "5";
            txt.setText(str_number);
        } else if (e.getSource() == btn6) {
            str_number += "6";
            txt.setText(str_number);
        } else if (e.getSource() == btn7) {
            str_number += "7";
            txt.setText(str_number);
        } else if (e.getSource() == btn8) {
            str_number += "8";
            txt.setText(str_number);
        } else if (e.getSource() == btn9) {
            str_number += "9";
            txt.setText(str_number);
        } else if (e.getSource() == btn0) {
            str_number += "0";
            txt.setText(str_number);
        } else if (e.getSource() == btn_lpr) {
            str_number += "(";
            txt.setText(str_number);
        } else if (e.getSource() == btn_rpr) {
            str_number += ")";
            txt.setText(str_number);
        } else if (e.getSource() == btn_pow) {
            str_number += "^";
            txt.setText(str_number);
        }

        else if (e.getSource() == btn_add) {
            str_number += "+";
            txt.setText(str_number);
        } else if (e.getSource() == btn_sub) {
            str_number += "-";
            txt.setText(str_number);
        } else if (e.getSource() == btn_mult) {
            str_number += "*";
            txt.setText(str_number);
        } else if (e.getSource() == btn_div) {
            str_number += "/";
            txt.setText(str_number);
        } else if (e.getSource() == btn_equ) {
            System.out.println("you clicked equal sign!");
            str_number += "=";
            txt.setText(str_number);
        } else if (e.getSource() == btn_dot) {
            System.out.println("you clicked dot button!");
            str_number += ".";
            txt.setText(str_number);
        } else if (e.getSource() == btn_del) {
            System.out.println("you clicked DEL button!");
        }
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
