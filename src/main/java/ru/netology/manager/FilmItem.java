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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }
}
