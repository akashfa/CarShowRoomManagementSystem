package com.akash;

import java.util.Scanner;

interface utility{
   public  void set_details();
    public void get_details();
}
public class Main {
    public static void main_Menu(){
        System.out.println();
        System.out.println("================****** WELCOME TO SHOWROOM MANAGEMANT SYSTEM *****===================");
        System.out.println();
        System.out.println("=========================****** ENTER THE CHOICE ******===============================");
        System.out.println();
        System.out.println("1]. ADD SHOWROOM\t\t\t\t 2]. ADD EMPLOYESS\t\t\t3]. ADD CAR");
        System.out.println();
        System.out.println("4]. GET SHOEROOMS\t\t\t\t 5]. GET EMPLOYEES\t\t\t 6]. GET CAR");
        System.out.println();
        System.out.println("========================****** ENTER THE 0 FOR EXITE ******===========================");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Showroom showroom[]=new Showroom[5];
        Employes employes[]=new Employes[5];
        Car car[]=new Car[5];
        int showroomcounter=0;
        int employescounter=0;
        int carcounter=0;
        int choice=-1;
        while(choice!=0){
            main_Menu();
            choice=sc.nextInt();
            while(choice!=9&&choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroomcounter]=new Showroom();
                        showroom[showroomcounter].set_details();
                        showroomcounter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW SHOWROOM");
                        System.out.println("9]. GO TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 2:
                        employes[employescounter]=new Employes();
                        employes[employescounter].set_details();
                        employescounter++;
                        System.out.println();
                        System.out.println("2]. ADD NEW EMPLOYES");
                        System.out.println("9]. GO TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        car[carcounter]=new Car();
                        car[carcounter].set_details();
                        System.out.println();
                        System.out.println("3]. ADD NEW EMPLOYES");
                        System.out.println("9]. GO TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroomcounter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employescounter;i++){
                            employes[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<carcounter;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER THE VALIDE CHOICE");
                        break;


                }
            }
        }
    }
}