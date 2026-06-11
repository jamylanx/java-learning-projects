import java.lang.*;
import java.awt.*;
public class GUI5
extends Frame {
private String[] label = {"1", "2", "3", "+","4", "5", "6", "-", "7", "8", "9", "*",
"C", "0", "=", "/"};
public GUI5() {
super("Calculator");
Panel numberPad = new Panel();
numberPad.setLayout(new GridLayout(4, 4));
for (int i = 0; i < label.length; i++)
numberPad.add(new Button(label[i]));
Panel base = new Panel();
base.setLayout(new BorderLayout());
TextField display = new TextField("0", 10);
display.setBackground(Color.black);
display.setForeground(Color.green);
base.add(display, BorderLayout.NORTH);
base.add(numberPad, BorderLayout.CENTER);
add(base, BorderLayout.CENTER);
pack();
}
public static void main(String[] args) {
GUI5 calc = new GUI5();
calc.setVisible(true);
}
}