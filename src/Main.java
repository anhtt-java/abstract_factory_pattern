import chair.Chair;
import factory.FurnitureAbstractFactory;
import factory.FurnitureFactory;
import factory.MaterialType;
import table.Table;

public class Main {

    public static void main(String[] args) {

        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.show();

        Table table = factory.createTable();
        table.show();
    }
}