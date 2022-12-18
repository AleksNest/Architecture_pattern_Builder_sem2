package InterfaceBuilder;



import Product.Furniture;


public interface FurnitureBuilder {
    // stuff assembly stage 1
    public FurnitureBuilder fixStuff();

    // texture assembly stage 2
    public FurnitureBuilder fixTexture();

    // paint assembly stage 3
    public FurnitureBuilder fixPaint();

    // Accessory assembly stage 4
    public FurnitureBuilder fixAccessory();

    // Furniture release in case of successful assembly
    public Furniture build();
}