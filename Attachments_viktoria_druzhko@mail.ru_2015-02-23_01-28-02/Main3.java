import java.util.Arrays;
import java.util.*;

/**
 * Created by User on 22.02.2015.
 */
public class Main3
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите ход");
        String strok=scan.next();
        HodKonem h= new HodKonem();
        if (h.Korektno(strok))
        {
            if (h.Hod(strok))
            {
                System.out.println("Это является ходом");
            } else
            {
                System.out.println("Это не является ходом");
            }
        }
        else
        {
            System.out.println("Не корректные данные");
        }


    }
}


    class HodKonem
{
      HodKonem (){}

      HodKonem(String[][] Doska)
     {
         char p;
         for (int i = 0; i < 8; i++)
         {
             for (int j = 0; j < 8; j++)
             {
                 p=(char)(i+65);
                 Doska [i] [j] =p+Integer.toString(j+1);
             }
         }
     }





       public boolean Hod (String stroka)
       { String [][] Doska= new String [8][8];



        HodKonem D=new HodKonem(Doska);

        char[] Stroka=stroka.toCharArray();
        String a=String.valueOf(Stroka[0])+String.valueOf(Stroka[1]);
        String b=String.valueOf(Stroka[2])+String.valueOf(Stroka[3]);

        int poza1=0;
        int poza2=0;
        int pozb1=0;
        int pozb2=0;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
            if (Doska[i][j].equals(a))
                {
                 poza1=i;
                 poza2=j;
                }
            if (Doska[i][j].equals(b))
                {
                    pozb1=i;
                    pozb2=j;
                }

            }
        }
        int raz1=Math.abs(poza1-pozb1);
        int raz2=Math.abs(poza2-pozb2);
        boolean t=false;
        if (((raz1==1) && (raz2==2)) || ((raz1==2) && (raz2==1)))
        {
            t=true;
        }
        return t;

    }

    public boolean Korektno (String stroka)
    { String [][] Doska= new String [8][8];



        HodKonem D=new HodKonem(Doska);

        char[] Stroka=stroka.toCharArray();
        String a=String.valueOf(Stroka[0])+String.valueOf(Stroka[1]);
        String b=String.valueOf(Stroka[2])+String.valueOf(Stroka[3]);
        boolean t1=false;
        boolean t2=false;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (Doska[i][j].equals(a))
                {
                    t1=true;
                }
                if (Doska[i][j].equals(b))
                {
                    t2=true;
                }

            }
        }
        boolean t=false;
        if (t1 && t2)
        {
            t=true;
        }
        return t;

    }




}










