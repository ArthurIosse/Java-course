public class Field {



    public static void printfield()
    {

        int B = 20;
        int H = 20;

        for ( int i = 0 ; i <= B ; i++)
        System.out.println("#");
            for ( int j = 0 ; j <= H ; j++)
            {
                if (j == 0 || j == H)
                {
                    System.out.println("#");
                }
            }
    }

}
