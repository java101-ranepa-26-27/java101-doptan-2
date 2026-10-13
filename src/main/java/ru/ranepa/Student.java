package ru.ranepa;

import java.util.List;

public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public double averageMarks() {
        int sum = 0;
        for (Integer mark : marks) {
            sum+=mark;
        }
        return (double) sum / marks.size();
    }
    public String getStatus() {
        double avg = averageMarks();
        if (avg >= 4.5) return "отличник";
        if (avg >= 3.5) return "хорошист";
        if (avg >= 2.5) return "троечник";
        return "двоечник";
    }
}

