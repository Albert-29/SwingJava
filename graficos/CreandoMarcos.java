import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        //Metodo para hacer visible la ventana
        marco1.setVisible(true);
        //Metodo que define el comportamiento al cerrar la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //marco1.setBounds(500,500,200,300);
    }
}

class MiMarco extends JFrame {
    public MiMarco (){
        //Establecer el tamaño de la ventana
        //setSize(500,300);

        //setLocation(500,300); Metodo que establece el lugar donde aparecera el frame
        setBounds(600,300,550,250); //Este metodo nos permite establecer el lugar y el tamaño del frame
        //setResizable(false); //Metodo que no permite la modificacion de tamaño del frame
        //setExtendedState(Frame.MAXIMIZED_BOTH); metodo estatico que Maximiza el frame

        setTitle("Mi nuevo Frame");//Este metodo nos permite poner un titulo en la ventana
    }
}