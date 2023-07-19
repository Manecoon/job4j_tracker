package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov Ivan Igorevich");
        student.setGroup(123);
        student.setReceiptDate(new Date());

        System.out.println("Student: " + student.getFullName() + ", group: "
                + student.getGroup() + ", receipt date: " + student.getReceiptDate());
    }
}