package ConcreateBuilder;

import InterfaceBuilder.FurnitureBuilder;
import Product.Furniture;

public class ModernFurnitureBuilder implements FurnitureBuilder {
    private String stuff;
    private String texture;
    private String paint;
    private String accessory;

    public ModernFurnitureBuilder() {
        super();
    }

    @Override
    public FurnitureBuilder fixStuff() {
        System.out.println("Assembling stuff of the modern style");
        this.stuff = "mahogany";
        return this;
    }

    @Override
    public FurnitureBuilder fixTexture() {
        System.out.println("Assembling texture of the modern style");
        this.texture = "burnt tree";
        return this;
    }

    @Override
    public FurnitureBuilder fixPaint() {
        System.out.println("Painting texture of the modern style");
        this.paint = "RED";
        return this;
    }

    @Override
    public FurnitureBuilder fixAccessory() {
        System.out.println("Setting up accessory of the modern style");
        this.accessory = "Modern accessory";
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
