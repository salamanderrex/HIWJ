/* package whatever; // don't place package name! */

import java.io.*;

class myString {
    String str ;
    myString (String str) {
        this.str= str;
    }
}
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Hello Java");
        String str = new String("1,2,3,#,#,4,5");
         String [] nodes = str.split(",");
        for (String t : nodes) {
            if (t == "#") 
                System.out.println("found #");
            if (t.equals("#"))
                System.out.println("in equals found # ");
        }
    }
}



Hello Java
in equals found # 
in equals found # 

