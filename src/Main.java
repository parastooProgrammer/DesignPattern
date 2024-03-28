import myBeverage.Beverage;
import myBeverage.Espresso;
import myBeverage.Milk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ": $" + espresso.getCost());

        Beverage milkEspresso=new Milk(espresso);
        System.out.println(milkEspresso.getDescription() + ": $" + milkEspresso.getCost());


    }
}
