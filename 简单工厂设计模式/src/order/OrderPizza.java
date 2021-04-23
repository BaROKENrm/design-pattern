package order;

import pizza.Pizza;
import simpleFactory.SimpleFactory;

import java.util.Scanner;

public class OrderPizza {
    static SimpleFactory simpleFactory;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你想要的pizza");
        String name = scan.nextLine();
        simpleFactory = new SimpleFactory(name);
        Pizza pizza = simpleFactory.creatPizza();
    }

}
