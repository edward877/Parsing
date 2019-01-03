package Enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum OtherCategory {
    VIDEO("видео"),
    AUDIO("аудио"),
//    FILE("файл"),
    PRINT_MAT("печатный материал", Arrays.asList("печатн")),
    LEAFLET("листовка", Arrays.asList("листовк")),
    BOOKLET("буклет"),
    IMAGE("изображение", Arrays.asList("изображен", "фото")),
    BULLETIN("бюллетень"),
    TEXT("текстовый документ", Arrays.asList("текстовые документы", "текстовой материал",
            "текстовый материал", "текстовые материалы", "текст информационного материала")),
    BOOK("книга", Arrays.asList("книг")),
    INF_MAT("информационные материалы", Arrays.asList("размещенные на сайт", "информационный материал",
            "информационный ресурс")),
    SITE("сайт", Arrays.asList("интернет-ресурс", "интернет-сайт", "интернет ресурс", "интернет - ресурс")), // ,
    PUBLICATION("публикация"),
    DONT_KNOW("неизвестно", Arrays.asList(""));

    private final String name;

    private final List<String> wordsCategory;

    OtherCategory(String name, List<String> wordsCategory) {
        this.name = name;
        this.wordsCategory = new ArrayList<>(wordsCategory);
        this.wordsCategory.add(name);
    }
    OtherCategory(String name) {
        this.name = name;
        this.wordsCategory = Arrays.asList(name);
    }

    public static OtherCategory getOtherCategoryByText(String text) {

        for (OtherCategory otherCategory : values()) {
            for (String wordCategory : otherCategory.wordsCategory) {
                if (text.toLowerCase().contains(wordCategory)) {
                    return otherCategory;
                }
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        return name;
    }
}
