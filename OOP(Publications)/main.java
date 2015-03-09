/**
 * Created by User on 02.03.2015.
 */
import java.util.*;
public class main {
    public static void main(String[] args) {

        Publication[] publications = {new News("Mother"), new Article("Father"), new News("Brother"), new Announcement("Sister"), new Announcement("Doughter"), new Article("Sun")};
        for (int i = 0; i < publications.length; i++) {
           publications[i].publish();
        }

    }
}
