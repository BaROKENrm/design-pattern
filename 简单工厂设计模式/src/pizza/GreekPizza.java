package pizza;

public class GreekPizza extends Pizza{


    private String name;

    public GreekPizza(String name){
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println(name + " prepare");
    }



}
