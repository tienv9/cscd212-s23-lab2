package cscd212classes.lab2;
import java.util.Objects;

public class Television implements Comparable<Television> {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model,
                      final boolean smart, final int screenSize, final int resolution) {
        if(make == null || make.isBlank() || model == null || model.isBlank() || screenSize < 32 || resolution < 720)
            throw new IllegalArgumentException("Invalid parameter in constructor");
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

    public Television(final String model, final boolean smart,
                      final int screenSize, final int resolution, final String make) {
        if(make == null || make.isBlank() || model == null || model.isBlank() || screenSize < 32 || resolution < 720)
                throw new IllegalArgumentException("Invalid parameter in constructor");
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
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getResolution() {
        return this.resolution;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    @Override
    public int compareTo(final Television another) {
        if(another == null)
            throw new IllegalArgumentException("null parameter in the compareTo method");
        if(this.make.compareTo(another.make) == 0)
            if(this.model.compareTo(another.model) == 0)
                if(this.screenSize == another.screenSize)
                    return 0;
                else
                    return this.screenSize - another.screenSize;
            else
                return this.model.compareTo(another.model);
        else
            return this.make.compareTo(another.make);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Television that)) return false;
        return this.fourK == that.fourK && this.resolution == that.resolution &&
                this.screenSize == that.screenSize && this.smart == that.smart &&
                Objects.equals(this.make, that.make) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.fourK) + this.make.hashCode() +
                this.model.hashCode() + this.resolution + Objects.hashCode(this.smart);
    }

    @Override
    public String toString() {
        if(this.smart && this.fourK)
            return this.make+"-"+this.model+", "+this.screenSize+" inch smart tv with 4K resolution";
        else if(this.smart)
            return this.make+"-"+this.model+", "+this.screenSize+" inch smart tv with "+this.resolution+" resolution";
        else if(this.fourK)
            return this.make+"-"+this.model+", "+this.screenSize+" inch tv with 4K resolution";
        else
            return this.make+"-"+this.model+", "+this.screenSize+" inch tv with "+this.resolution+" resolution";
    }





}
