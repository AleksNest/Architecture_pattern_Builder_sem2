package Product;

public class Furniture {


    private String stuff;
    private String texture;
    private String paint;
    private String accessory;


    // constructor without arguments
    public Furniture() {
        super();
    }

    // constructor with arguments
    public Furniture(String stuff, String texture, String paint, String accessory) {
        this();
        this.stuff = stuff;
        this.texture = texture;
        this.paint = paint;
        this.accessory = accessory;
    }

    public String getStuff() { return stuff; }

    public void setStuff(String stuff) { this.stuff = stuff; }

    public String getTexture() { return texture; }

    public void setTexture(String texture) {this.texture = texture;}

    public String getPaint() { return paint; }

    public void setPaint(String paint) {this.paint = paint;}

    public String getAccessory() { return accessory; }

    public void setAccessory(String accessory) {this.accessory = accessory;}

    // method of checking the validity of fields
    public boolean doQualityCheck() {
        return (stuff != null && !stuff.trim().isEmpty()) && (texture != null && !texture.trim().isEmpty())
                && (paint != null && !paint.trim().isEmpty()) && (accessory != null && !accessory.trim().isEmpty());
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Furniture [stuff=").append(stuff).append(", texture=").append(texture).append(", paint=").append(paint).append(", accessory=").append(accessory);
        return builder.toString();
    }

}
