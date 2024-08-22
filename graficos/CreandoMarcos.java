import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        //Metodo para hacer visible la ventana
        marco1.setVisible(true);
        //Metodo que define el comportamiento al cerrar la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MiMarco extends JFrame {
    public MiMarco (){
        //Establecer el tamaño de la ventana
        setSize(500,300);
    }
}