package br.com.tludmyla.builder;

public class Gerente {

    BurgerBuilder builder;

    // public Burger buildBurger() {
    // this.builder = builder;
    //  }

    public BurgerBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
