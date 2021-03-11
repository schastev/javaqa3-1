public class Main {
    public static void main(String[] args) {
        int payment = Integer.parseInt(args[0]); //to use this with a CL argument instead of changing the variable and recompiling
        int miles = 0;
        miles = payment / 20;
        System.out.println(miles);
    }
}
