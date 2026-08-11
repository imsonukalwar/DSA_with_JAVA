
import java.util.Arrays;


// # Selection Sort – String Array
// **Goal:** Sort strings in alphabetical order (A → Z).
// **Logic:** Find the smallest string in each round, store its index, and swap it with the current position.
// ### `compareTo()`
// * `< 0` → first string comes before second string
// * `== 0` → both strings are equal
// * `> 0` → first string comes after second string
// **Important line:**
// `str[j].compareTo(str[smallIndex]) < 0`
// Means: **If `str[j]` is smaller than the current smallest string, update `smallIndex`.**
// ### Easy Formula
// **Find Smallest → Store Index → Compare → Update → Swap**
// **Example:**
// `kiwi, banana, apple, mango, barry`
// ↓
// `apple, banana, barry, kiwi, mango`


public class sol {
    public static void sortFruets(String str[]){
        for (int i = 0; i < str.length-1; i++) {
            int smallIndex=i;
            for (int j = i+1; j < str.length; j++) {
                int ans=str[j].compareTo(str[smallIndex]);
                if(ans<0){
                    smallIndex=j;
                }
            }
            String temp=str[smallIndex];
            str[smallIndex]=str[i];
            str[i]=temp;

        }
    }
    public static void main(String[] args) {
        String []str={"kiwi","banana","apple","mango","barry"};
        sortFruets(str);
        System.out.println(Arrays.toString(str));
    }
}
