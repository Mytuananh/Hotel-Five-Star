package Model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private LocalDate checkin;
    private LocalDate checkout;
    private User user;
    private Room room;

    public Order() {
    }

    public Order(LocalDate checkin, LocalDate checkout, User user, Room room) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.user = user;
        this.room = room;
    }

    public long getTotalPrice() {
        long result;
        long numDays = DAYS.between(checkin, checkout);
        int price = room.getPrice();

        result = numDays * price;
        return result;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


}
