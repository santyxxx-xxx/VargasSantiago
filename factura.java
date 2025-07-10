import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factura extends JFrame{
    private JPanel principal;
    private JTextField txtCodigo;
    private JTextField txtProducto;
    private JTextField txtPrecio;
    private JTextField txtCantidad;
    private JButton CALCULARButton;
    private JButton REGRESARALMENUButton;
    private JButton LIMPIARButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel factura;
    private JLabel resumen;
    private double iva;
    private double subtotal;
    private double total;


    public factura() {
        setTitle("FACTURA");
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);

        String codigo = txtCodigo.getText();
        Producto p = BaseDatos.buscarProducto(codigo);

        if (p != null) {
            txtProducto.setText(p.getNombre());
            txtPrecio.setText(String.valueOf(p.getPrecio()));
            // Y luego puedes calcular la factura
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                Producto p = BaseDatos.buscarProducto(codigo);

                if (p == null) {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    return;
                }

// Cargar nombre y precio automáticamente
                txtProducto.setText(p.getNombre());
                txtPrecio.setText(String.valueOf(p.getPrecio()));

                int cantidad = Integer.parseInt(txtCantidad.getText());

                if (cantidad > p.getStock()) {
                    JOptionPane.showMessageDialog(null, "Stock insuficiente.");
                    return;
                }

                subtotal = cantidad * p.getPrecio();
                iva = subtotal * 0.15;
                total = subtotal + iva;

// Descontar stock
                p.setStock(p.getStock() - cantidad);

                textField1.setText(String.valueOf(subtotal));
                textField2.setText(String.valueOf(iva));
                textField3.setText("<html><b><font size='+1'>" + total + "</font></b></html>");

            }
        });
        REGRESARALMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new menu();
                dispose();

            }
        });
        LIMPIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("---");
                textField2.setText("---");
                textField3.setText("---");
                txtCantidad.setText("");
                txtCodigo.setText("");
                txtPrecio.setText("");
                txtProducto.setText("");
                resumen.setText("");
            }
        });
    }
}
