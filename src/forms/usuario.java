package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class usuario extends JFrame {

    public JPanel fondoUsuario;
    private JPanel menu;
    private JButton iniciarSession;

    public principal ventanaPrincipal;
    


    public usuario(principal VP) {

        iniciarSession.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.setVisible(true);

                // 2. Close this current window (usuario)
                dispose();
            }
        });
        
        this.ventanaPrincipal = VP;



        fondoUsuario.setBackground(new Color(139, 188, 156));
        iniciarSession.setBackground(new Color(219, 173, 106));
    /*    iniciarSession(new Color(88,12,31));
*/


    }



    }






