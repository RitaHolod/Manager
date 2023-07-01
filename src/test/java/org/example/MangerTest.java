package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MangerTest {

    FilmManager manager = new FilmManager();

    Film film1 = new Film(1, "Бладшот", "боевик");
    Film film2 = new Film(2, "Вперед", "мультфильм");
    Film film3 = new Film(3, "Белград", "комедия");
    Film film4 = new Film(4, "Джентельмены", "боевик");
    Film film5 = new Film(5, "Человек-неведимка", "ужасы");
    Film film6 = new Film(6, "Тролли. Мировой тур", "мультфильм");
    Film film7 = new Film(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

    }

    @Test

    public void testFindAll() {

        Film[] expected = {film1, film2, film3, film4,film5,film6,film7};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addTesting(){
        Film film8 = new Film(8,"Буба","мультфильм");

        manager.add(film8);
        Film[] expected = {film1, film2, film3, film4,film5,film6,film7,film8};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test

    public void testQuantityLimitMax(){

        Film film8 = new Film(8,"Буба","мультфильм");
        Film film9 = new Film(9,"XXX","боевик");
        Film film10 = new Film(10,"2+2","комедия");

        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        Film[] expected = { film10, film9, film8,film7, film6, film5, film4, film3, film2,film1 };
        Film[] actual = manager.showAddedFilms();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test

    public void testQuantityLimitOtherValue(){
        FilmManager manager = new FilmManager(5);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = manager.showAddedFilms();

        Assertions.assertArrayEquals(expected, actual);
    }




}
