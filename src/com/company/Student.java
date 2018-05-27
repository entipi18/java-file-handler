package com.company;

import java.util.List;

public class Student {
  private int id;
  private String name;
  private int age;
  private String gender;

  public Student(int id, String name, int age, String gender) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public static Student from(List<String> chunk) {
    int validChunkSize = 4;

    if (chunk.size() != validChunkSize)
      return null;

    int id = Integer.parseInt(chunk.get(0).split(":")[1].trim());
    String name = chunk.get(1).split(":")[1].trim();
    int age = Integer.parseInt(chunk.get(2).split(":")[1].trim());
    String gender = chunk.get(3).split(":")[1].trim();

    return new Student(id, name, age, gender);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String toString() {
    return "id : " + id + "\n" + "name: " + name + "\n" + "age: " + age + "\n" + "gender: " + gender + "\n\n";
  }
}
