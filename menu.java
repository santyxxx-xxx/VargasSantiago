import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JButton REGISTROButton;
    private JButton VENTASButton;
    private JButton VERPRODUCTOSButton;
    private JPanel principal;
    private JButton REGRESARALMENUButton;

    public menu() {
        setTitle("MENU DE LA TIENDA");
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);

        REGISTROButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new registro();
                dispose();
            }
        });
        VENTASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new factura();
                dispose();
            }
        });
        VERPRODUCTOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new mostrar();
                dispose();
            }
        });
    }
}
