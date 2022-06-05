package ru.netology.afisha;

import ru.netology.manager.FilmItem;
import ru.netology.repo.FilmRepo;

public class Afisha {
    FilmItem first = new FilmItem(1, "Film_1", "Genre_1", "URL_1");
/*    FilmItem second = new FilmItem(2, "Film_2", "Genre_2", "URL_2");
    FilmItem third = new FilmItem(3, "Film_3", "Genre_3", "URL_3");
    FilmItem fourth = new FilmItem(4, "Film_4", "Genre_4", "URL_4");
    FilmItem fifth = new FilmItem(5, "Film_5", "Genre_5", "URL_5");
    FilmItem sixth = new FilmItem(6, "Film_6", "Genre_6", "URL_6");
    FilmItem seventh = new FilmItem(7, "Film_7", "Genre_7", "URL_7");
    FilmItem eighth = new FilmItem(8, "Film_8", "Genre_8", "URL_8");
    FilmItem ninth = new FilmItem(9, "Film_9", "Genre_9", "URL_9");
    FilmItem tenth = new FilmItem(10, "Film_10", "Genre_10", "URL_10");*/

    FilmRepo repo = new FilmRepo();
    repo.save(first);


}
