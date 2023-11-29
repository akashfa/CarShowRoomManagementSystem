package com.akash;

import java.util.Scanner;
import java.util.UUID;

public class Employes extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("Employee id: "+emp_id);
        System.out.println("Employee name: "+emp_name);
        System.out.println("Employee age: "+emp_age);
        System.out.println("Employee departmant: "+emp_department);
        System.out.println("Showroom name: "+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emp_id=String.valueOf(uuid);
        System.out.println("================**** ENTER THE EMPLOYESS DETAILS ****=======================");
        System.out.println();
        System.out.println("EMPLOYES NAME:");
        emp_name=sc.nextLine();
        System.out.println("EMPLOYES AGE:");
        emp_age=sc.nextInt();
        System.out.println("EMPLOYES DEPARTMENT:");
        emp_department=sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroom_name=sc.nextLine();

    }
}
