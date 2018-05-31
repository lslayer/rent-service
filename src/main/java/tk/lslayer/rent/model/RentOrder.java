package tk.lslayer.rent.model;

import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Created by lslay on 30.04.2018.
 */
public class RentOrder {

    @Id
    private String id;

    private Customer customer;
    private RentObject rentedObject;
    private LocalDate startDate;
    private Duration duration;

    public RentOrder(Customer customer, RentObject rentedObject, LocalDate startDate, Duration duration) {
        this.customer = customer;
        this.rentedObject = rentedObject;
        this.startDate = startDate;
        this.duration = duration;
    }

    public RentOrder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RentObject getRentedObject() {
        return rentedObject;
    }

    public void setRentedObject(RentObject rentedObject) {
        this.rentedObject = rentedObject;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RentOrder)) return false;
        RentOrder rentOrder = (RentOrder) o;
        return Objects.equals(id, rentOrder.id) &&
                       Objects.equals(customer, rentOrder.customer) &&
                       Objects.equals(rentedObject, rentOrder.rentedObject) &&
                       Objects.equals(startDate, rentOrder.startDate) &&
                       Objects.equals(duration, rentOrder.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, rentedObject, startDate, duration);
    }

    @Override
    public String toString() {
        return "RentOrder{" +
                       "id='" + id + '\'' +
                       ", customer=" + customer +
                       ", rentedObject=" + rentedObject +
                       ", startDate=" + startDate +
                       ", duration=" + duration +
                       '}';
    }
}
