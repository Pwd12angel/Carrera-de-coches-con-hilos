package Modelo;

import Vista.MiPanel;

public class Hilo5 extends Thread{
    velocidad v1 = new velocidad();
    Hilo7 hilo7 = new Hilo7();
    public void run(){
        MiPanel.carro1A.setVisible(true);
        for (int i = 500; i > 100; i--) {

            try {
                sleep(v1.vel());

                MiPanel.carro1A.setBounds(i,350,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro1A.setVisible(false);
        hilo7.start();
    }
}
