package ticketCancellation;

import java.util.Date;

public class Ticket {
    private  double price;
    private Date ticketDateTime;

    public Ticket(double price, Date ticketDateTime) {
        this.price = price;
        this.ticketDateTime = ticketDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getTicketDateTime() {
        return ticketDateTime;
    }

    public void setTicketDateTime(Date ticketDateTime) {
        this.ticketDateTime = ticketDateTime;
    }
}
