public abstract class Condiment implements Beverage{
    Beverage bs;
    public Condiment(Beverage bs){
        this.bs = bs;
    }
    public double cost(){
        return bs.cost();
    }
}