package org.example;



public class Thread1 extends Thread {
    public void run(){
        while(true){
            try {
                Thread.sleep(200); //Delaying
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");


        }
    }
}
