package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int  choice;
    public static void main(String[] args) throws NumberFormatException, IOException {

        do{
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Iphone 13.   \n");
            System.out.print("            2. Iphone 13 ProMax.\n");
            System.out.print("            3. Iphone 13 Mini.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    ApplpePhone ap =new ApplpePhone();
                    System.out.println(ap.typeOfPhone());
                    System.out.println( ap.price());
                }
                break;

                case 2:{
                    Phone p1=new Iphone13ProMax((Phone) new ApplpePhone());
                    System.out.println(p1.typeOfPhone());
                    System.out.println( p1.price());
                }
                break;
                case 3:{
                    Phone p2=new Iphone13Mini((Phone) new ApplpePhone());
                    System.out.println(p2.typeOfPhone());
                    System.out.println( p2.price());
                }
                break;

                default:{
                    System.out.println("Other than these no phone available");
                }
                return;
            }//end of switch

        }while(choice!=4);
    }
}
