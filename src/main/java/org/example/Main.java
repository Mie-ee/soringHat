package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(new Student("Deaco Lucius Malfoy", "Slytherin", "Pure"),
                new Student("Hannah Abbott", "Hufflepuff", "Half"),
                new Student("Terry Boot", "Ravenclaw", "Pure"),
                new Student("Harry James Potter", "Gryffindor", "Half"),
                new Student("Hermione Jean Granger", "Gryffindor", "Muggle"));
        for (Student student : studentList) {
            student.sortingHat();
            if (student.getName().contains("Harry")) {
                System.out.println(Color.purple + " ⚡⚡ This boy will be famous.⚡⚡ " + Color.end);
            }
        }
        System.out.println();
        System.out.println(Color.pink + "Thanks for watching " + Color.end);
        System.out.println(Color.pink + "THE END" + Color.end);
    }
}