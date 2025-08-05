
import java.util.*;
public class sol {
    public static ArrayList<Integer> union(int a[],int b[]){
        List<Integer> li = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (li.size() > 0 && li.get(li.size() - 1) != a[i]) {//it say to us the previous one is not should be qual (this one checker)
        //         //note there is one major mistakes is here this line will not work while our list is empty you about it
        //         //if list has no element (li.get(li.size()-1))<< this line goes to -1 index that is throw size exeption
                    li.add(a[i]);
                } else if (li.size() == 0) {
                    li.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (li.size() > 0 && li.get(li.size() - 1) != a[i]) {
                    li.add(a[i]);
                } else if (li.size() == 0) {
                    li.add(a[i]);
                }
                i++;
            } else {
                if (li.size() > 0 && li.get(li.size() - 1) != b[j]) {
                    li.add(b[j]);
                } else if (li.size() == 0) {
                    li.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (li.get(li.size() - 1) != a[i]) {
                li.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (li.get(li.size() - 1) != b[j]) {
                li.add(b[j]);
            }
            j++;
        }

        return new ArrayList<>(li);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 4, 5};
        int b[] = {1, 1, 2, 2};
        List<Integer> ls = union(a, b);
        for (var elem : ls) {
            System.out.println(elem);
        }
    }
}

