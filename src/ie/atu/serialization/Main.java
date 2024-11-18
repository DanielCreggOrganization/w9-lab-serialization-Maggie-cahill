package ie.atu.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    // // Example 1
    //  // Create a book
    //  Book book = new Book("Harry Potter", "J.K Rowling", 20.99);
    //  System.out.println("Original Book: " + book);

    //  //Serialize
    //  try(FileOutputStream fileOut= new FileOutputStream("Resources/book.ser");
    //      ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
    //         out.writeObject(book);
    //         System.out.println("Book has been serialized");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    // // Deserialize 
    // try(FileInputStream fileIn = new FileInputStream("Resources/book.ser");
    //     ObjectInputStream in = new ObjectInputStream(fileIn)) {
    //         Book deserializedBook = (Book) in.readObject();
    //         System.out.println("Book has been deserialized");
    //         System.out.println("Deserialized Book: " + deserializedBook);
    //     }catch (IOException | ClassNotFoundException e) {
    //         e.printStackTrace();
    //     }


    // -------------------------------------------


    // // DIY Task 2: Movie Serialization
    // Movie movie = new Movie("Star Wars", "George Lucas", 1977, 10.00);
    // System.out.println("Orginal Movie: " + movie);


    // try (FileOutputStream fileOut = new FileOutputStream("Resources/movie.ser");
    //      ObjectOutputStream serialize = new ObjectOutputStream(fileOut)) {
    //         serialize.writeObject(movie);
    //         System.out.println("Movie has been serialized");
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }

    // try (FileInputStream fileIn = new FileInputStream("Resources/movie.ser");
    //      ObjectInputStream deserialized = new ObjectInputStream(fileIn)) {
    //         Movie deserializedMovie = (Movie) deserialized.readObject();
    //         System.out.println("Movie has been deserialized");
    //         System.out.println("Deserialized Movie: " + deserializedMovie);
    //      } catch (IOException | ClassNotFoundException e) {
    //         e.printStackTrace();
    //      }



    // -------------------------------------------



    // // Example 2

    // List<Book> books = new ArrayList<>();
    // books.add(new Book("The Hobbit", "J.R.R Tolkien", 19.99));
    // books.add(new Book("Hunger Games", "Suzanna Collins", 25.99));
    // books.add(new Book("Narnia: The Magicians Nephew", "C.S. Lewis", 12.99));

    // System.out.println("Original Catalog: ");
    // books.forEach(System.out::println);

    // // Serialize List
    // serializeBooks(books, "Resources/library.ser");

    // // Deserialize List
    // List <Book> loadedBooks = deserializeBooks("Resources/library.ser");

    // System.out.println("\nDeserialized Catalog: ");
    // loadedBooks.forEach(System.out::println);
    // }

    // private static void serializeBooks (List<Book> books, String filename) {
    //     try (ObjectOutputStream out = new ObjectOutputStream(
    //             new FileOutputStream(filename))) {
    //                 out.writeObject(books);
    //                 System.out.println("\nCatalog has been serialized");
    //             } catch (IOException e) {
    //                 e.printStackTrace();
    //             }
    // }

    // private static List<Book> deserializeBooks(String filename) {
    //     List <Book> books = new ArrayList<>();
    //     try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
    //         books = (List<Book>) in.readObject();
    //         System.out.println("Catalog has been deserialized");
    //     } catch (IOException | ClassNotFoundException e) {
    //         e.printStackTrace();
    //     }
    //     return books;
    // }


    // ------------------------------------------------------



    // // DIY Task 3
  
    // List<Movie> movies = new ArrayList<>();
    // movies.add(new Movie("Star Wars", "George Lucas", 1977, 8.00));
    // movies.add(new Movie("What about Bob", "Some Guy", 1995, 7.77));
    // movies.add(new Movie("Zainab Sucks", "Michael B. Higgins", 2024, 10.00));
    // movies.add(new Movie("She Knows All", "Magdalena Sroka", 1964, 5.56));
    // movies.add(new Movie("It's a shame...just a shame", "Daniel Craig", 2023, 1.05));


    // System.out.println("Original Collection: ");
    // movies.forEach(System.out::println);

    // // Serialize Movies Catalog
    // serializeMovies(movies,"Resources/collection.ser");

    // // Deserialize Movies Catalog
    // List <Movie> unmixedMovies = deserializeMovies ("Resources/collection.ser");

    // System.out.println("Deserialized Collection:");
    // unmixedMovies.forEach(System.out::println);

    // }

    // private static void serializeMovies(List<Movie> movies, String filename) {
    //     try (ObjectOutputStream serialize = new ObjectOutputStream(
    //         new FileOutputStream(filename))) {
    //         serialize.writeObject(movies);
    //         System.out.println("\nCollection has been serialized");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // private static List <Movie> deserializeMovies (String filename) {
    //     List <Movie> movies = new ArrayList<>();
    //     try (ObjectInputStream deserialize = new ObjectInputStream (
    //          new FileInputStream(filename))) {
    //             movies = (List<Movie>) deserialize.readObject();
    //             System.out.println("Collection has been deserialized");
    //          }catch(IOException | ClassNotFoundException e) {
    //             e.printStackTrace();
    //          }
    //          return movies;
    // }

    

    // ---------------------------------------------


    // Example 3

    UserProfile user = new UserProfile("johndoe", "secret123", 3,"john@example.com");
    System.out.println("Original User: " + user);

    // serialize
    try (ObjectOutputStream out = new ObjectOutputStream(
         new FileOutputStream("Resources/user.ser"))) {
            out.writeObject(user);
            System.out.println("User has been serialized");
         } catch (IOException e) {
            e.printStackTrace();
         }

    // Deserialize 
    try (ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("Resources/user.ser"))) {
            UserProfile deserializedUser = (UserProfile) in.readObject();
            System.out.println("User has been deserialized");
            System.out.println("Deserialized User: " + deserializedUser);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
