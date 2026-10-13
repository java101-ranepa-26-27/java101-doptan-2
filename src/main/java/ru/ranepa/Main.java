package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>();
        System.out.println("Name:");
        String name = scanner.next();
        System.out.println("Marks:");
        int mark = -1;
        while (true) {
            mark = scanner.nextInt();
            if (mark == 0) {
                break;
            }
            marks.add(mark);
        }

        Student student = new Student(name, marks);
        double avg = student.averageMarks();
        System.out.println("Name: " + name);
        System.out.println("Marks:" + marks);
        System.out.println("Average:" + avg);
        System.out.println("Status:" + student.getStatus());
    }
}
