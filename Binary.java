import java.util.ArrayList;

public class Binary extends DecimalTranslator 
{
    public static String calculation()
    {
        //hardcoded decimal number.
        int num = number;
        //arraylist that stores the binary numbers and positions.
        ArrayList<Integer> listaa = new ArrayList<Integer>();
        //math that gets the closest exponent of two to the decimal number.
        int x = (int) (Math.log10(num)/Math.log10(2));
        //variable for adding the two's exponents until it gets the number.
        int y = 0;
        //for loop for adding the number and adding the binary number to the arraylist.
        for(int i = x; i >= 0; i--)
        {
            if(y + Math.pow(2, i) <= num)
            {
                y += Math.pow(2, i);
                listaa.add(1);   
            }
            else
            {
                listaa.add(0);
            }
        }

        //test the result of the closest exponent.
        // System.out.println(x);

        String storage = "";
        //loopint into the list for printing the numbers.
        for(Integer z : listaa)
        {
            storage += z + " ";
            // System.out.print(z + " ");
        }
        return storage;
    }
}
