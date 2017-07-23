package zadania.library.app;

import zadania.library.data.Book;
import zadania.library.data.Library;
import zadania.library.utils.DataReader;

public class LibraryControl {
	
	    // sta��
	    public static final int EXIT = 0;
	    public static final int ADD_BOOK = 1;
	    public static final int PRINT_BOOKS = 2;
	 
	    // zmienna do komunikacji z u�ytkownikiem
	    private DataReader dataReader;
	 
	    // "biblioteka" przechowuj�ca dane
	    private Library library;
	 
	    public LibraryControl() {
	        dataReader = new DataReader();
	        library = new Library();
	    }
	 
	    /*
	     * G��wna p�tla programu, kt�ra pozwala na wyb�r opcji i interakcj�
	     */
	    public void controlLoop() {
	        int option;
	        printOptions();
	        while ((option = dataReader.getInt()) != EXIT) {
	            switch (option) {
	            case ADD_BOOK:
	                addBook();
	                break;
	            case PRINT_BOOKS:
	                printBooks();
	                break;
	            default:
	                System.out.println("Nie ma takiej opcji, wprowad� ponownie: ");
	            }
	            printOptions();
	        }
	        // zamykamy strumie� wej�cia
	        dataReader.close();
	    }
	 
	    private void printOptions() {
	        System.out.println("Wybierz opcj�: ");
	        System.out.println(EXIT + " - wyj�cie z programu");
	        System.out.println(ADD_BOOK + " - dodanie nowej ksi��ki");
	        System.out.println(PRINT_BOOKS + " - wy�wietl dost�pne ksi��ki");
	    }
	 
	    private void addBook() {
	        Book book = dataReader.readAndCreateBook();
	        library.addBook(book);
	    }
	 
	    private void printBooks() {
	        library.printBooks();
	    }
}
