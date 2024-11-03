package ticketCancellation;

import java.util.Date;

public interface CancellationPolicy {
    double calculateRefund(Ticket ticket, Date cancellationTime);
}
