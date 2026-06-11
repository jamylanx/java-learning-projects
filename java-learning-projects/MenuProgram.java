import javax.swing.*;
import java.awt.*;

public class MenuProgram {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Menu Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem viewItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Save As...");
        JMenuItem saveItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(viewItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem redoItem = new JMenuItem("Redo");
        editMenu.add(undoItem);
        editMenu.add(redoItem);
        menuBar.add(editMenu);

        JMenu viewMenu = new JMenu("View");
        JCheckBoxMenuItem toolbarItem = new JCheckBoxMenuItem("Toolbar");
        viewMenu.add(toolbarItem);
        menuBar.add(viewMenu);

        JMenu activitiesMenu = new JMenu("Activities");
        JMenuItem task1Item = new JMenuItem("Task 1");
        JMenuItem task2Item = new JMenuItem("Task 2");
        activitiesMenu.add(task1Item);
        activitiesMenu.add(task2Item);
        menuBar.add(activitiesMenu);

        JMenu aboutMenu = new JMenu("About");
        JMenuItem aboutItem = new JMenuItem("About this program");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "This is a simple Java menu program\n" +
                "Created by Beri, Marion A.\n" +
                "Date: 04/19/24\n" +
                "Version: 12",
                "About",
                JOptionPane.INFORMATION_MESSAGE));
        aboutMenu.add(aboutItem);
        menuBar.add(aboutMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}