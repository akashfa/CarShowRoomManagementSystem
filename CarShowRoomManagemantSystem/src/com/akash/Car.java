package com.akash;

import java.util.Scanner;

public class Car extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fule_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void set_details() {
        System.out.println("Car name: "+car_name);
        System.out.println("car color: "+car_color);
        System.out.println("Car fule type: "+ car_fule_type);
        System.out.println("Car price: "+car_price);
        System.out.println("Car type: "+car_type);
        System.out.println("Car transmission: "+car_transmission);

    }

    @Override
    public void get_details() {
        Scanner sc=new Scanner(System.in);

        System.out.println("=====================****** ENTER THE CAR DETAILS *****===================");
        System.out.println();
        System.out.println("CAR NAME: ");
        car_name=sc.nextLine();
        System.out.println("CAR COLOR: ");
        car_color=sc.nextLine();
        System.out.println("CAE FULE TYPE(PETROL/DIESEL): ");
        car_fule_type=sc.nextLine();
        System.out.println("CAR PRICE:");
        car_price=sc.nextInt();
        System.out.println("CAR TYPE(SUV /SEDAN): ");
        car_type=sc.nextLine();
        System.out.println("CAR TRANSMISSION(AUTOMATIC/MANUAL): ");
        car_transmission=sc.nextLine();
        total_car_in_stock++;

    }
}
