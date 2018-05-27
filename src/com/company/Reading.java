package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reading {
  private BufferedReader bufferedReader;
  private List<Student> students;

  public Reading(String fileName) throws FileNotFoundException{
    bufferedReader = new BufferedReader(new FileReader(fileName));
    students = new ArrayList<>();
  }

  public List<Student> readStudentFromFile() throws IOException {
    if (bufferedReader == null)
      return new ArrayList<>();

    return readAndParseStudents();
  }

  private List<Student> readAndParseStudents() throws IOException{
    List<String> chunk = new ArrayList<>();
    String line;

    while ((line = bufferedReader.readLine()) != null) {
      if (!line.trim().equals("")) {
        chunk.add(line);
        continue;
      }

      addStudentToList(chunk);

      chunk.clear();
    }

    addStudentToList(chunk);

    return students;
  }

  private void addStudentToList(List<String> chunk) {
    if (chunk.isEmpty())
      return;

    Student student = Student.from(chunk);
    if (student != null)
      students.add(student);
  }

  public Student searchStudentWith(int id) throws IOException {
    String line;
    List<String> chunk = new ArrayList<>();

    while ((line = bufferedReader.readLine()) != null) {
      if (line.trim().equals(""))
        continue;

      if (line.split(":")[1].trim().equals(id + ""));
    }

    return null;
  }
}
