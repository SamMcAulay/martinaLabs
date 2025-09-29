import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI1 {

    public static void main(String[] args) {

        JFrame window = new JFrame("Hello World");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("CLICK THE BUTTON");
        JButton button = new JButton("DO NOT CLICK!!!!");

        button.setPreferredSize(new Dimension(150, 28));

        panel.add(label);
        panel.add(button);

        window.getContentPane().add(panel);
        window.pack();
        window.setSize(300, 250);
        window.setVisible(true);
    }
}
