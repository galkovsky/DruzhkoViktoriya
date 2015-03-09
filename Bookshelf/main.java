/**
 * Created by User on 03.03.2015.
 */
public class main {
    public static void main(String[] args) {
        Bookshelf1 bshelf1 = new Bookshelf1(1,2);
        Bookshelf1 bshelf2 = new Bookshelf1(1,2);
        Bookshelf1 bshelf3 = bshelf1;

        System.out.println(bshelf1==bshelf2);
        System.out.println(bshelf1.equals(bshelf2));
        System.out.println("//////////////////////////////////");

        System.out.println(bshelf1==bshelf3);
        System.out.println(bshelf1.equals(bshelf3));
        System.out.println("//////////////////////////////////");



        Bookshelf shelf1 = new Bookshelf(1,2);
        Bookshelf shelf2 = new Bookshelf(1,2);
        Bookshelf shelf3 = shelf1;

        System.out.println(shelf1==shelf2);
        System.out.println(shelf1.equals(shelf2));
        System.out.println("//////////////////////////////////");

        System.out.println(shelf1==shelf3);
        System.out.println(shelf1.equals(shelf3));
        System.out.println("//////////////////////////////////");


    }
}


