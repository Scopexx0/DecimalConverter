//Jeronimo Augurusa Franco
import java.util.Scanner;
//Driver
//This program converts positive decimal numbers above 0 to binary, hexadecimal and octal. 
public class NumberTranslatorDriver 
{
    public static void main(String[] args)
    {
        //Scanner variable.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int in = input.nextInt();
        //initializing the object with the input as the parameter.
        DecimalTranslator test1 = new DecimalTranslator(in);
        System.out.println(test1);
        input.close();
    }
}
