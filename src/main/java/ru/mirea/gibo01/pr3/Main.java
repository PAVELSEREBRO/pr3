package ru.mirea.gibo01.pr3;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Circle[] arr = new Circle[3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length;i++) {
        int xx,yy,rr;
        xx = sc.nextInt();
        yy = sc.nextInt();
        rr = sc.nextInt();
        arr[i] = new Circle(xx,yy,rr);
    }
    for (int i = 0; i < arr.length;i++) {
        System.out.println(arr[i].toString());
        System.out.println("Длина круга = " + arr[i].getLength());
        System.out.println("Площадь круга = " + arr[i].getS());
    }
    int min = arr[0].getR();
    for(int i = 1;i < arr.length;i++) {
        if (min > arr[i].getR()) {
            min = arr[i].getR();
        }
    }
    int max = arr[0].getR();
    for(int i = 1;i < arr.length;i++) {
        if (max < arr[i].getR()) {
            max = arr[i].getR();
        }
    }
    System.out.println("Минимальный радиус = " + min);
    System.out.println("Максимальный радиус = " + max);
    int[] mass;
    mass = new int[10];
    System.out.println("Случайный массив - ");
    for (int i = 0; i < mass.length;i++) {
        mass[i] = ((int)(Math.random() * 12 ));
        System.out.print(mass[i]);
    }
    int count;
    do {
        count = 0;
        for (int i = 0; i < mass.length - 1;i++) {
            if (mass[i] > mass[i+1]) {
                int temp = mass[i];
                mass[i] = mass[i+1];
                mass[i+1] = temp;
                count++;
            }
        }
    }
    while (count > 0);
    System.out.println();
    for(int num : mass) {
        System.out.println(num);
    }
}
}

