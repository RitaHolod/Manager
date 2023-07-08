package film.manager;

import film.item.FilmItem;
import film.repo.FilmRepository;

public class FilmManager {
    private FilmRepository repo;
    private int quantityLimit;

    public FilmManager(FilmRepository repo) {

        this.repo = repo;
    }


    public FilmManager(int quantityLimit, FilmRepository repo) {

        this.quantityLimit = quantityLimit;
        this.repo = repo;
    }

    public FilmManager() {

        quantityLimit = 10;
    }


    public FilmItem[] showAddedFilms() {
        FilmItem[] films = repo.findAll();
        int result;
//        int quantityLimit = 10;
        if (films.length < quantityLimit) {
            result = films.length;
        } else {
            result = quantityLimit;
        }

        FilmItem[] tmp = new FilmItem[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }

        return tmp;
    }
}
