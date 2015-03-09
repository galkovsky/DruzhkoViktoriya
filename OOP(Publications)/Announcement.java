/**
 * Created by User on 02.03.2015.
 */
public class Announcement extends Publication {

    public Announcement(String text) {
        super(text);
    }

    public void publish (){
        System.out.println("--------ANNOUNCEMENT--------");
        super.publish();
    }
}
