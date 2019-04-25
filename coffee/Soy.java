class Soy extends Condiment{
    public Soy(Beverage bs){
        super(bs);
    }
    public double cost(){
        return 0.1 + super.cost();
    }
}