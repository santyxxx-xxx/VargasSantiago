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
                if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() ||
                        txtDetalle.getText().isEmpty() || txtPrecio.getText().isEmpty() ||
                        txtStock.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                    return;
                }

                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String detalle = txtDetalle.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                int stock = Integer.parseInt(txtStock.getText());

                Producto nuevo = new Producto(codigo, nombre, detalle, stock, precio);
                BaseDatos.productos.add(nuevo);

                // 1. Mostrar mensaje primero
                JOptionPane.showMessageDialog(null, "Producto registrado exitosamente.");




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
