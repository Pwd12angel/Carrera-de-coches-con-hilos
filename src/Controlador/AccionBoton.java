package Controlador;

import Modelo.Hilo1;
import Modelo.Hilo2;
import Modelo.Hilo7;
import Modelo.Hilo8;
import Vista.MiPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBoton implements ActionListener {

    public AccionBoton (){
        // MiPanel.boton.addActionListener(this);
        MiPanel.boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == MiPanel.boton1){
            MiPanel.carro1.setBounds(100,5,50,70);
            System.out.println("Boton precionado");
            Hilo1 hilo1 = new Hilo1();
            Hilo2 hilo2 = new Hilo2();

            hilo1.start();
            hilo2.start();

            MiPanel.carro1I.setVisible(false);
            MiPanel.carro2I.setVisible(false);

            MiPanel.carro1.setVisible(true);
            MiPanel.carro2.setVisible(true);
        }
    }
}
