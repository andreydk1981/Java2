package Lesson_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App4 extends JFrame {

    public App4(){
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,20,300,75);
        add(textArea);

        JButton button1 = new JButton("Button#1");
        button1.setBounds(100,100,100,20);
        add (button1);

        StringBuilder sb = new StringBuilder();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sb.append("text").append("\n");
                textArea.setText(sb.toString());
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new App4();
    }
}
