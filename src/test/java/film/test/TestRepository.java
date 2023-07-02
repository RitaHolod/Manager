package film.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import film.item.FilmItem;
import film.repo.FilmRepository;


public class TestRepository {
    FilmRepository repo = new FilmRepository();

    FilmItem film1 = new FilmItem(1,"Бладшот", "боевик");
    FilmItem film2 = new FilmItem(2, "Вперед", "мультфильм");
    FilmItem film3 = new FilmItem(3, "Белград", "комедия");
    FilmItem film4 = new FilmItem(4, "Джентельмены", "боевик");
    FilmItem film5 = new FilmItem(5, "Человек-неведимка", "ужасы");
    FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem film7 = new FilmItem(7, "Номер один", "комедия");

    @BeforeEach

    public void setup() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);

    }
    @Test

    public void testFindAll(){
        FilmItem[] expected = {film1, film2, film3, film4,film5,film6,film7};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSave(){
        FilmItem film8 = new FilmItem(8,"Буба","мультфильм");

        repo.save(film8);
        FilmItem[] expected = {film1, film2, film3, film4,film5,film6,film7,film8};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testRemoveById(){
        repo.removeById(7);

        FilmItem[] expected = {film1, film2, film3, film4,film5,film6};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        repo.findById(3);

        FilmItem[] expected = {film3};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAll(){
        repo.removeAll();

        FilmItem[] expected = {};
        FilmItem[] actual = repo.findAll();
    }
}
