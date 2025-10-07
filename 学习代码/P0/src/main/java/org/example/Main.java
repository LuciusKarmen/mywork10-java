package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        new Thread(ticket,"线程一：").start();
        new Thread(ticket,"线程二：").start();
        new Thread(ticket,"线程三：").start();
        new Thread(ticket,"线程四：").start();
    }
}
class Ticket implements Runnable{
    private int tickets=100;

    Object lock= new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"-----卖出的票"+tickets--);
                }else{
                    break;
                }
            }
        }
    }
}
