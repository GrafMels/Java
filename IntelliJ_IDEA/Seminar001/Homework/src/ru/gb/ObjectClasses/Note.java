package ru.gb.ObjectClasses;

/**
 * Object Class Note
 * Have 2 field String title and text
 */
public class Note {
    String title;
    String text;

    /**
     * Constructor method
     * @param title - note title
     * @param text - note filling
     */
    public Note(String title, String text){
        this.title = title;
        this.text = text;
    }

    /**
     * Override toString method
     * @return Formatting String for print Note
     */
    @Override
    public String toString() {
        return String.format("%s\n%s", title, text);
    }

    /**
     * Method for print Note's title
     * @return Formatting String for print title Note
     */
    public String printToList() {
        return String.format("%s", title);
    }
}
