public class DecimalTranslator
{
    //instance variables.
    protected static int number;

    //empty constructor.(for future develop maybe)
    public DecimalTranslator()
    {
        //pass
    }

    //contructor for initializing with the num.
    public DecimalTranslator(int num)
    {
        number = num;
    }
    
    //to string override method.
    public String toString()
    {
        return String.format("Deciaml value: %d\nBinary value: %s\nHexa value: %s\nOcta value: %s",number, Binary.calculation(), Hexa.calculation(), Octa.calculation());
    }

}