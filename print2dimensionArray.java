import java.io.*;
import java.util.Arrays;
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Hello Java");

        int [][] intArray = new int[2][];
        int [] subArray = new int [] {1,2,3};
        int [] subArray2 = new int [] {2,3,4};
        intArray[0] = subArray;
        intArray[1] = subArray2;

        System.out.print(Arrays.deepToString(intArray));
    }
}
