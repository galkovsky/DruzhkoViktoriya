/**
 * Created by User on 02.03.2015.
 */
public class Article extends Publication {

    public Article(String text) {
        super(text);
    }

    public void publish (){
        System.out.println("--------ARTICLE--------");
        super.publish();
    }
}
