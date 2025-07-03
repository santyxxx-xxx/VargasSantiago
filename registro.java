import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro extends JFrame{
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtDetalle;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JButton GUARDARButton;
    private JButton VOLVERButton;
    private JPanel principal;
    private JButton LIMPIARButton;

    public registro() {
        setTitle("REGISTRO");
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);


        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo= txtCodigo.getText();
                String detalle=txtDetalle.getText();
                String nombre=txtNombre.getText();
                int stock= Integer.parseInt(txtStock.getText());
                mostrar m1= new mostrar();
                m1.setDatos(nombre,detalle,codigo,stock);
                m1.setVisible(true);
            }
        });
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new menu();
                dispose();

            }
        });
        LIMPIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtDetalle.setText("");
                txtPrecio.setText("");
                txtStock.setText("");
            }
        });
    }
}
