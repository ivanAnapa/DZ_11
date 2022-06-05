package ru.netology.repo;

import ru.netology.manager.FilmItem;

public class FilmRepo {
    private FilmItem[] items = new FilmItem[0];

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }
}
