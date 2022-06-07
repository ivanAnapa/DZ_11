package ru.netology.manager;

public class FilmItem {
    private int id;
    private String name;
    private String genre;
    private String posterURL;

    public FilmItem() {
    }

    public FilmItem(int id, String name, String genre, String posterURL) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.posterURL = posterURL;
    }

}
