/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Calculator.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: sdeidre malevwork@gmail.com                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/12 03:47:51 by sdeidre           #+#    #+#             */
/*   Updated: 2019/10/18 12:28:50 by sdeidre          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;


public class Calculator implements ActionListener {

    JFrame frame = new JFrame("Theo's calculator"); //creating the main window
    JPanel panel = new JPanel();
    JTextArea text = new JTextArea(2, 9);


    JButton button1 = new JButton();  //creating buttons
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();
    JButton minus = new JButton();
    JButton multiplication = new JButton();
    JButton dot = new JButton();
    JButton division = new JButton();
    JButton plus = new JButton();
    JButton equal = new JButton();
    JButton eraser = new JButton();

    Double number1, number2, result;
    int addnum = 0, mulnum = 0, divnum = 0, subnum = 0;


    public Calculator() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(350, 420);
        frame.setTitle("Teo's calculator");
        frame.setResizable(false);

        frame.add(panel);
        panel.setBackground(Color.WHITE);
       
        panel.add(text);
        Font font = new Font("Verdana", Font.BOLD, 32);
        text.setFont(font);
        Border D = BorderFactory.createLineBorder(Color.WHITE, 1);
        text.setBorder(D);
        text.setForeground(Color.BLACK);
        text.setBackground(Color.WHITE);
        text.setLineWrap(true);
        text.setPreferredSize(new Dimension(2, 10));

        button1.setPreferredSize(new Dimension(100, 40));
        button1.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkone.png"));

        button2.setPreferredSize(new Dimension(100, 40));
        button2.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinktwo.png"));

        button3.setPreferredSize(new Dimension(100, 40));
        button3.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkthree.png"));

        button4.setPreferredSize(new Dimension(100, 40));
        button4.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkfour.png"));

        button5.setPreferredSize(new Dimension(100, 40));
        button5.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkfive.png"));

        button6.setPreferredSize(new Dimension(100, 40));
        button6.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkseven.png"));

        button7.setPreferredSize(new Dimension(100, 40));
        button7.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkseven.png"));

        button8.setPreferredSize(new Dimension(100, 40));
        button8.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkeight.png"));

        button9.setPreferredSize(new Dimension(100, 40));
        button9.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinknine.png"));

        button0.setPreferredSize(new Dimension(100, 40));
        button0.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\pinkzero.png"));

        dot.setPreferredSize(new Dimension(100, 40));
        dot.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\dot.png"));

        minus.setPreferredSize(new Dimension(100, 40));
        minus.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\min.png"));

        multiplication.setPreferredSize(new Dimension(100, 40));
        multiplication.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\mul.png"));

        division.setPreferredSize(new Dimension(100, 40));
        division.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\div.png"));

        plus.setPreferredSize(new Dimension(100, 40));
        plus.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\add.png"));

        equal.setPreferredSize(new Dimension(205, 40));
        equal.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\eq.png"));

        eraser.setPreferredSize(new Dimension(100, 40));
        eraser.setIcon(new ImageIcon("C:\\Users\\1\\Pictures\\Camera Roll\\calc\\clear.png"));

        panel.add(button1);   //after setting the images, we add them
        panel.add(button2);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(dot);
        panel.add(minus);
        panel.add(multiplication);
        panel.add(division);
        panel.add(plus);
        panel.add(equal);
        panel.add(eraser);


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        dot.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        equal.addActionListener(this);
        eraser.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == eraser) {
            number1 = 0.0;
            number2 = 0.0;
            text.setText("");

        }


        if (source == button1) {
            text.append("1");


        }
        if (source == button2) {
            text.append("2");


        }
        if (source == button3) {
            text.append("3");


        }
        if (source == button4) {
            text.append("4");


        }
        if (source == button5) {
            text.append("5");


        }
        if (source == button6) {
            text.append("6");


        }
        if (source == button7) {
            text.append("7");


        }
        if (source == button8) {
            text.append("8");


        }
        if (source == button9) {
            text.append("9");


        }
        if (source == button0) {
            text.append("0");


        }
        if (source == dot) {
            text.append(".");

        }
        if (source == plus) {
            number1 = number_reader();
            text.setText("");
            addnum = 1;
            mulnum = 0;
            divnum = 0;
            subnum = 0;
        }
        if (source == minus) {
            number1 = number_reader();
            text.setText("");
            addnum = 0;
            mulnum = 0;
            divnum = 0;
            subnum = 1;
        }

        if (source == division) {
            number1 = number_reader();
            text.setText("");
            addnum = 0;
            mulnum = 0;
            divnum = 1;
            subnum = 0;
        }

        if (source == multiplication) {
            number1 = number_reader();
            text.setText("");
            addnum = 0;
            mulnum = 1;
            divnum = 0;
            subnum = 0;
        }
        if (source == equal) {
            number2 = number_reader();
            if (addnum > 0) {
                result = number1 + number2;
                text.setText(Double.toString(result));

            }
            if (subnum > 0) {
                result = number1 - number2;
                text.setText(Double.toString(result));

            }
            if (mulnum > 0) {
                result = number1 * number2;
                text.setText(Double.toString(result));

            }
            if (divnum > 0) {
                result = number1 / number2;
                text.setText(Double.toString(result));

            }


        }


    }

    public double number_reader() {
        Double num1;
        String s;
        s = text.getText();
        num1 = Double.valueOf(s);
        return num1;

    }
}