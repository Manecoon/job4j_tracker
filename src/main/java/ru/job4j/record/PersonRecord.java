package ru.job4j.record;

public record PersonRecord(String name, int age) {
    public static int maxAge = 100;

    public static int getMaxAge() {
        return maxAge;
    }

    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }
}