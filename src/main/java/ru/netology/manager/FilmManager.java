package ru.netology.manager;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];

    private int maxLimit;

    public FilmManager() {
        maxLimit = 10;
    }

    public FilmManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }


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

    public FilmItem[] findLast() {

        int resultLength;
        if (maxLimit >= items.length) {
            resultLength = items.length;
        } else {
            resultLength = maxLimit;
        }

        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - i - 1];
        }

        items = result;
        return items;
    }
}

