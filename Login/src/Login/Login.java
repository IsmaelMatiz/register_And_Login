package Login;

import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame {
        public Login(){
                setSize(380 , 320); // anchor de la vetana
                //setLocation(450 , 200); //posicion inicial de la ventana
                //setBounds(450 , 200 , 400 , 400); //union de setlocation y setsize
                setLocationRelativeTo(null); //colocar la ventana en el centro
                setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre la ejecucion al cerrar la ventana
                setTitle("Login");
                iniciarComponentes();
        }
        private void iniciarComponentes(){
                JPanel panel = new JPanel(); //creacion del panel
                this.getContentPane().add(panel); //añadiendolo a la ventana
                panel.setLayout(null);
                panel.setBackground(Color.GRAY);

                JLabel label = new JLabel("LOGIN ‍👤");
                label.setBounds(170 , 20 , 150 , 30);
                panel.add(label);


                //_________________________________________________

                JLabel labelCorreo = new JLabel("Correo :");
                labelCorreo.setBounds(10 , 70 , 50 , 30);
                panel.add(labelCorreo);

                JTextField txtCorreo =  new JTextField();
                txtCorreo.setBounds(10 ,100 ,100 , 30);
                txtCorreo.setText("correo...");
                panel.add(txtCorreo);


                //_________________________________________________

                JLabel labelContraseña = new JLabel("Contraseña :");
                labelContraseña.setBounds(10 , 140 , 150 , 30);
                panel.add(labelContraseña);

                JTextField txtContraseña =  new JTextField();
                txtContraseña.setBounds(10 ,170 ,100 , 30);
                txtContraseña.setText("contraseña...");
                panel.add(txtContraseña);


                JButton  btn = new JButton();
                btn.setBounds(250 , 220 , 90 , 30);
                btn.setText("Enviar");
                panel.add(btn);

                panel.setVisible(true);
        }



}



