package com.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        LightTrial lt1 = new LightTrial("lt1", r.nextInt(100), r.nextInt(100));
        LightTrial lt2 = new LightTrial("lt2", r.nextInt(100), r.nextInt(100));
        Trial tr1 = new Trial("tr1", r.nextInt(100), r.nextInt(100) );
        Trial tr2 = new Trial("tr2", r.nextInt(100), r.nextInt(100) );
        Trial tr3 = new Trial("tr3", r.nextInt(100), r.nextInt(100) );

        StrongTrial st1 = new StrongTrial("st1", r.nextInt(100), r.nextInt(100));
        StrongTrial st2 = new StrongTrial("st2", r.nextInt(100), r.nextInt(100));

        ExtraTrial et1 = new ExtraTrial("ET1", r.nextInt(100), r.nextInt(100), r.nextInt(100));
        ExtraTrial et2 = new ExtraTrial("ET2", r.nextInt(100), r.nextInt(100), r.nextInt(100));

        ArrayList<Trial> trials = new ArrayList<>(Arrays.asList(lt1, lt2, tr1, tr2, tr3, st1, st2, et1, et2));





    }



}
