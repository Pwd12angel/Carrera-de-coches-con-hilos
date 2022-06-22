package Modelo;

import Vista.MiPanel;

public class Hilo6 extends Thread{
    velocidad v1 = new velocidad();
    Hilo8 hilo8 = new Hilo8();
    public void run(){
        MiPanel.carro2A.setVisible(true);
        for (int i = 500; i > 100; i--) {

            try {
                sleep(v1.vel());

                MiPanel.carro2A.setBounds(i,390,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro2A.setVisible(false);
        hilo8.start();
    }
}
