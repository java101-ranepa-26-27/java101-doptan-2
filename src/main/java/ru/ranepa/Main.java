package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>();
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите оценки:");
        int mark = -1;
        while (true) {
            mark = scanner.nextInt();
            if (mark == 0) {
                break;
            }
            marks.add(mark);
        }
        Student student = new Student(name, marks);
        System.out.println("Отчёт");
        System.out.println(student.getStatus());
    }
}
