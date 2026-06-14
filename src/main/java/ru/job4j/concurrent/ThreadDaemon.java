package ru.job4j.concurrent;

public class ThreadDaemon {
    public final static int MIN_PRIORITY = 1;
    public final static int NORM_PRIORITY = 5;
    public final static int MAX_PRIORITY = 10;

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.setDaemon(true);
        thread2.setPriority(MIN_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.printf("thread1 нить-демон? %s%nприоритет: %s%n%n", thread1.isDaemon(), thread1.getPriority());
        System.out.printf("thread2 нить-демон? %s%nприоритет: %s%n%n", thread2.isDaemon(), thread2.getPriority());
    }
}
