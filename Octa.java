import java.util.ArrayList;

public class Octa extends DecimalTranslator
{
    public static String calculation()
    {
        //storage with all the digits that octal uses.
        String octaChar[] = {"0", "1", "2", "3", "4", "5", "6", "7"};
        ArrayList<String> result = new ArrayList<String>();

        //copying the number value into z.
        int z = number;
        
        //loop to add the digit needed into the result arraylist.
        for(int i = z; i > 0; i /= 8)
        {
            result.add(octaChar[i % 8]);
        }
        
        //string variable for storage.
        String x = "";

        //loop for reverting the order of the result arraylist and storage into the x variable string.
        for(int lastPos = result.size() - 1; lastPos >= 0; lastPos--)
        {
            x += result.get(lastPos) + " ";
        }
        return x;
    }
}
