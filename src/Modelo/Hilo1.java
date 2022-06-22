package Modelo;

import Vista.MiPanel;


public class Hilo1 extends Thread{
    velocidad v1 = new velocidad();

    Hilo3 hilo3 = new Hilo3();
    public void run(){
        for (int i = 100; i < 550; i++) {

            try {
                sleep(v1.vel());

                MiPanel.carro1.setBounds(i,5,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        MiPanel.carro1.setVisible(false);
        hilo3.start();
    }


}
