public class Duck{
    Fly flyBehavior;
    Quack quackBehavior;
    public Duck(String flyBehaviorS, String quackBehaviorS){
        this.setFlyBehavior(flyBehaviorS);
        this.setQuackBehavior(quackBehaviorS);
    }
    void display(){

    }
    public void swim(){
        String class_name = this.getClass().getSimpleName();
        System.out.print(class_name+" is swimming\n");
    }
    public void fly(){
        this.flyBehavior.fly();
    }
    public void quack(){
        this.quackBehavior.quack();
    }
    public void setFlyBehavior(String behavior){
        if(behavior.equals("CanFly")){
            this.flyBehavior = new FlyWithWing();
        }
        else if(behavior.equals("CannotFly")){
            this.flyBehavior = new FlyNoWing();
        }
    }
    public void setQuackBehavior(String behavior){
        if(behavior.equals("Quack")){
            this.quackBehavior = new QuackNormally();
        }
        else if(behavior.equals("Squeak")){
            this.quackBehavior = new Squeak();
        }
        else if(behavior.equals("Silent")){
            this.quackBehavior = new MuteQuack();
        }
    } 
}