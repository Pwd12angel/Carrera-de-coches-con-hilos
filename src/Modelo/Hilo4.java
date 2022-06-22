package Modelo;

import Vista.MiPanel;

public class Hilo4 extends Thread {
    velocidad v1 = new velocidad();
    Hilo6 hilo6 = new Hilo6();
    public void run(){
        MiPanel.carro2D.setVisible(true);
        for (int i = 100; i < 320; i++) {

            try {
                sleep(v1.vel());

                MiPanel.carro2D.setBounds(550,i,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro2D.setVisible(false);
        hilo6.start();

    }

}
