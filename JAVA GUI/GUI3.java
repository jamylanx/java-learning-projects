import java.lang.*;
import java.awt.*;
public class GUI3 {
public GUI3 () {
Frame frame = new Frame("FlowLayout");
frame.setLayout(new FlowLayout());
frame.add(new Button("One"));
frame.add(new Button("Two"));
frame.add(new Button("Three"));
frame.setSize(200, 100);
frame.setVisible(true);
}
public static void main(String[] args) {
GUI3 ex = new GUI3 ();
}
}