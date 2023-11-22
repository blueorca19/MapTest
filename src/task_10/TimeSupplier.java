package task_10;

import jdk.jshell.execution.LocalExecutionControl;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class TimeSupplier {
    public static void main(String[] args) {
        //анонимный класс
        Supplier<LocalDateTime> currentTime = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };
        System.out.println("\r" + currentTime.get());

        Supplier<LocalDateTime> currentTime2 = () -> LocalDateTime.now(); //лямда выражение
        while (true) {
            System.out.print("\r" + currentTime2.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
/*
        Supplier<LocalDateTime> currentTime3 = LocalDateTime::now; //reference

        while (true) {
            System.out.print("\r" + currentTime3.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
}
