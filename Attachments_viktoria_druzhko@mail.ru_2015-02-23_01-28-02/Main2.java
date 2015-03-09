import java.util.Arrays;

/**
 * Created by User on 22.02.2015.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {45,89,23,4553,432,654,345};
        Masiv1 m = new Masiv1();
        m.Sortirovka(arr,"по возростанию");
        System.out.println (Arrays.toString(arr));
        m.Sortirovka(arr,"по убыванию");
        System.out.println (Arrays.toString(arr));
    }
}

class Masiv1
{
    public int [] Sortirovka (int [] m, String str)
    {
        if (str=="по возростанию")
        {   boolean t=true;
            for (int i = 0; i < m.length; i++)
            {   t=true;
                for (int j = 0; j < m.length-1-i; j++)
                {
                    if (m[j]>m[j+1])
                    {   int b=m[j];
                        m[j]=m[j+1];
                        m[j+1]=b;
                        t=false;
                    }
                }
                if (t)
                {
                    i=m.length+1;
                }
            }
        }
        else
        {   boolean t=true;
            for (int i = 0; i < m.length; i++)
            {   t=true;
                for (int j = 0; j < m.length-1-i; j++)
                {
                    if (m[j]<m[j+1])
                    {   int b=m[j];
                        m[j]=m[j+1];
                        m[j+1]=b;
                        t=false;
                    }
                }
                if (t)
                {
                    i=m.length+1;
                }
            }
        }
        return m;
    }

}