package adt;
import java.util.*;
public class RandomString implements RandomList{

    ArrayList<Integer> randList;
    Random r;
    String[] arr;

    public RandomString(String[] arr) {
        randList = new ArrayList<>();
        r = new Random();
        this.arr = arr;
    }

    @Override
    public void createRandomList(int num) {
        for (int i = 0; i < num; i++) {
            int randomNumber = r.nextInt(arr.length);
            randList.add(randomNumber);
        }
    }

    @Override
    public String toString() {
        String[] newArray = new String[randList.size()];

        for(int i = 0; i < randList.size(); i++){
            newArray[i] = arr[randList.get(i)];
        }
        return "" + Arrays.toString(newArray);
    }
}
