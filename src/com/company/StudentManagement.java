package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
  private List<Student> students;

  public StudentManagement(List<Student> students) {
    this.students = students;
  }

  public void render() {
    students.forEach(System.out::println);
  }

  public List<Student> sortDescending() {
    students.sort(Comparator.comparingInt(Student::getAge));

    return students;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }
}
