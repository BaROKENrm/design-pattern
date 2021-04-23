package simpleFactory;

import pizza.ChessPizza;
import pizza.ChinaPizza;
import pizza.GreekPizza;
import pizza.Pizza;

public class SimpleFactory {

    protected String name;

    protected Pizza pizza;

    public SimpleFactory(String name) {
        this.name = name;
    }

    public Pizza creatPizza(){
        switch (name) {
            case "chess":
                pizza = new ChessPizza(name);
                pizza.setName(name);
                break;

            case "greek":
                pizza = new GreekPizza(name);
                pizza.setName(name);
                break;
            case "china":
                pizza = new ChinaPizza(name);
                pizza.setName(name);
                break;
            default:
                System.out.println("没有这种披萨");
                return null;
        }

        pizza.prepare();
        pizza.cook();
        pizza.box();

        return pizza;
    }


}
