package codekamp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculator");
        Calculator calculator=new Calculator();
        frame.add(calculator.panel1);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
