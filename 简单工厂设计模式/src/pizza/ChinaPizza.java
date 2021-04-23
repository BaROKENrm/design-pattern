package pizza;

public class ChinaPizza extends Pizza{
    String name;

    public ChinaPizza(String name){
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println(name + " prepare");
    }


}
