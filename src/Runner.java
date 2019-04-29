public class Runner {

        public static void main(String[] args) {
            Ingredient Cheese = new Ingredient("Cheese", 3.50 );
            Ingredient Pasta = new Ingredient("Pasta", 2);
            Ingredient Chicken = new Ingredient("Chicken", 5.25);
            Ingredient Peppers = new Ingredient("Peppers", 1.30);

            MenuItem Special = new MenuItem("Special", 5);
            MenuItem Veggie = new MenuItem("Veggie", 10 );
            MenuItem Plain = new MenuItem("Plain", 15);

            Table Table1 = new Table("Table1");
            Table Table2 = new Table("Table2");

            Special.addIngredient(Cheese);
            Special.addIngredient(Pasta);
            Special.addIngredient(Chicken);

            Veggie.addIngredient(Cheese);
            Veggie.addIngredient(Pasta);
            Veggie.addIngredient(Peppers);

            Plain.addIngredient(Pasta);
            Plain.addIngredient(Peppers);

            Table1.addItem(Special);
            Table1.addItem(Special);
            Table1.addItem(Veggie);

            Table2.addItem(Veggie);
            Table2.addItem(Veggie);
            Table2.addItem(Veggie);
            Table2.addItem(Plain);
            Table2.addItem(Plain);


            System.out.println(Table1.toString());
            System.out.println(Table2.toString());
    }
}
