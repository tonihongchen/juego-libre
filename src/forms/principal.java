package forms;

import javax.swing.*;
import javax.swing.border.Border;
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
    private JButton Login;
    private JLabel Cuadro1;
    private JLabel Cuadro2;
    private JLabel Cuadro3;
    private JLabel Cuadro4;
    private JLabel Cuadro5;
    private JLabel Cuadro6;
    private JLabel Cuadro7;
    private JLabel Cuadro8;
    private JLabel Cuadro9;
    private JLabel Cuadro10;
    private JLabel Cuadro11;
    private JLabel Cuadro12;
    private JLabel Cuadro13;
    private JLabel Cuadro14;
    private JLabel Cuadro15;
    private JLabel Cuadro16;

    private int [][] matrizLogica = new int [4][4];

    private JLabel[][] etiquetas = new JLabel[4][4];

    public principal() {


        panelMain.setPreferredSize(new Dimension(1100, 700));
        panelMain.setBackground(new Color(98, 131, 149));

        tablero.setPreferredSize(new Dimension(500, 300));
        tablero.setLocation(20,40);
 /*       tablero.setBackground(new Color(139, 188, 156)); */


        etiquetas[0][0] = Cuadro1;  etiquetas[0][1] = Cuadro2;   etiquetas[0][2] = Cuadro3;  etiquetas[0][3] = Cuadro4;
        etiquetas[1][0] = Cuadro5;  etiquetas[1][1] = Cuadro6;   etiquetas[1][2] = Cuadro7;  etiquetas[1][3] = Cuadro8;
        etiquetas[2][0] = Cuadro9;  etiquetas[2][1] = Cuadro10;  etiquetas[2][2] = Cuadro11; etiquetas[2][3] = Cuadro12;
        etiquetas[3][0] = Cuadro13; etiquetas[3][1] = Cuadro14;  etiquetas[3][2] = Cuadro15; etiquetas[3][3] = Cuadro16;


        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matrizLogica[i][j] = 0;
            }
        }

        generarNumero();
        generarNumero();

    }

    private void generarNumero() {
        java.util.Random random = new java.util.Random();
        boolean terminar = false;
        while(!terminar){
            int fila = random.nextInt(4);
            int columna = random.nextInt(4);
            if(matrizLogica[fila][columna] == 0){
                matrizLogica[fila][columna] = (random.nextInt(10) < 9) ? 2 : 4;
                terminar = true;
            }
        }
        actulizacionVisual();
    }

    private void actulizacionVisual() {
        for(int fila=0; fila<4; fila++){
            for(int columna=0; columna<4; columna++){
                int valor = matrizLogica[fila][columna];
                etiquetas[fila][columna].setOpaque(true);

                etiquetas[fila][columna].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


                etiquetas[fila][columna].setHorizontalAlignment(SwingConstants.CENTER);
                etiquetas[fila][columna].setVerticalAlignment(SwingConstants.CENTER);
                etiquetas[fila][columna].setHorizontalTextPosition(SwingConstants.CENTER);
                etiquetas[fila][columna].setFont(new Font("Arial", Font.BOLD, 35));



                if (valor == 0){
                    etiquetas[fila][columna].setText("");
                }else{
                    etiquetas[fila][columna].setText(String.valueOf(valor));

                }

                switch  (valor){
                    case 2: etiquetas[fila][columna].setBackground(new Color(219, 173, 106));
                    break;
                    case 4: etiquetas[fila][columna].setBackground(new Color(98, 131, 149));
                    break;
                    case 8: etiquetas[fila][columna].setBackground(new Color(207, 153, 95));
                    break;
                    case 16: etiquetas[fila][columna].setBackground(new Color(127, 239, 189));
                    break;
                }

            }
        }
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


