class Desi implements Restaurant{
    String resName;
    String reslocation;
    String[] foodItems;
    int[] price;

    public Desi(String resName, String reslocation, String[] foodItems, int[] price){
        this.resName = resName;
        this.reslocation = reslocation;
        this.foodItems = foodItems;
        this.price = price;
    }

    public void showMenu(){
        for (int i = 0; i < foodItems.length; i++) {
            System.out.println(foodItems[i]  + " - Rs." + price[i]);
        }
    }

    public void cookFood(String dish) {
        System.out.println(dish + "Dish is beign Cooked");
    }
    public String deliver(){
        return"Order Achi wendo tujo Sabar kar";
    }
    public String serve(){
        return"Order Achai to Table te ";
    }
    public void generateBill() {
        System.out.println("Hare pesa bhi bhar");
        int total = 0;
        for (int p : price) total += p;
        System.out.println("Bill for " + resName + ": Rs." + total);
    }
}
