package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionModelScreenSizeComparator implements Comparator<Television>{
    @Override
    public int compare(Television o1, Television o2) {
        if(o1 == null || o2 == null)
            throw new IllegalArgumentException("null parameter in TelevisionModelScreenSizeComparator");

        //WHY IS THIS DIFFERENT FROM THE OTHER 2 COMPARATOR?????
        if(o1.getModel().compareTo(o2.getModel()) == 0)
            if(o1.getScreenSize() > o2.getScreenSize())
                return o1.getScreenSize() - o2.getScreenSize();
            else if(o1.getScreenSize() < o2.getScreenSize())
                return o1.getScreenSize() - o2.getScreenSize();
            else
                return 0;
        else
            return o1.getModel().compareTo(o2.getModel());
    }
}
