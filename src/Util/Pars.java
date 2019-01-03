package Util;

import java.util.regex.Pattern;

public class Pars {

    String text;

    public Pars(String text) {
        this.text = text;
    }

    // for check trash lines
    static String emptyString = "\\d{1,4}.\\t";
    static String regex = emptyString + "Исключ.н\\t?.*";
    static String regex2 = emptyString + "Материал исключен из списка.\\t?.*";
    static String regex3 = emptyString + "Запись исключена из списка.\\t?.*";

    // for author

    // for name

    // for publishing



    public boolean isTrash() {
        if (text.equals("-") || text.isEmpty()) {
            return true;
        }
        return text.matches(regex) || text.matches(emptyString) || text.matches(regex2) || text.matches(regex3);
    }

    //0
    public String parseId() {
        return text.split(".\\t")[0];
    }

    //1
    public String parseName() {
        Pattern pattern = Pattern.compile("автор - ", Pattern.CASE_INSENSITIVE);
//        if (text.contains("автор - ")) {
//            text.split("автор - ")
//        }
        return null;
    }

    //4
    public String parseAuthor() {
        return null;
    }

    //5
    public String parsePublishingPlace() {
        return null;
    }

    //6
    public String parseOtherInformation() {
        return null;
    }
}
