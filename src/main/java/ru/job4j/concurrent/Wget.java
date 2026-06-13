package ru.job4j.concurrent;

public class Wget {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    System.out.println("Start loading ... ");
                    for (int index = 0; index <= 100; index++) {
                        try {
                            Thread.sleep(1000);
                            System.out.print("\rLoading : " + index + "%");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("\nLoaded.");
                }
        );
        thread.start();
    }
}
