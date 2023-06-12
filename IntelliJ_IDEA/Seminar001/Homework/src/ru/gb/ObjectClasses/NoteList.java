package ru.gb.ObjectClasses;

import java.util.LinkedList;

/**
 * Class for storage Notes
 */
import ru.gb.WorkWithTheUser.View;
public class NoteList {
    LinkedList<Note> noteList = new LinkedList<Note>();

    /**
     * Empty Constructor
     */
    public NoteList(){
    }

    /**
     * Method for fill Note and add Note in LinkedList
     */
    public void addNote(){
        Note newNote = new Note(View.inputTitle(), View.inputNote());
        noteList.add(newNote);
    }

    /**
     * Method for print Notes title
     */
    public void printNoteList(){
        int i = 0;
        for (Note note:noteList) {
            i++;
            System.out.println(String.format("%d:%s",i ,note.printToList()));
        }
        System.out.println();
    }

    /**
     * Method for choice and print Note
     */
    public void printNote(){
        System.out.println();
        printNoteList();
        System.out.println("Введите номер записки которую хотите посмотреть: ");
        System.out.println();
        System.out.println(noteList.get(View.choiceNote(noteList.size())));
    }
}