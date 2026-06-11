import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuFrame {
public MenuFrame() {
JTextArea tArea = new JTextArea();
JFrame frame = new JFrame("Menu Frame");
JMenuBar menuBar = new JMenuBar();
frame.setJMenuBar(menuBar);
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
JMenu aboutMenu = new JMenu("About");
menuBar.add(fileMenu);
menuBar.add(editMenu);
//menuBar.setHelpMenu(aboutMenu);
fileMenu.add(new JMenuItem("Save"));
fileMenu.add(new JMenuItem("Save As..."));
fileMenu.add(new JMenuItem("Open"));
fileMenu.addSeparator();
fileMenu.add(new JMenuItem("Exit"));
frame.getContentPane().add(tArea);
frame.pack();
frame.setVisible(true);
}
public static void main(String[] args) {
MenuFrame aFrame = new MenuFrame();
}
}