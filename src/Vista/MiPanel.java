package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {
    Image imagen;

   public static JLabel carro1,carro2,carro1D,carro2D,carro1A,carro2A,carro1I,carro2I;
    public  static JButton boton1;

    public MiPanel(){
        imagen = new ImageIcon(getClass().getResource("Imagenes/pista.jpg")).getImage();
        this.setLayout(null);

        creaEtiquetas();
        crearBoton();

        AccionBoton instancia = new AccionBoton();
    }


    public void paint (Graphics g){
        g.drawImage(imagen,0,0,getWidth(),getHeight(),null);
        setOpaque(false);
        super.paint(g);
    }
    private void crearBoton() {
        boton1 = new JButton("!Go");
        boton1.setBounds(300,250,100,30);
        add(boton1);
    }

    private void creaEtiquetas() {
        carro1 = new JLabel();
        carro2 = new JLabel();

        //Carro derecha
        carro1D = new JLabel();
        carro2D = new JLabel();

        //Carro abajo
        carro1A = new JLabel();
        carro2A = new JLabel();

        //Carro a la Izquierda
        carro1I = new JLabel();
        carro2I = new JLabel();

        carro1.setBounds(100,5,50,70);
        ImageIcon img1 = new ImageIcon(getClass().getResource("Imagenes/P1_1.png"));
        ImageIcon icon2 = new ImageIcon(img1.getImage().getScaledInstance(carro1.getWidth(),carro1.getHeight(), Image.SCALE_DEFAULT));
        carro1.setIcon(icon2);

        carro2.setBounds(100,40,50,70);
        ImageIcon img2 = new ImageIcon(getClass().getResource("Imagenes/P2_1.png"));
        ImageIcon icon3 = new ImageIcon(img2.getImage().getScaledInstance(carro2.getWidth(),carro2.getHeight(), Image.SCALE_DEFAULT));
        carro2.setIcon(icon3);

        //Carrito hacia abajo derecha
        carro1D.setBounds(605,100,50,70);
        ImageIcon img3 = new ImageIcon(getClass().getResource("Imagenes/P1_2.png"));
        ImageIcon icon4 = new ImageIcon(img3.getImage().getScaledInstance(carro1D.getWidth(),carro1D.getHeight(), Image.SCALE_DEFAULT));
        carro1D.setIcon(icon4);
        carro1D.setVisible(false);

        carro2D.setBounds(550,100,50,70);
        ImageIcon img4 = new ImageIcon(getClass().getResource("Imagenes/P2_2.png"));
        ImageIcon icon5 = new ImageIcon(img4.getImage().getScaledInstance(carro2D.getWidth(),carro2D.getHeight(), Image.SCALE_DEFAULT));
        carro2D.setIcon(icon5);
        carro2D.setVisible(false);

        //carro hacia abajo
        carro1A.setBounds(500,350,50,70);
        ImageIcon img5 = new ImageIcon(getClass().getResource("Imagenes/P2_3.png"));
        ImageIcon icon6 = new ImageIcon(img5.getImage().getScaledInstance(carro1A.getWidth(),carro1A.getHeight(), Image.SCALE_DEFAULT));
        carro1A.setIcon(icon6);
       carro1A.setVisible(false);

        carro2A.setBounds(500,390,50,70);
        ImageIcon img6 = new ImageIcon(getClass().getResource("Imagenes/P1_3.png"));
        ImageIcon icon7 = new ImageIcon(img6.getImage().getScaledInstance(carro2A.getWidth(),carro2A.getHeight(), Image.SCALE_DEFAULT));
        carro2A.setIcon(icon7);
        carro2A.setVisible(false);

        //carro a la Izquierda
        carro1I.setBounds(30,330,50,70);
        ImageIcon img8 = new ImageIcon(getClass().getResource("Imagenes/P1_4.png"));
        ImageIcon icon9 = new ImageIcon(img8.getImage().getScaledInstance(carro1I.getWidth(),carro1I.getHeight(), Image.SCALE_DEFAULT));
        carro1I.setIcon(icon9);
        carro1I.setVisible(false);

        carro2I.setBounds(90,330,50,70);
        ImageIcon img9 = new ImageIcon(getClass().getResource("Imagenes/P2_4.png"));
        ImageIcon icon10 = new ImageIcon(img9.getImage().getScaledInstance(carro2I.getWidth(),carro2I.getHeight(), Image.SCALE_DEFAULT));
        carro2I.setIcon(icon10);
        carro2I.setVisible(false);


        add(carro1);
        add(carro2);
        add(carro1D);
        add(carro2D);
        add(carro1A);
        add(carro2A);
        add(carro1I);
        add(carro2I);
    }

}
