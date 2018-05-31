package tk.lslayer.rent.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by lslay on 30.04.2018.
 */
public class Orders {
    private List<RentOrder> orders;

    public void makeOrder(RentObject what, Customer who, LocalDate from, Duration duration) {
        if (objectAvalable(orders, what, from, duration)) {
            RentOrder order = new RentOrder(who, what, from, duration);
        }
    }

    public List<RentOrder> getOrdersByObject(List<RentOrder> from, RentObject object) {
        return from.stream().filter(order -> Objects.equals(order.getRentedObject(), object)).collect(Collectors.toList());
    }


    boolean objectAvalable(List<RentOrder> orders, RentObject what, LocalDate from, Duration duration) {
        List<RentOrder> itemsToCheck = getOrdersByObject(orders, what);
        LocalDate endDate = from.plus(duration);
        for (RentOrder order : itemsToCheck) {
            LocalDate orderStartDate = order.getStartDate();
            LocalDate orderEndDate = orderStartDate.plus(order.getDuration());
            if (max(from, orderStartDate).isBefore(min(endDate, orderEndDate))) {
                return false;
            }
        }
        return true;
    }

    public boolean isOverlapping(LocalDate from, LocalDate to, LocalDate startDate, LocalDate endDate) {
        return max(from, startDate).isBefore(min(to, endDate));
    }

    private LocalDate max(LocalDate a, LocalDate b) {
        return a.isAfter(b) ? a : b;
    }

    private LocalDate min(LocalDate a, LocalDate b) {
        return a.isBefore(b) ? a : b;
    }
}
