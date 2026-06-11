import java.lang.*;
import java.awt.*;
public class GUI4 {
public GUI4() {
Panel panel = new Panel();
Choice choice = new Choice();
choice.add("Adidas");
choice.add("Nike");
choice.add("Reebok");
panel.add(choice);
Frame frame = new Frame("Choice");
frame.add(panel);
frame.pack();
frame.setVisible(true);
}
public static void main(String[] args) {
GUI4 cBox = new GUI4();
}
}