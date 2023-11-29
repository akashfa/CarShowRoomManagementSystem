package com.akash;

import java.util.Scanner;

public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employess;
    int total_car_in_stock=0;
    String manger_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Total employess: "+total_employess);
        System.out.println("Total car in stock: "+total_car_in_stock);
        System.out.println("Manger Name: "+manger_name);

    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("========================****** ENTER THE SHOWROOM DETAILS ****=================");
        System.out.println("SHOWROOM NAME");
        showroom_name=sc.nextLine();
        System.out.println();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address=sc.nextLine();
        System.out.println("TOTAL EMPLOYESS");
        total_employess=sc.nextInt();
        System.out.println("TOTAL CAR IN STOCK");
        total_car_in_stock=sc.nextInt();
        sc.nextLine();
        System.out.println("MANGER NAME");
        manger_name=sc.nextLine();
    }
}
