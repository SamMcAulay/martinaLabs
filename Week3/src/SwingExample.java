import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample implements ActionListener {

    JCheckBox cb = new JCheckBox("yes", false);
    JFrame window = new JFrame("Title");

    JButton leftButon = new JButton("Left");
    JButton middleButon = new JButton("middle");
    JButton rightButon = new JButton("Right");
    JLabel label = new JLabel("Nothing Pressed");

    JPanel p = new JPanel();

    public SwingExample(){

        leftButon.addActionListener(this);
        middleButon.addActionListener(this);
        rightButon.addActionListener(this);

        cb.addActionListener(this);

        p.add(leftButon);
        p.add(middleButon);
        p.add(rightButon);
        p.add(cb);
        window.add(label);
        window.getContentPane().add(p,BorderLayout.NORTH);
        window.pack();
        window.setVisible(true);
        window.setSize(300,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(cb.isSelected()){
            label.setText("clicked");
        }
        if(!cb.isSelected()){
            label.setText("nothing pressed");
        }

        if(e.getSource() == leftButon){
            label.setText("Left");
            p.setBackground(Color.RED);
        }
        if(e.getSource() == middleButon){
            label.setText("middle");
            p.setBackground(Color.GREEN);
        }
        if(e.getSource() == rightButon){
            label.setText("Right");
            p.setBackground(Color.YELLOW);
        }

    }
}
