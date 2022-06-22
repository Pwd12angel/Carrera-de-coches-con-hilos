package Modelo;

import Vista.MiPanel;

public class Hilo8 extends Thread{
    velocidad v1 = new velocidad();

    boolean activo = false;
    public void run(){
        MiPanel.carro2I.setVisible(true);

        for (int i = 330; i > 100; i--) {

            try {
                sleep(v1.vel());

                MiPanel.carro2I.setBounds(90,i,50,70);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        activo = true;
        gano();

    }
    public boolean gano(){
        if (activo){
            System.out.println("Llego el carro amarillo");
        }
        return true;
    }
}
