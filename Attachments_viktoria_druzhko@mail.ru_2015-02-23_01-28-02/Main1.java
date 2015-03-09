/**
 * Created by User on 22.02.2015.
 */
public class Main1 {
    public static void main(String[] args)
    {
        int[] arr = {7, 14, 28, 56, 112};
        Masiv m = new Masiv();
        if (m.Arifmeticheskaja(arr))
        {
            System.out.println("Массив является арифметической прогрессией");
        }
        else
        {
            System.out.println("Массив НЕ является арифметической прогрессией");
        }
        if (m.Geometricheskaja(arr))
        {
            System.out.println("Массив является геометрической прогрессией");
        }
        else
        {
            System.out.println("Массив НЕ является геометрической прогрессией");
        }
    }
}

class Masiv
{
    public boolean Arifmeticheskaja (int [] m)
    { int d=m[1]-m[0];
      boolean t=true;
      for (int i = 0; i < m.length-1; i++)
      {
          if (m[i+1]!=m[i]+d)
          {
              t=false;
              break;
          }
      }
      return  t;
    }

    public boolean Geometricheskaja (int[] m)
    {{ double d=m[1]/m[0];
        boolean t=true;
        for (int i = 0; i < m.length-1; i++)
        {
            if (m[i+1]!=m[i]*d)
            {
                t=false;
                break;
            }
        }
        return  t;
    }

    }
}
