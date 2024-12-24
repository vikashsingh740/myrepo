package org.example.design.designpatterns.creational.prototype;

public class ProtoTypeMain {
    public static void main(String[] args) {
        Student student = new Student(1,"vikash",1);
        Student student1 = (Student) student.clone();
        System.out.println(student1);
    }
}
