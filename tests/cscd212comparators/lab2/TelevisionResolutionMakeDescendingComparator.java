package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television> {
    @Override
    public int compare(Television o1, Television o2) {
        if(o1 == null || o2 == null)
            throw new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");

        if(o1.getResolution() > o2.getResolution())
            return o1.getResolution() - o2.getResolution();
        else if(o1.getResolution() < o2.getResolution())
            //this is different from TelevisionScreenSizeComparator for some reason???
            return o2.getResolution() - o1.getResolution();

        else if(o1.getResolution() == o2.getResolution())
            return -(o1.getMake().compareTo(o2.getMake()));
        return 0;
    }
}
