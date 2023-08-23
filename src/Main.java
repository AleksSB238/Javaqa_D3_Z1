public class Main {
    public static void main(String[] args) {
        BonusMilesService serviceCalcBonys = new BonusMilesService();
        int price = 10_000;
        int miles = serviceCalcBonys.BonysMilesСalculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
