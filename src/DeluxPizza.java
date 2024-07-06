public class DeluxPizza extends Pizza{
    @Override
    public void addExtraToppings() {}

    @Override
    public void addExtraCheese() {}

    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
}
}