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
    private JTextField codigotxt;
    private JButton buscar;

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
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoIngresado = codigotxt.getText().trim();
                if (codigoIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un código de producto.");
                    return;
                }

                Producto p = BaseDatos.buscarProducto(codigoIngresado);
                if (p != null) {
                    setDatos(p.getCodigo(), p.getNombre(), p.getDetalle(), p.getStock());
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    cod.setText("Código: ---");
                    nom.setText("Nombre: ---");
                    det.setText("Detalle: ---");
                    st.setText("Stock: ---");
                }
            }
        });
    }
    public void setDatos(String codigo, String nombre, String detalle, int stock) {
        cod.setText("Código: " + codigo);
        nom.setText("Nombre: " + nombre);
        det.setText("Detalle: " + detalle);
        st.setText("Stock: " + stock);
    }


}
