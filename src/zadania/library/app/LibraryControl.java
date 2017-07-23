package zadania.library.app;

import zadania.library.data.Book;
import zadania.library.data.Library;
import zadania.library.utils.DataReader;

public class LibraryControl {
	
	    // sta³ê
	    public static final int EXIT = 0;
	    public static final int ADD_BOOK = 1;
	    public static final int PRINT_BOOKS = 2;
	 
	    // zmienna do komunikacji z u¿ytkownikiem
	    private DataReader dataReader;
	 
	    // "biblioteka" przechowuj¹ca dane
	    private Library library;
	 
	    public LibraryControl() {
	        dataReader = new DataReader();
	        library = new Library();
	    }
	 
	    /*
	     * G³ówna pêtla programu, która pozwala na wybór opcji i interakcjê
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
	                System.out.println("Nie ma takiej opcji, wprowadŸ ponownie: ");
	            }
	            printOptions();
	        }
	        // zamykamy strumieñ wejœcia
	        dataReader.close();
	    }
	 
	    private void printOptions() {
	        System.out.println("Wybierz opcjê: ");
	        System.out.println(EXIT + " - wyjœcie z programu");
	        System.out.println(ADD_BOOK + " - dodanie nowej ksi¹¿ki");
	        System.out.println(PRINT_BOOKS + " - wyœwietl dostêpne ksi¹¿ki");
	    }
	 
	    private void addBook() {
	        Book book = dataReader.readAndCreateBook();
	        library.addBook(book);
	    }
	 
	    private void printBooks() {
	        library.printBooks();
	    }
}
