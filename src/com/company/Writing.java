package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writing {
  private PrintWriter writer;

  public Writing(String filename) throws IOException {
    writer = new PrintWriter(new FileWriter(filename));
  }

  public void writeToFile(List<Student> students) {

    StringBuffer buffer = new StringBuffer();

    students.forEach(student -> buffer.append(student.toString()));

    writer.write(buffer.toString());
    writer.flush();
  }

  public void writeToFile(Student student) {
    writer.write(student.toString());
    writer.flush();
  }

  public void closeWriter() {
    writer.close();
  }
}
