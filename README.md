# concate two int array 
```java
public static void concate(int A[], int B []) {
        int [] union =  IntStream.concat(IntStream.of(A),IntStream.of(B)).toArray();
        System.out.println(Arrays.toString(union));
}
```