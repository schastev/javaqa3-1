public class Main {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]); //to use this with a CL argument instead of changing the variable and recompiling
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
