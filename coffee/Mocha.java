public class Mocha extends Condiment{
    public Mocha(Beverage bs){
        super(bs);
    }
    public double cost(){
        return 0.25 + super.cost();
    }
}