import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Dibujo {
    public static void main(String[] args) {
        VentanaDibujos ventanaDibujos = new VentanaDibujos();
        ventanaDibujos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class VentanaDibujos extends JFrame {
    public VentanaDibujos () {
        setTitle("Prueba de Dibujo");
        setSize(400,400);
        setVisible(true);
        LaminaFiguras miLamina = new LaminaFiguras();
        add(miLamina);
    }
}

class LaminaFiguras extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawRect(50,50,200,200);
        //g.drawLine(50,50,100,300);
        //g.drawArc(100, 150,200,200,30,60);
        //g.draw3DRect(10,100,70,70,true);

        //Utilizando la Biblioteca Java 2D para crear figuras

        //Refundicion o casting
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);

        g2.draw(new Line2D.Double(100,100,300,250));

        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();

        double radio = 125;

        Ellipse2D circulo = new Ellipse2D.Double();

        circulo.setFrameFromCenter(centroX,centroY, centroX+radio, centroY+radio);
        g2.draw(circulo);


    }
}