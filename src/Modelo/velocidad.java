package Modelo;

import java.util.Random;

public class velocidad {
    Random random = new Random();

    public int vel(){
        int min = 5;
        int max = 15;



        int value = random.nextInt(max + min) + min;

        return value;
    }
}
