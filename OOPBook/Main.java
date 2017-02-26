package lv.javaguru;

public class Main {

    public static void main(String[] args) {

        Book one = new Book();
        one.setAuthor("Ernest Hemingway");
        one.setTitle("The Old Man and The sea");
        one.setReleaseYear(1952);
        one.setNumOfPages(127);

        Book two = new Book();
        two.setAuthor("Carlos Castaneda");
        two.setTitle("The Teaching of Don Juan");
        two.setReleaseYear(1968);
        two.setNumOfPages(196);

        Book three = new Book();
        three.setAuthor("Steven King");
        three.setTitle("The Stand");
        three.setReleaseYear(1978);
        three.setNumOfPages(823);


        Book four = new Book("Robert Ludlum", "Bourne identity", 1980, 523);

        System.out.println("Book 1: " + one.getAuthor() + ", " + one.getTitle() + ", " + one.getNumOfPages() + ", " + one.getReleaseYear());
        System.out.println("Book 2: " + two.getAuthor() + ", " + two.getTitle() + ", " + two.getNumOfPages() + ", " + two.getReleaseYear());
        System.out.println("Book 3: " + three.getAuthor() + ", " + three.getTitle() + ", " + three.getNumOfPages() + ", " + three.getReleaseYear());
        System.out.println("Book 4: " + four.getAuthor() + ", " + four.getTitle() +   ", " + four.getReleaseYear() +  ", "  + four.getNumOfPages());

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}
