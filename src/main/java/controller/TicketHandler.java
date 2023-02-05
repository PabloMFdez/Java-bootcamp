package controller;
import entities.StockItem;
import entities.Ticket;
import java.util.ArrayList;
public class TicketHandler {
    Ticket ticket = new Ticket();
    ArrayList<Ticket> tickets = new ArrayList<>();


    @Override
    public String toString() {
        return "Sales {" +
                "tickets=" + tickets +
                "} \n" +
                "Total value of sales: "+ totalValue();
    }

    public void addItemToTicket(StockItem item) {
        ticket.addItem(item);
    }

    public void storeTicket() {
        tickets.add(ticket);
    }

    private float totalValue() {
        return tickets.stream().map(Ticket::totalValue).reduce(0.0f, Float::sum);
    }
}

