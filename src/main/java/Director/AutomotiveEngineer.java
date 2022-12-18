package Director;

import InterfaceBuilder.FurnitureBuilder;
import Product.Furniture;

public class AutomotiveEngineer {
    private FurnitureBuilder builder;

    public AutomotiveEngineer(FurnitureBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Furniture Builder!");
        }
    }

    public Furniture manufactureFurniture() {
        return builder.fixStuff().fixTexture().fixPaint().fixAccessory().build();
    }

}

