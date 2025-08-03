package dsa.multiThrread;

import dsa.Sorting;

public class Multithread implements Runnable {
    @Override
    public void run() {
        Sorting sorting = new Sorting();
        System.out.println(sorting);
    }

    public static void main(String[] args) {
        Multithread multithread = new Multithread();
        multithread.run();

        Thread t = new Thread(multithread);
        t.start();
    }
}
