package org.example;

public class FilmManager {
    private Film[] films = new Film[0];
    private int quantityLimit;

    public FilmManager(int quantityLimit) {
        this.quantityLimit = quantityLimit;
    }

    public FilmManager() {
       this.quantityLimit = 10;
    }

    public void add(Film newFilm) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] showAddedFilms() {
        int result;
        if (films.length < quantityLimit) {
            result = films.length;
        } else {
            result = quantityLimit;
        }

        Film[] tmp = new Film[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }

        return tmp;
    }
}
