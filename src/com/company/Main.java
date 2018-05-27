package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    try {
      Reading reading = new Reading("students.txt");

      List<Student> students = reading.readStudentFromFile();

      StudentManagement management = new StudentManagement(students);
//      management.render();

      management.sortDescending();
      management.render();

      Writing writing = new Writing("output.txt");
      writing.writeToFile(management.getStudents());
      writing.writeToFile(new Student(11, "Phat", 22, "male"));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
