package ticketCancellation;

public enum TicketCancellationEnum {
    FULL_REFUND(1.0),
    HALF_REFUND(0.5),
    NO_REFUND(0.0);

    private final double refundRate;

    TicketCancellationEnum(double refundRate) {
        this.refundRate = refundRate;
    }

    public double getRefundRate() {
        return refundRate;
    }
}
