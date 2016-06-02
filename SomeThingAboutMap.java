/* package whatever; // don't place package name! */
import java.util.*;
import java.io.*;

class myCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Hello Java");
        Map <Character, Integer> map = new HashMap<>();
        Character [] charArray = new Character [] {'a','b','c'};
        int i = 0;
        for (Character c : charArray) {
            map.put(c,i++);
        }
        System.out.println(map);
        Iterator <Map.Entry<Character,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println( (itr.next()).getKey());
        }
       

        
	}
}

//out put is 

{b=1, c=2, a=0}
b
c
a
    
    
See, the map will result the resvered order of the input !!!! (Find this thing by leetcode alien Dictionary problem)

//upldate later:
So stupid ...... Map does not have the meaning of the order at all...........
You can only check the inside of the map by printing it out