/**
 * Created by User on 02.03.2015.
 */
import java.time.LocalDate;
import java.util.Date;
public class Publication {
    String text;
    LocalDate data;

    public Publication (String text){
        this.text=text;
        data=LocalDate.now();
    }

    public void publish() {
       System.out.println(text+" "+data);
    }
}
