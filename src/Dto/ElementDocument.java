package Dto;

import Enums.Category;
import Enums.OtherCategory;

public class ElementDocument {

    int id;

    String name;

    Category category;

    OtherCategory otherCategory;

    String author;

    String publishingPlace;

    String otherInformation;

    String text;

    public  ElementDocument(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder textOut = new StringBuilder(id + "   \t| " + name + "\t| " + category + " \t| ");
       // if (otherCategory != null) {
            textOut.append(otherCategory + "\t| " + "\n");
        //}
        if (author != null) {
            textOut.append(author + "\t| ");
        }
//        if (publishingPlace != null) {
//            textOut.append(publishingPlace + "\t| ");
//        }
//        if (otherInformation != null) {
//            textOut.append(otherInformation + "\t| ");
//        }
//        textOut.append(" .... " + text + "\n");
        return textOut.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public OtherCategory getOtherCategory() {
        return otherCategory;
    }

    public void setOtherCategory(OtherCategory otherCategory) {
        this.otherCategory = otherCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingPlace() {
        return publishingPlace;
    }

    public void setPublishingPlace(String publishingPlace) {
        this.publishingPlace = publishingPlace;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
