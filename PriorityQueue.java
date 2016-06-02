import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qingyu on 11/16/15.
 */
class Food {
    public String food;
    public int count;
    public Food(String food, int Count) {
        this.food = food;
        this.count = Count;

    }
}
//max Heap
static class FoodComparator implements Comparator<Food> {
    public int compare(Food f1, Food f2) {
        return -(f1.count - f2.count);
    }
}
public class LogParse {

  FoodComparator fc = new FoodComparator();
  PriorityQueue <Food> fq = new PriorityQueue<>(100,fc);
  for (Map.Entry<String,Integer> food : map.entrySet()) {
      Food newFood = new Food(food.getKey(),food.getValue());
      fq.offer(newFood);


  }
  System.out.println("size"+fq.size());
  int size = fq.size();
  for (int i =0 ; i< size;i++) {
      System.out.println("i"+i);
      Food food = fq.poll();
     System.out.println(food.food+"number is "+food.count);
  }
}

//Max priority queue// max Heap
PriorityQueue <String> reversed = new PriorityQueue <String>(1000,Collections.reverseOrder());
//min heap
PriorityQueue <String> reversed = new PriorityQueue <String>();
