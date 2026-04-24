package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class principal extends JFrame {

    private JPanel panelMain;
    private JPanel tablero;
    private JPanel[][] cuadros;

    private JPanel bordeNorte;
    private JPanel bordeSur;
    private JPanel bordeEste;
    private JPanel bordeOeste;


    public principal() {


        panelMain.setPreferredSize(new Dimension(1100, 700));
        panelMain.setBackground(new Color(98, 131, 149));

        tablero.setPreferredSize(new Dimension(500, 300));
        tablero.setLocation(20,40);
        tablero.setBackground(new Color(139, 188, 156));

        tablero = new JPanel();
        tablero.setLayout(new GridLayout(4,4));



    }

    private void abrirUsuario(ActionEvent e){
        usuario ventanaUsuario = new usuario(this);
        ventanaUsuario.setVisible(true);
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("principal");
        frame.setContentPane(new principal().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(500,100);
        frame.setMinimumSize(new Dimension(300,250));
    }



}


