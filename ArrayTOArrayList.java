//for object
ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));

//org.apache.commons.lang3.ArrayUtils
//for primitive
//needs library support 
//org.apache.commons.lang3.ArrayUtils
char [] test = {'k', 'b'};
ArrayList <Integer> arrayList= new ArrayList<Integer> (Arrays.asList(ArrayUtils.toObject(intArray)));
System.out.println(arrayList);



Integer[] newArray = ArrayUtils.toObject(oldArray);
*/
//or just iterate all 
char [] test2 = {'k', 'a'};
ArrayList <Character> arrayList2 = new ArrayList<Character>();
for (int i =0 ; i < test2.length; i++) {
        arrayList2.add(test2[i]);
}

for (Character item : arrayList2) {
        System.out.println(item);
}



//two diemnsion
 int [][] test2 = { {2,1},{3,4}};
Arrays.deepToString();

//one diemnsion
int [] test = {2,4,6,8};
Arrays.toString();



List<String> list =new ArrayList<String>();
//add some stuff
list.add("android");
list.add("apple");
String[] stringArray = list.toArray(new String[list.size()]);