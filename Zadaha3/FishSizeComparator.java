package JavaHomeWork.Zadaha3;

import java.util.Comparator;

public class FishSizeComparator implements Comparator<Fish> {

    @Override
    public int compare(Fish o1, Fish o2) {
        return o1.getSize() - o2.getSize();
    }   
}