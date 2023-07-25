public class Main {
    public static void main(String[] args) {
        BurgerBuilder bb1 = new BurgerBuilder();
        bb1.addBun().addLettuce().addSauce().addCheese().addPatty().addBun();
        bb1.buildBurger();
    }
}