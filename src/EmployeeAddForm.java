import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EmployeeAddForm extends Container {
    private JPanel emploeeAddPanel;
    private JTextField nameTextField;
    private JTextField depTextField;
    private JTextField ageTextField;
    private JTextField phoneTextField;
    private JComboBox posComboBox;
    private JRadioButton mRadioButton;
    private JRadioButton fRadioButton;
    private JRadioButton otherRadioButton;
    private JButton addButton;
    private JLabel nameLabel;
    private JLabel depLabel;
    private JLabel ageLabel;
    private JLabel phoneLabel;
    private JLabel posLabel;
    private JLabel genderLabel;

    public EmployeeAddForm() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Message text";
                JOptionPane.showMessageDialog(new JFrame(), message, "Windows title", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    JPanel getEmployeeAddPanel(){
        return emploeeAddPanel;
    }
}
