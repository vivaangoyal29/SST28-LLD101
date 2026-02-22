public class FeeCalculator {
    public static Money calculateMonthly(BookingRequest req){
        double base = req.roomType.monthly();

        double add = 0.0;
        for(PriceComponent a : req.addOns){
            add += a.monthly();
        }
        return new Money(base+add);
    }

}
