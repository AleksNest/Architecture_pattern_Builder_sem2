package ConcreateBuilder;


import InterfaceBuilder.FurnitureBuilder;
import Product.Furniture;

public class CountryFurnitureBuilder implements FurnitureBuilder {
    private String stuff;
    private String texture;
    private String paint;
    private String accessory;

    public CountryFurnitureBuilder() {
        super();
    }

    @Override
    public FurnitureBuilder fixStuff() {
        System.out.println("Assembling stuff of the country style");
        this.stuff = "pine tree";
        return this;
    }

    @Override
    public FurnitureBuilder fixTexture() {
        System.out.println("Assembling texture of the country style");
        this.texture = "wood";
        return this;
    }

    @Override
    public FurnitureBuilder fixPaint() {
        System.out.println("Painting texture of the country style");
        this.paint = "brown";
        return this;
    }

    @Override
    public FurnitureBuilder fixAccessory() {
        System.out.println("Setting up accessory of the country style");
        this.accessory = "country accessory";
        return this;
    }

    @Override
    public Furniture build() {
        Furniture Furniture = new Furniture(stuff, texture, paint, accessory);
        if (Furniture.doQualityCheck()) {
            return Furniture;
        } else {
            System.out.println("Furniture assembly is incomplete. Can't deliver!");
        }
        return null;
    }

}
