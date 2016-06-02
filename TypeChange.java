//int String to int
String num = "1";
Integer  result = Integer.valueOf(num);
int result = Integer.parseInt(num);

//float string 
Float result = Float.parseFloat(num);


//Character to int


The java.lang.Character.getNumericValue(char ch) returns the int value that the specified Unicode character represents. For example, the character '\u216C' (the roman numeral fifty) will return an int with a value of 50.

The letters A-Z in their uppercase ('\u0041' through '\u005A'), lowercase ('\u0061' through '\u007A'), and full width variant ('\uFF21' through '\uFF3A' and '\uFF41' through '\uFF5A') forms have numeric values from 10 through 35. This is independent of the Unicode specification, which does not assign numeric values to these char values.

If the character does not have a numeric value, then -1 is returned. If the character has a numeric value that cannot be represented as a nonnegative integer (for example, a fractional value), then -2 is returned.

ch1 = 'j';
ch2 = '4';

// create 2 int primitives i1, i2
int i1, i2;

// assign numeric values of ch1, ch2 to i1, i2
i1 = Character.getNumericValue(ch1);
i2 = Character.getNumericValue(ch2);

i1  ->  19 (A is 10 here)
i2  -> 4


//String to char array

char [] charArray = str.toCharArray();

//ouput the number as byte
int num = 3;
byte[] bytes = ByteBuffer.allocate(4).putInt(num).array();

for (byte b : bytes) {
   System.out.format("0x%x ", b);
}


//char to String
char s = 's';
String s = "" +s;

//or

String result = Character.toString('c'); 

//char array to string
char [] array = {'x' , 'x', 'g' ,'d' };
String fromCharArray = new String(array);