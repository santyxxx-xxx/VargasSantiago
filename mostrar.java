import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mostrar extends JFrame{
    private JButton REGRESARALMENUButton;
    private JPanel principal;
    private JLabel cod;
    private JLabel nom;
    private JLabel st;
    private JLabel det;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private String codigo,nombre, detalle;
    private int stock;

    public mostrar() {
        setTitle("INFORMACION");
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);


        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new menu();
                dispose();

            }
        });
    }
    public void setDatos(String nombre, String codigo, String detalle, int stock) {
        cod.setText(codigo);
        nom.setText(nombre);
        det.setText(detalle);
        st.setText(String.valueOf(stock));
    }
}
