package strategy;

import java.util.Comparator;

/**
 * @Author: xk
 * @Date: 2020/11/25 17:32
 * @Desc:
 */
public class CatHeightComparator implements Comparator<Cat> {
    public int compare(Cat o1, Cat o2) {
        if(o1.height < o2.height) return -1;
        else if (o1.height > o2.height) return 1;
        else return 0;
    }
}
