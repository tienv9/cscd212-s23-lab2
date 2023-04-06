package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionScreenSizeComparator implements Comparator<Television>{
    @Override
    public int compare(Television o1, Television o2) {
        if(o1 == null || o2 == null)
            throw new IllegalArgumentException("null parameter in TelevisionScreenSizeComparator");

        if(o1.getScreenSize() > o2.getScreenSize())
            return o1.getScreenSize() - o2.getScreenSize();
        else if(o1.getScreenSize() < o2.getScreenSize())
            //this is different from TelevisionResolutionMakeDescendingComparator for some reason???
            return o1.getScreenSize() - o2.getScreenSize();
        else
            return 0;
    }
}
