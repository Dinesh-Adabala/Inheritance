package ticketCancellation;

import java.util.Date;

public class RedBus implements CancellationPolicy{

    private long calculateHoursDifference(Date start, Date end) {
        long millisecondsDifference = end.getTime() - start.getTime();
        return millisecondsDifference / (1000 * 60 * 60);
    }
    @Override
    public double calculateRefund(Ticket ticket, Date cancellationTime) {
        double refundAmount ;
        long hoursUntilEvent = calculateHoursDifference(cancellationTime, ticket.getTicketDateTime());
        if (hoursUntilEvent >= 48) {
            refundAmount = ticket.getPrice() * TicketCancellationEnum.FULL_REFUND.getRefundRate();
            System.out.println("Refund Amount: " + refundAmount);
            return refundAmount;
        } else if (hoursUntilEvent >= 24) {
            refundAmount = ticket.getPrice() * TicketCancellationEnum.HALF_REFUND.getRefundRate();
            System.out.println("Refund Amount: " + refundAmount);
            return refundAmount;
        } else {
            refundAmount = ticket.getPrice() * TicketCancellationEnum.NO_REFUND.getRefundRate();
            System.out.println("Refund Amount: " + refundAmount);
            return refundAmount;
        }
    }
}
