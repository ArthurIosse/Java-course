import java.util.stream.*;


//class book
//        {
//            int pages;
//            public book(int a)
//            {
//                pages = a;
//            }
//          public void show()
//          {
//              System.out.println("im class book");
//          }
//        }

public class Main {

    public static void printMegaBytesAndKiloBytes(double kiloBytes)
    {
        if(kiloBytes > 0)
        {
            double mb = kiloBytes/1028;
            double kb = kiloBytes - (mb * 1028);

            System.out.println(kiloBytes +"  KB = "+ mb +" MB and "+ kb +" KB " );
        }
        else
        {
            System.out.println("Error No 1");
        }

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes > 0)
        {
            int mb = kiloBytes/1028;
            int kb = kiloBytes - (mb * 1028);

            System.out.println(kiloBytes +"  KB = "+ mb +" MB and "+ kb +" KB " );
        }
        else
        {
            System.out.println("Error No 1");
        }

    }



    public static void main(String[] args) {


    System.out.println(259/100);


//    book antonov(101);
//    antonov.show();



    }

}
