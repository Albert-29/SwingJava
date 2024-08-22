import javax.swing.*;
import java.awt.*;

public class EditandoVentana {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class Ventana extends JFrame{
    public Ventana() {
        setVisible(true);
        setSize(600,450);
        setLocation(400, 200);
        setTitle("Ventana modificada");
        Lamina lamina = new Lamina();
        add(lamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}