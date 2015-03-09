/**
 * Created by User on 02.03.2015.
 */
public class News extends Publication {

    public News(String text) {
        super(text);
    }

    public void publish (){
        System.out.println("--------NEWS--------");
        super.publish();
    }

}
