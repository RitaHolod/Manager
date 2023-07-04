package film.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import film.item.FilmItem;
import film.repo.FilmRepository;
import film.manager.FilmManager;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestManager {

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manager = new FilmManager(repo);

    FilmItem film1 = new FilmItem(1, "Бладшот", "боевик");
    FilmItem film2 = new FilmItem(2, "Вперед", "мультфильм");
    FilmItem film3 = new FilmItem(3, "Белград", "комедия");
    FilmItem film4 = new FilmItem(4, "Джентельмены", "боевик");
    FilmItem film5 = new FilmItem(5, "Человек-неведимка", "ужасы");
    FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem film7 = new FilmItem(7, "Номер один", "комедия");


    @Test

    public void testFindAll() {

        FilmItem[] MocRepo = {film1, film2, film3, film4, film5, film6, film7};
        doReturn(MocRepo).when(repo).findAll();

        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testShowAddedFilms() {

        FilmItem[] MocRepo = {film1, film2, film3, film4, film5, film6, film7};
        doReturn(MocRepo).when(repo).findAll();


        FilmItem[] expected = {film7, film6, film5, film4, film3, film2, film1};
        FilmItem[] actual = manager.showAddedFilms();

        Assertions.assertArrayEquals(expected, actual);

    }

}


