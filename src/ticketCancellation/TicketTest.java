package ticketCancellation;

import java.util.Date;

public class TicketTest {
    public static void main(String[] args) {
        Date eventDateTime = new Date(System.currentTimeMillis() + 2 * 24 * 60 * 60 * 1000);
        Date cancellationTime = new Date(System.currentTimeMillis() + 25 * 60 * 60 * 1000);
        Ticket ticket = new Ticket(100.0, eventDateTime);
        RedBus redBus = new RedBus();
        redBus.calculateRefund(ticket,cancellationTime);
    }
}
