public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product cukier = new Product("Królewski", 3.30, "kryształ", 1, 23);
        Product chleb = new Product("CHlebowity-wysmienity", 1.99, "pieczywo", 1, 23);
        Product maslo = new Product("Smakovita", 3.99, "nabiał", 1,23);
        Product mleko = new Product("Mlekovita", 4.99, "nabiał", 1,23);
        Product banan = new Product("Afrykanski", 5.99, "owoce", 1,23);

        System.out.println("Cena brutto cukru wynosi " + cukier.countPriceVAT());
        System.out.println("Cena calego zapasu cukru wynosi " + cukier.countValueOfAllProduct());
        System.out.println("Cena brutto chleba wynosi " + chleb.countPriceVAT());
        System.out.println("Cena calego zapasu chleba wynosi " + chleb.countValueOfAllProduct());
        System.out.println("Cena brutto masla wynosi " + maslo.countPriceVAT());
        System.out.println("Cena calego zapasu masla wynosi " + maslo.countValueOfAllProduct());
        System.out.println("Cena brutto mleka wynosi " + mleko.countPriceVAT());
        System.out.println("Cena calego zapasu mleka wynosi " + mleko.countValueOfAllProduct());
        System.out.println("Cena brutto banana wynosi " + banan.countPriceVAT());
        System.out.println("Cena calego zapasu bananow wynosi " + banan.countValueOfAllProduct());
        System.out.println(calculateAll(cukier.countValueOfAllProduct(), chleb.countValueOfAllProduct(), maslo.countValueOfAllProduct()));
    }
    public static double calculateAll(double cena1, double cena2, double cena3){
        return cena1 + cena2 + cena3;
    }
}
