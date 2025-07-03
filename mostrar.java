import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mostrar extends JFrame{
    private JButton REGRESARALMENUButton;

    public mostrar() {
        setTitle("INFORMACION");
        setContentPane(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);

        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
