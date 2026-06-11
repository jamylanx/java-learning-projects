import javax.swing.*;
import java.awt.*;

public class GenderAndCivilStatus extends JFrame {
    private JLabel genderLabel;
    private JCheckBox maleCheckBox, femaleCheckBox;
    private JLabel statusLabel;
    private JCheckBox singleCheckBox, takenCheckBox, marriedCheckBox, widowCheckBox;

    public GenderAndCivilStatus() {
        setTitle("Gender and Civil Status");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Create the Gender label and checkboxes
        genderLabel = new JLabel("Gender");
        maleCheckBox = new JCheckBox("Male");
        femaleCheckBox = new JCheckBox("Female");

        // Create the Civil Status checkboxes
        statusLabel = new JLabel("Civil Status");
        singleCheckBox = new JCheckBox("Single");
        takenCheckBox = new JCheckBox("Taken");
        marriedCheckBox = new JCheckBox("Married");
        widowCheckBox = new JCheckBox("Widow");

        // Add components to the panel
        panel.add(genderLabel);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(maleCheckBox);
        panel.add(femaleCheckBox);
        panel.add(statusLabel);
        panel.add(new JLabel());
        panel.add(singleCheckBox);
        panel.add(marriedCheckBox);
        panel.add(widowCheckBox);
        panel.add(takenCheckBox);

        // Add the panel to the frame
        add(panel);

        // Center the frame
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GenderAndCivilStatus genderAndCivilStatus = new GenderAndCivilStatus();
            genderAndCivilStatus.setVisible(true);
        });
    }
}
