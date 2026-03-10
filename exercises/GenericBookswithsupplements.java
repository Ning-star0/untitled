package exercises;

import java.io.ObjectInputStream;

public class GenericBookswithsupplements {
    static class Book<T>{
        public String name;
        public String author;
        public String ISBN;
        public T Elsesupplentments;
        public Book(String name, String author, String ISBN, T Elsesupplentments) {
            this.name = name;
            this.author = author;
            this.ISBN = ISBN;
            this.Elsesupplentments=Elsesupplentments;
        }
        void getFullInfo(){
            System.out.println("Name : " + name);
            System.out.println("Author : " + author);
            System.out.println("ISBN : " + ISBN);
            System.out.println("Elsesupplentments : " + Elsesupplentments);
        }
    }
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Book 1", "Author 1", "ISBN 1", "sss");
        Book<Integer> book2= new Book<>("Book 2", "Author 2", "ISBN 2", 1235);
        Book<Integer> book3= new Book<>("Book 3", "Author 3", "ISBN 3", 1235);
        book1.getFullInfo();
        book2.getFullInfo();
        book3.getFullInfo();
    }

}
