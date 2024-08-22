import javax.swing.*;
import java.awt.*;

public class VentanaCentro {
    public static void main(String[] args) {
        VentanaCentrada ventana = new VentanaCentrada();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

class VentanaCentrada extends JFrame {
    public VentanaCentrada() {
        Toolkit resolucion = Toolkit.getDefaultToolkit();
        Dimension pantalla = resolucion.getScreenSize();
        int alto = pantalla.height;
        int ancho = pantalla.width;
        setSize(ancho/2, alto/2);
        setLocation(ancho/4, alto/4);
        setTitle("Ventana Centrada");
        Image miIcono = resolucion.getImage("C:/Users/Alberto/Pictures/computadora.png");
        setIconImage(miIcono);
                
    }
}
