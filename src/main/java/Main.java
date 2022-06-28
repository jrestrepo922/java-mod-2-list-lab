import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a try with resources
        try (Scanner scanner = new Scanner(System.in)) {
            // define a shouldLoop variable
            Boolean moreBooks = true; 
            // Instantiate the library
            Library library = new Library(); 

            System.out.println("========== CREATE A BOOKS AND ADD TO THE LIBRARY ==========");
            // do  a while loop if should loop is set to true
            while(moreBooks){
                // create a scanner that ask for all the construtor values
                System.out.println("Please provide title");
                String title = scanner.nextLine();

                System.out.println("Please provide genre");
                String genre = scanner.nextLine();

                System.out.println("Please provide the number of pages");
                String numberOfPages = scanner.nextLine();

                // create the book and insert them into library; 
                Book newBook = new Book(title, genre, Integer.valueOf(numberOfPages)); 
                library.getCollectionOfBooks().add(newBook); 

                System.out.println("Book was created and added to library");
                // once all the values are entered create another scanner
                // asking if the user wants to add another book
                System.out.println("Want to add more books? answer is either yes or no");
                String moreBooksScanner = scanner.nextLine();
                // if users types no than change shouldLoop to false;
                if(moreBooksScanner.equals("no")){
                    moreBooks = false;
                }
                
            } 
        } 
        // catch (Exception e) {
        //     System.out.println("Something when wrong");
        // }

    }
}
