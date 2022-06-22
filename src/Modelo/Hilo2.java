package Modelo;

import Vista.MiPanel;

public class Hilo2 extends Thread{
    velocidad v1 = new velocidad();
    Hilo4 hilo4 = new Hilo4();
    public void run(){
        for (int i = 100; i < 550; i++) {

            try {
                sleep(v1.vel());

                MiPanel.carro2.setBounds(i,40,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro2.setVisible(false);
        hilo4.start();
    }
}
