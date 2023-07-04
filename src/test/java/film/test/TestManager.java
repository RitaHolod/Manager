package film.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import film.item.FilmItem;
import film.repo.FilmRepository;
import film.manager.FilmManager;
import org.mockito.Mockito;

public class TestManager {

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manger = new FilmManager(repo);

    FilmItem film1 = new FilmItem(1,"Бладшот", "боевик");
    FilmItem film2 = new FilmItem(2, "Вперед", "мультфильм");
    FilmItem film3 = new FilmItem(3, "Белград", "комедия");
    FilmItem film4 = new FilmItem(4, "Джентельмены", "боевик");
    FilmItem film5 = new FilmItem(5, "Человек-неведимка", "ужасы");
    FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem film7 = new FilmItem(7, "Номер один", "комедия");

    }


