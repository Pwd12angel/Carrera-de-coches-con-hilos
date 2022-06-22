package Modelo;

import Vista.MiPanel;

public class Hilo7 extends Thread{
    velocidad v1 = new velocidad();

    boolean activo = false;
    public void run(){
        MiPanel.carro1I.setVisible(true);
        for (int i = 330; i > 100; i--) {

            try {
                sleep(v1.vel());

                MiPanel.carro1I.setBounds(30,i,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        activo = true;
        gano();
    }

    public void gano(){
        if (activo){
            System.out.println("Llego el carro rojo");
        }
    }
}
