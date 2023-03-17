public class BonusMilesService {
    public int calculate (int price) {
        int oneMiles = 20;

        int miles = price / oneMiles;
        return miles;
    }
}
