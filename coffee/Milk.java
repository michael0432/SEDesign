public class Milk extends Condiment{
    public Milk(Beverage bs){
        super(bs);
    }
    public double cost(){
        return 0.2 + super.cost();
    }
}