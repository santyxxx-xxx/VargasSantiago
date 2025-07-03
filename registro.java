import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton GUARDARButton;
    private JButton VOLVERButton;
    private JPanel principal;

    public registro() {
        setTitle("REGISTRO");
        setContentPane(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);


        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
