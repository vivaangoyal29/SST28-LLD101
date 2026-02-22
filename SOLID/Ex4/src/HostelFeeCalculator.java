import java.util.*;

public class HostelFeeCalculator {
    private final FakeBookingRepo repo;

    public HostelFeeCalculator(FakeBookingRepo repo) { this.repo = repo; }

    // OCP violation: switch + add-on branching + printing + persistence.
    public void process(BookingRequest req) {
        Money monthly = FeeCalculator.calculateMonthly(req);
        Money deposit = new Money(req.roomType.deposit());

        ReceiptPrinter.print(req, monthly, deposit);
        String BookingId = BookingIdGenerator.generate();
        repo.save(BookingId, req, monthly, deposit);

    }
}
