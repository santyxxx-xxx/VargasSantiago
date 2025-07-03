import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JButton REGISTROButton;
    private JButton VENTASButton;
    private JButton VERPRODUCTOSButton;
    private JPanel principal;

    public menu() {
        setTitle("MENU DE LA TIENDA");
        setContentPane(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);

        REGISTROButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VENTASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VERPRODUCTOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
