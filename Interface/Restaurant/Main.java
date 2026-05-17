public class Main {
    public static void main(String[] args) {
        FastFood f1 = new FastFood("Kababjees" , "Hyderabad" , new String[]{"Pizza" , "Burger" , "Desert"} , new int[]{3000 , 1500, 2500});
        f1.showMenu();
        f1.cookFood("Pizza");
        System.out.println(f1.deliver());
        System.out.println(f1.serve());
        f1.generateBill();


        Desi d1 = new Desi("Brohi" , "Hyderabad" , new String[]{"Karahi", "Handi", "Dampukht"} , new int[]{2000, 2000, 5000});
        d1.showMenu();
        d1.cookFood("Karahi");
        System.out.println(d1.deliver());
        System.out.println(d1.serve());
        d1.generateBill();
    }
}
