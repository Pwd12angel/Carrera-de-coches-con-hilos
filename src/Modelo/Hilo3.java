package Modelo;

import Vista.MiPanel;

public class Hilo3 extends Thread {
    velocidad v1 = new velocidad();
    Hilo5 hilo5 = new Hilo5();
    public void run(){
        MiPanel.carro1D.setVisible(true);
        for (int i = 100; i < 320; i++) {

            try {
                sleep(v1.vel());

                MiPanel.carro1D.setBounds(605,i,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro1D.setVisible(false);
        hilo5.start();
    }
}
