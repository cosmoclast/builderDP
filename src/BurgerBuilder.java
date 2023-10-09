import java.util.Stack;

public class BurgerBuilder {

    private Stack<String> burger;

    public BurgerBuilder(){
        this.burger = new Stack<>();
    }
    public BurgerBuilder addBun(){
        this.burger.push("Bun");
        return this;
    }
    public BurgerBuilder addPatty(){
        this.burger.push("Patty");
        return this;
    }
    public BurgerBuilder addLettuce(){
        this.burger.push("Lettuce");
        return this;
    }
    public BurgerBuilder addSauce(){
        this.burger.push("Sauce");
        return this;
    }
    public BurgerBuilder addTomato(){
        this.burger.push("Tomato");
        return this;
    }
    public BurgerBuilder addCheese(){
        this.burger.push("Cheese");
        return this;
    }
    public void buildBurger(){
        while(!burger.isEmpty()){
            System.out.println(burger.pop());
        }
    }
}


asdfasdfasdfasdf
