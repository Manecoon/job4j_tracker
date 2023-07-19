package ru.job4j.job4j;

import ru.job4j.tracker.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUi {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Текущие дата и время после форматирования: "
                + item.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
    }
}