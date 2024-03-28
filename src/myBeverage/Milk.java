package myBeverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public Double getCost() {
        return beverage.getCost()+ 1.0;// Milk cost 1 dollar
    }
}
