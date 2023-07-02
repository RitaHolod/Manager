package film.repo;

import film.item.FilmItem;

public class FilmRepository {
    private FilmItem[] films = new FilmItem[0];

    public FilmItem[] findAll() {
        return films;

    }

    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public void removeById(int id) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int CopyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getId() != id) {
                tmp[CopyToIndex] = film;
                CopyToIndex++;
            }
        }

        films = tmp;
    }

    public FilmItem[] findById(int id) {
        FilmItem[] tmp = new FilmItem[1];
        for (FilmItem film : films) {
            if (film.getId() == id) {
                tmp[0] = film;
            }
        }
        films = tmp;
        return films;
    }

    public void removeAll() {
        FilmItem[] tmp = new FilmItem[0];
        films = tmp;
    }

}
