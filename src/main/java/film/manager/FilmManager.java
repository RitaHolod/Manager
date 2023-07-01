package film.manager;

import film.item.FilmItem;
import film.repo.FilmRepository;

public class FilmManager {
    private FilmRepository repo;

    public FilmManager(FilmRepository repo){
        this.repo = repo;
    }
    private int quantityLimit;

    public FilmManager(int quantityLimit) {
        this.quantityLimit = quantityLimit;
    }

    public FilmManager() {
       this.quantityLimit = 10;
    }


    public FilmItem[] showAddedFilms() {
        FilmItem[] films = repo.findAll();
        int result;
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
