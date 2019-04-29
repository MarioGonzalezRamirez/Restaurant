public class MenuItem {

    private Ingredient[] ingredients = new Ingredient[10];
    private String name;

    private int ingredientCount = 0;
    private int prepTime;

    public MenuItem(String name, int prepTime){
        this.name = name;
        this.prepTime = prepTime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient boi) {
        ingredients[ingredientCount] = boi;
        ingredientCount++;
    }

    public double getItemPrice() {
        double mottoPrice = 0;
        for (int i = 0; i < ingredientCount; i++) {
             mottoPrice = mottoPrice + ingredientCount;
        }
        return mottoPrice;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }

    public int getPrepTime(){
        return prepTime;
    }

    public void setPrepTime(int time){
        this.prepTime = time;

    }




}
