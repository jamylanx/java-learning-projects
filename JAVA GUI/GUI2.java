import javax.swing.*;
import java.awt.*;

public class GUI2 {
    private String[] label = {"A", "B", "C", "D", "E", "F"};

    public GUI2() {
        JFrame frame = new JFrame("GridLayout");
        frame.setLayout(new GridLayout(3, 2));
        for (int i = 0; i < label.length; i++)
            frame.add(new JButton(label[i]));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GUI2 ex = new GUI2();
    }
}
