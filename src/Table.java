public class Table {

    private String name;
    private MenuItem[] order = new MenuItem[10];
    private int itemCount;

    public Table(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addItem(MenuItem zoinks) {
        order[itemCount] = zoinks;
        itemCount++;
    }

    public MenuItem[] getItems() {
        return order;
    }

    public double getTotalPrice() {
        double cacita = 0;
        for( int i = 0; i < itemCount; i++){
            cacita = cacita + itemCount;
        }
        return cacita;
    }

    public int determinePrepTime(){
        int chungus = 0;
        for(int i = 0; i < itemCount; i++){
            if(order[i].getPrepTime() > chungus){
                chungus = order[i].getPrepTime();
            }
        }
        return chungus;
    }

    public String toString(){
        return("Table:" + name  + " Items: " + itemCount + " Total Price: " + getTotalPrice() + " Prep Time: " + determinePrepTime());

    }
}
