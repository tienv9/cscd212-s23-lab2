package cscd212classes.lab2;
import java.util.Objects;

public class Television implements Comparable<Television>{
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(String make, String model, boolean smart,int screenSize ,int resolution) {
        if(make == null || make.isBlank() || model == null || model.isBlank() || screenSize < 32 || resolution < 720)
            throw new IllegalArgumentException("Check parameters");
        if(resolution >= 2160)
            this.fourK = true;
        else
            this.fourK = false;
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public Television(String model, boolean smart, int screenSize, int resolution, String make){
        if(make == null || make.isBlank() || model == null || model.isBlank() || screenSize < 32 || resolution < 720)
                throw new IllegalArgumentException("Check parameters");
        if(resolution >= 2160)
            this.fourK = true;
        else
            this.fourK = false;
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public int compareTo(Television another){
        if(another == null)
            throw new IllegalArgumentException("Null object");

        if(this.make == another.make && this.model == another.model && this.screenSize == another.screenSize)
            return 0;
        else
            return -1;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Television that)) return false;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fourK, make, model, resolution, screenSize, smart);
    }

    @Override
    public String toString() {
        if(smart && fourK)
            return make+"-"+model+", "+screenSize+" inch smart tv with 4K resolution";
        else
            return make+"-"+model+", "+screenSize+" inch tv with "+resolution+" resolution";
    }





}
