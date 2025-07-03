import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factura extends JFrame{
    private JPanel principal;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton CALCULARButton;
    private JButton REGRESARALMENUButton;

    public factura() {
        setTitle("FACTURA");
        setContentPane(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
