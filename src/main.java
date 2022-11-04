
import javax.swing.JButton;
import javax.swing.JFrame;




public class main {
    public static void main(String[] args) {

        JFrame pantalla_principal = new JFrame("Numeral Kart");
        pantalla_principal.setSize(1000,800);
        pantalla_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla_principal.setTitle("Test Frame");
        pantalla_principal.setVisible(true);
        pantalla_principal.setLocationRelativeTo (null);

        JButton boton_dificultadfacil =new JButton("Fácil");
        boton_dificultadfacil.setBounds(50,100,95,30);
        pantalla_principal.add(boton_dificultadfacil);

        JButton boton_dificultadintermedia =new JButton("Intermedia");
        boton_dificultadintermedia.setBounds(50,200,95,30);
        pantalla_principal.add(boton_dificultadintermedia);

        JButton boton_dificultaddificil =new JButton("Difícil");
        boton_dificultaddificil.setBounds(50,300,95,30);
        pantalla_principal.add(boton_dificultaddificil);

        JButton boton_cerrarjuego =new JButton("Salir");
        boton_cerrarjuego.setBounds(50,400,95,30);
        pantalla_principal.add(boton_cerrarjuego);

    }
}
