package Controller;

import Model.Order;
import Model.Room;
import Model.User;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> roomArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();
    ArrayList<Order> orderArrayList = new ArrayList<>();

    public Hotel(ArrayList<Room> roomArrayList, ArrayList<User> userArrayList, ArrayList<Order> orderArrayList) {
        this.roomArrayList = roomArrayList;
        this.userArrayList = userArrayList;
        this.orderArrayList = orderArrayList;
    }

    public void addNewRoom(Room room) {
        roomArrayList.add(room);
    }

    public long getAllTotal() {
        long total = 0;
        for (Order order: orderArrayList
             ) {
            total += order.getTotalPrice();
        }
        return total;
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public void addUser(User newUser) {
        userArrayList.add(newUser);
    }

    public void removeUser(int index) {
        userArrayList.remove(index);
    }

    public void editUser(int index, User user) {
        userArrayList.set(index, user);
    }

    public int checkUser(String code) {
        int index = -1;
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getCode().equals(code)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int checkRoom(String name) {
        int index = -1;
        for (int i = 0; i < roomArrayList.size(); i++) {
            if (roomArrayList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int checkOrder(String code) {
        int index = -1;
        for (int i = 0; i < orderArrayList.size(); i++) {
            if (orderArrayList.get(i).getUser().getCode().equals(code)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void showUser() {
        for (User user:userArrayList
             ) {
            System.out.println(user);
        }
    }
    public void showRoom() {
        for (Room room: roomArrayList
             ) {
            System.out.println(room);
        }
    }



}
