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

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo=txtCodigo.getText();
                String producto=txtProducto.getText();
                Double precio=Double.parseDouble(txtPrecio.getText());
                int cantidad= Integer.parseInt(txtCantidad.getText());
                subtotal=cantidad*precio;
                iva=subtotal*0.15;
                total=subtotal+iva;
                textField1.setText(String.valueOf(subtotal));
                textField2.setText(String.valueOf(iva));
                textField3.setText(String.valueOf(total));



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
