package ru.gb.PointOfEntry;

import ru.gb.ObjectClasses.NoteList;
import ru.gb.WorkWithTheUser.View;

/**
 * Class of entry
 */
public class Main {
    /**
     * Method of entry
     * @param args - Input args
     */
    public static void main(String[] args) {
        int answer;
        NoteList noteList = new NoteList();
        do{
            answer = View.mainMenu();
            if (answer == 1){
                System.out.println();
                noteList.addNote();
            } else if (answer == 2) {
                System.out.println();
                noteList.printNoteList();
            } else if (answer == 3) {
                System.out.println();
                noteList.printNote();
            } else if (answer == 0) {
                System.out.println("Выход из программы.");
            } else {
                System.out.println("Неправильно введена цифра попробуйте еще раз: ");
            }
        }while(answer!=0);
        View.scannerClose();
    }
}