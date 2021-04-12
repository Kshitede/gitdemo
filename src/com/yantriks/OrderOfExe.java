package com.yantriks;

import java.util.ArrayList;
import java.util.List;

public class OrderOfExe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<7;i++)
        list.add(i);
        list.stream().forEach(System.out::println);
        list.stream().forEach(x->System.out.println(Thread.currentThread().getName() + " " + x));
        System.out.println("parallel");
        list.stream().parallel().forEach(System.out::println);
        list.stream().parallel().forEach(x->System.out.println(Thread.currentThread().getName() + " " + x));
    }
}
