package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.FilmItem;
import ru.netology.manager.FilmManager;

public class AfishaTest {

    FilmItem first = new FilmItem(1, "Film_1", "Genre_1", "URL_1");
    FilmItem second = new FilmItem(2, "Film_2", "Genre_2", "URL_2");
    FilmItem third = new FilmItem(3, "Film_3", "Genre_3", "URL_3");
    FilmItem fourth = new FilmItem(4, "Film_4", "Genre_4", "URL_4");
    FilmItem fifth = new FilmItem(5, "Film_5", "Genre_5", "URL_5");
    FilmItem sixth = new FilmItem(6, "Film_6", "Genre_6", "URL_6");
    FilmItem seventh = new FilmItem(7, "Film_7", "Genre_7", "URL_7");
    FilmItem eighth = new FilmItem(8, "Film_8", "Genre_8", "URL_8");
    FilmItem ninth = new FilmItem(9, "Film_9", "Genre_9", "URL_9");
    FilmItem tenth = new FilmItem(10, "Film_10", "Genre_10", "URL_10");
    FilmItem eleventh = new FilmItem(11, "Film_11", "Genre_11", "URL_11");

    @Test
    public void afishaWithoutFilmsShouldBeUnfilled() {

        // No films
        FilmItem filmItem = new FilmItem();
        FilmManager repoWithoutFilms = new FilmManager();

        FilmItem[] expected = new FilmItem[0];
        FilmItem[] actual = repoWithoutFilms.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allAddedFilmsShouldBeSaved() {

        // Num of films = 11
        FilmManager repo = new FilmManager();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);
        repo.save(seventh);
        repo.save(eighth);
        repo.save(ninth);
        repo.save(tenth);
        repo.save(eleventh);

        FilmItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void defaultLastAdded() {

        // Default limit = 10
        FilmManager repo = new FilmManager();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);
        repo.save(seventh);
        repo.save(eighth);
        repo.save(ninth);
        repo.save(tenth);
        repo.save(eleventh);

        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitedLastAdded() {

        // New limit = 5
        FilmManager repo = new FilmManager(5);
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);
        repo.save(seventh);
        repo.save(eighth);
        repo.save(ninth);
        repo.save(tenth);
        repo.save(eleventh);

        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithLargeMaxLimited() {

        // 3 films VS 55 limit
        FilmManager repo = new FilmManager(55);
        repo.save(first);
        repo.save(second);
        repo.save(third);

        FilmItem[] expected = {third, second, first};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
