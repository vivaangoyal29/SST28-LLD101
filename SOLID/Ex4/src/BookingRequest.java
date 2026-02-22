import java.util.*;

public class BookingRequest {
    public final PriceComponent roomType;
    public final List<PriceComponent> addOns;

    public BookingRequest(PriceComponent roomType, List<PriceComponent> addOns) {
        this.roomType = roomType;
        this.addOns = addOns;
    }
}
