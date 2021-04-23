package pizza;

public class ChessPizza extends Pizza{

    private String name;

    public ChessPizza(String name){
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println(name + " prepare");
    }

}
