package ru.gb.task1;

import ru.gb.task1.domains.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(470001, "Достоевский Ф.М.", "Преступление и наказание", 1866);
        Book book1 = new Book(470002, "Орвелл Д.", "1984", 1949);
        Book book2 = new Book(470003, "Харпер Ли", "Убить пересмешника", 1960);
        book.setReading(true);
        book.findLocation();

        Magazine magazine = new Magazine(580001, "Джон Д. Рокфеллер", "Forbes", 2023);
        Magazine magazine1 = new Magazine(580002, "Анна В.", "Космополитен", 2022);
        Magazine magazine2 = new Magazine(580003, "Иванов А.А.", "Знание — сила", 2018);
        magazine.findLocation();

        Letter letter = new Letter(360001, "Толстой Л.Н.", "Толстой — Страхову Н.Н.", 1876);
        letter.setReading(true);
        letter.findLocation();

        Microfilm microfiche = new Microfilm(260001, "Циолковский К.Э.", "Исследование мирового пространства реактивными приборами", 1911);
        microfiche.findLocation();

        List<FondObject> fondObjectList = List.of(
                book, book1, book2, magazine, magazine1, magazine2, letter, microfiche
        );

        LibraryServise libraryServise = new LibraryServise(fondObjectList);

        libraryServise.findFondObjectByAuthor("Толстой Л.Н.");
        libraryServise.findFondObjectByYear(1960);
        libraryServise.findFondObjectByInventoryNumber(260001);
    }

}