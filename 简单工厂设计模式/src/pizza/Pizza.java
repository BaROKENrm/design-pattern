package pizza;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void cook(){
        System.out.println(name + " cook");
    }

    public void cut(){
        System.out.println(name + " cut");
    }

    public void box(){
        System.out.println(name + " box");
    }

    public void setName(String name){
        this.name = name;
    }

}
