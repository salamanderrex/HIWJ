//Iterator over HashMap

Map<Character, Integer> map = new HashMap<Character, Integer>();


Iterator it = map.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry pair = (Map.Entry) it.next();
		
	if ((int) pair.getValue() % 2 != 0) {
		//do something
	}
}

//use Generics

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
		
		
//Set
Set<Integer> set = new TreeSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(3);

    //good way:
    Iterator<Integer> iterator = set.iterator();
    while(iterator.hasNext()) {
        Integer setElement = iterator.next();
        if(setElement==2) {
            iterator.remove();
        }
    }
	//bad way:
	for(Integer setElement:set) {
		if(setElement==2) {
			//might work or might throw exception, Java calls it indefined behaviour:
			set.remove(setElement);
		} 
	}
