package com.company;

import java.security.NoSuchAlgorithmException;

public class Main {

    static class Thread_2 extends Thread
    {
        @Override
        public void run()
        {
            BrutForce brut_2=new BrutForce(2);
            try {
                brut_2.brutforce();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread_3 extends Thread
    {
        @Override
        public void run()
        {
            BrutForce brut_3=new BrutForce(3);
            try {
                brut_3.brutforce();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        BrutForce brut=new BrutForce(1);
        brut.brutforce();
        Thread_2 th_2=new Thread_2();
        th_2.start();
        Thread_3 th_3=new Thread_3();
        th_3.start();
    }
}
