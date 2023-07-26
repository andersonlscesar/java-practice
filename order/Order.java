package order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order
{
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order() {}

    public Order(Client client, OrderStatus status)
    {
        this.status = status;
        this.client = client;
        this.moment = new Date();
    }

    public Client getClient()
    {
        return this.client;
    }

    public Date getMoment()
    {
        return moment;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public List<OrderItem> getOrderItems()
    {
        return orderItems;
    }

    public void  addItem(OrderItem item)
    {
        this.orderItems.add(item);
    }

    public void removeItem(OrderItem item)
    {
        this.orderItems.remove(item);
    }

}
