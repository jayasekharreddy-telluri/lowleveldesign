package daythree;

import daythree.decarator.ExtraCheese;
import daythree.decarator.Mushroom;

public class Main {

    public static void main(String[] args) {

        BasePizza b = new Margherita();
        System.out.println("Margherita = " + b.cost());


        BasePizza be = new ExtraCheese(new Margherita());

        System.out.println("Margherita + ExtraCheese = " + be.cost());


        BasePizza bem = new Mushroom(new ExtraCheese(new Margherita()));

        System.out.println("Margherita + ExtraCheese + Mushroom = " + bem.cost());


        BasePizza bemf = new VegDelight(new Mushroom(new ExtraCheese(new Margherita())));


        System.out.println("Margherita + ExtraCheese + Mushroom = " + bemf.cost());


    }
}
