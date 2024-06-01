package org.example;


public class Main {
    public static void main(String[] args) {
        Thread1 one  = new Thread1();
        Thread2 two = new Thread2();
        /* For Printing Infintely
        one.start();
        two.start();
         */


        /*waiting time of 200ms
        two.start();
        try{
            two.join(200);
        }catch (Exception e){
            System.out.println(e);
        }
        one.start();

         */
        one.setPriority(Thread.MAX_PRIORITY);
        two.setPriority(Thread.MIN_PRIORITY);
        //System.out.println(one.getPriority());
        //System.out.println(two.getPriority());
        one.start();
        two.start();



    }
}