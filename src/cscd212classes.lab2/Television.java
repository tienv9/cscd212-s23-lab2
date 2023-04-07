<<<<<<< Updated upstream:src/cscd212classes.lab2/Television.java
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

    public Television(String model, boolean smart, int screenSize, int resolution, String make){
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Television that)) return false;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fourK) + Objects.hash(make) + Objects.hash(model) + Objects.hash(resolution) + Objects.hash(screenSize) + Objects.hash(smart);
    }

    @Override
    public String toString() {
        if(smart && fourK)
            return make+"-"+model+", "+screenSize+" inch smart tv with 4K resolution";
        else if(smart)
            return make+"-"+model+", "+screenSize+" inch smart tv with "+resolution+" resolution";
        else if(fourK)
            return make+"-"+model+", "+screenSize+" inch tv with 4K resolution";
        else
            return make+"-"+model+", "+screenSize+" inch tv with "+resolution+" resolution";
    }





}
=======
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

    public Television(String model, boolean smart, int screenSize, int resolution, String make){
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Television that)) return false;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode(){
        return  Objects.hashCode(fourK) + this.make.hashCode() + this.model.hashCode() + this.resolution + Objects.hashCode(smart);
    }


    @Override
    public String toString() {
        if(smart && fourK)
            return make+"-"+model+", "+screenSize+" inch smart tv with 4K resolution";
        else if(smart)
            return make+"-"+model+", "+screenSize+" inch smart tv with "+resolution+" resolution";
        else if(fourK)
            return make+"-"+model+", "+screenSize+" inch tv with 4K resolution";
        else
            return make+"-"+model+", "+screenSize+" inch tv with "+resolution+" resolution";
    }





}
>>>>>>> Stashed changes:tests/cscd212classes/lab2/Television.java
