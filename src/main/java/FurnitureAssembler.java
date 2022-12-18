import ConcreateBuilder.*;
import Director.AutomotiveEngineer;
import InterfaceBuilder.FurnitureBuilder;
import Product.Furniture;

public class FurnitureAssembler {


        public static void main(String[] args) {
            FurnitureBuilder builder = new CountryFurnitureBuilder();
            AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
            Furniture Furniture = engineer.manufactureFurniture();
            if (Furniture != null) {
                System.out.println("Below Furniture delievered: ");
                System.out.println("==================================================================================");
                System.out.println(Furniture);
                System.out.println("==================================================================================");
            }
        }



}
