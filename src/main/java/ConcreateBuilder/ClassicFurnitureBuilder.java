package ConcreateBuilder;

import InterfaceBuilder.FurnitureBuilder;
import Product.Furniture;

public class ClassicFurnitureBuilder implements FurnitureBuilder {
    private String stuff;
    private String texture;
    private String paint;
    private String accessory;

    public ClassicFurnitureBuilder() {
        super();
    }

    @Override
    public FurnitureBuilder fixStuff() {
        System.out.println("Assembling stuff of the classic style");
        this.stuff = "oak ";
        return this;
    }

    @Override
    public FurnitureBuilder fixTexture() {
        System.out.println("Assembling texture of the classic style");
        this.texture = "seamless";
        return this;
    }

    @Override
    public FurnitureBuilder fixPaint() {
        System.out.println("Painting texture of the classic style");
        this.paint = "White";
        return this;
    }

    @Override
    public FurnitureBuilder fixAccessory() {
        System.out.println("Setting up accessory of the classic style");
        this.accessory = "Classic accessory";
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