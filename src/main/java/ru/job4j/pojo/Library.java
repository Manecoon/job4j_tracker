package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book alhimik = new Book("Alhimik", 224);
        Book zolushka = new Book("Zolushka", 22);
        Book siyanie = new Book("Siyanie", 541);
        Book cleanCode = new Book("Clean code", 1);
        Book[] polka = new Book[4];
        Book[] zamena = new Book[1];
        polka[0] = alhimik;
        polka[1] = zolushka;
        polka[2] = siyanie;
        polka[3] = cleanCode;
        for (int i = 0; i < polka.length; i++) {
            Book book = polka[i];
            System.out.println("Name: " + book.getName() + ", pages: " + book.getNumberOfPages());
        }
        System.out.println();
        zamena[0] = polka[0];
        polka[0] = polka[3];
        polka[3] = zamena[0];
        for (int i = 0; i < polka.length; i++) {
            Book book = polka[i];
            System.out.println("Name: " + book.getName() + ", pages: " + book.getNumberOfPages());
        }
        for (int i = 0; i < polka.length; i++) {
            Book books = polka[i];
            if (books.getName().equals("Clean code")) {
                System.out.println(books.getName());
            }
        }
    }
}

