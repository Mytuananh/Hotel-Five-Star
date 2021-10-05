package View;

import Controller.Hotel;
import Model.Order;
import Model.Room;
import Model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Information {
    public static void Menu() {
        int step = 1;

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userArrayList = new ArrayList<>();
        ArrayList<Room> roomArrayList = new ArrayList<>();
        ArrayList<Order> orderArrayList = new ArrayList<>();
        Hotel hotelOfMine = new Hotel(roomArrayList, userArrayList, orderArrayList);
        Room room1 = new Room("201", "Single Room - Normal", 100, true);
        Room room2 = new Room("202", "Single Room - Normal", 100, true);
        Room room3 = new Room("203", "Single Room - Vip", 200, true);
        Room room4 = new Room("204", "Single Room - Vip", 200, true);
        Room room5 = new Room("301", "Couple Room - Normal", 250, true);
        Room room6 = new Room("302", "Couple Room - Normal", 250, true);
        Room room7 = new Room("303", "Couple Room - Vip", 450, true);
        Room room8 = new Room("304", "Couple Room - Vip", 450, true);
        roomArrayList.add(room1);
        roomArrayList.add(room2);
        roomArrayList.add(room3);
        roomArrayList.add(room4);
        roomArrayList.add(room5);
        roomArrayList.add(room6);
        roomArrayList.add(room7);
        roomArrayList.add(room8);


        while (step != 0) {
            System.out.println("MenuManager: ");
            System.out.println("Step 1. Fill in customer information.");
            System.out.println("Step 2. Choose a room.");
            System.out.println("Step 3.Checkout and Payment");
            System.out.println("Step 4. Exit");
            System.out.println("Enter : ");
            step = scanner.nextInt();
            User guest = new User();
            String name;
            String doB;
            String code;
            Order order = new Order();
            userArrayList.add(guest);
            switch (step) {
                case 1:
                    System.out.println("Step 1. Fill in customer information.");
                    System.out.println("Date Of Birth: ");

                    doB = scanner.next();

                    System.out.println("FullName: ");
                    name = scanner.next();


                    System.out.println("Code: ");
                    code = scanner.next();

                    guest.setFullName(name);
                    guest.setDateOfBirth(doB);
                    guest.setCode(code);
                    order.setUser(guest);


                    System.out.println("Day Checkin: ");
                    System.out.println("Enter Day: ");
                    int day = scanner.nextInt();

                    System.out.println("Enter Month: ");
                    int month = scanner.nextInt();

                    System.out.println("Enter Year: ");
                    int year = scanner.nextInt();

                    LocalDate checkin = LocalDate.of(year, month, day);
                    order.setCheckin(checkin);
                    hotelOfMine.showUser();

                case 2:
                    System.out.println("Step 2. Choose a room: ");
                    System.out.println("0. Room: 201 - Single Room - Normal - 100");
                    System.out.println("1. Room: 202 - Single Room - Normal - 100");
                    System.out.println("2. Room: 203 - Single Room - Vip - 200");
                    System.out.println("3. Room: 204 - Single Room - Vip - 200");
                    System.out.println("4. Room: 301 - Couple Room - Normal - 250");
                    System.out.println("5. Room: 302 - Couple Room - Normal - 250");
                    System.out.println("6. Room: 303 - Couple Room - Vip - 450");
                    System.out.println("7. Room: 304 - Couple Room - Vip - 450");
                    System.out.println("Enter Room: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < roomArrayList.size(); i++) {
                        if (i == n) {
                            roomArrayList.get(i).setStatus(false);
                            System.out.println(roomArrayList.get(i));
                            order.setRoom(roomArrayList.get(i));
                            break;
                        }
                    }
                case 3:
                    System.out.println("Step 3. Checkout and Payment");
                    System.out.println("Day checkout: ");
                    System.out.println("Enter Day: ");
                    int dayEnd = scanner.nextInt();

                    System.out.println("Enter Month: ");
                    int monthEnd = scanner.nextInt();

                    System.out.println("Enter Year: ");
                    int yearEnd = scanner.nextInt();

                    LocalDate checkout = LocalDate.of(yearEnd, monthEnd, dayEnd);
                    order.setCheckout(checkout);
                    System.out.println("Total Of " + guest.getFullName());
                    System.out.println(order.getTotalPrice());
                    orderArrayList.add(order);
                    System.out.println("Enter Total Money: ");
                    System.out.println(hotelOfMine.getAllTotal());
                    order.getRoom().setStatus(true);
                    System.out.println(order.getRoom());

                case 4:
                    System.exit(4);
                    break;
                    }


            }
        }
    }






