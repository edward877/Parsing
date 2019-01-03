package Enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Category{

    MOVIE("кино", Arrays.asList("фильм")),
    BROCHURE("брошюра", Arrays.asList("брошюр")),
    ARTICLE("статья", Arrays.asList("статьи", "тексты статей")),
    BOOK("книга", Arrays.asList("книг")),
    POEMS("стихи", Arrays.asList("стих", "стихотворение")),
    NEWSPAPER("газета", Arrays.asList("газет")),
    MAGAZINE("журнал"),
    MUSIC("музыка", Arrays.asList("музык", "текст песн", "песни")),
    OTHER("другое", Arrays.asList("")); //2835 к другому

    private final String name;

    private final List<String> wordsCategory;

    Category(String name, List<String> wordsCategory) {
        this.name = name;
        this.wordsCategory = new ArrayList<>(wordsCategory);
        this.wordsCategory.add(name);
    }

    Category(String name) {
        this.name = name;
        this.wordsCategory = Arrays.asList(name);
    }

    public static Category getCategoryByText(String text) {

        for (Category category : values()) {
            for (String wordCategory : category.wordsCategory) {
                if (text.toLowerCase().contains(wordCategory)) {
                    return category;
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
