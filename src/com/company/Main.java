package com.company;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("****************** Felipe's Fund Raiser Program *****************");
        ArrayList<Integer> id_array = new ArrayList<>();
        ArrayList<String> type_array = new ArrayList<>();
        ArrayList<Integer> amount_array = new ArrayList();

        //GETTING STUDENT INFO
        while (true) {
            Scanner myObj5 = new Scanner(System.in);
            System.out.println("Do you have another student sale to enter? (1 = yes, 0 = no)?");
            String next_student = (myObj5.nextLine());
            if (next_student.equalsIgnoreCase("0")) {
                break;
            }
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Please enter the student ID number:");
            int id = Integer.parseInt((myObj1.nextLine()));
            id_array.add(id);

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Please enter the type of card sold, \n(S for Starbucks, C for Chipotle and D for Dos Coyotes)");
            String type = (myObj2.nextLine());
            type_array.add(type);

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Please enter number of cards sold:");
            int amount = Integer.parseInt((myObj3.nextLine()));
            amount_array.add(amount);

            System.out.println(id_array);
            System.out.println(type_array);
            System.out.println(amount_array);
            System.out.println(amount_array.get(0));
        }

        //MANIPULATING STUDENT INFO
        //Total number of S types
        int total_s = 0;
        for (int i = 0; i >= (-1); i++){
            if (Objects.equals(type_array.get(i), "S")) {
                total_s++;
                System.out.println(type_array.get(i)); //why isnt it printing this shit
                System.out.println(total_s);

            }
        }




//        int total_s = 0;
//        if ("S" == type_array.get(0)) {
//            total_s++;
//            //System.out.println(type_array.get(0));
//            //System.out.println(total_s);

//        }
        //ArrayList<String> type_array = new ArrayList<String>();

////        System.out.println(type_array.get(0));
////        System.out.println("S");
////
////        System.out.println(Objects.equals(type_array.get(0), "S"));
        //System.out.println(type_array[0] == "S"); //idkytf this doesnt work
        //System.out.println(total_s);


        //Total number of C types

        //Total number of D types

        //Total number of all types

        //Total revenue from S types

        //Total revenue from C types

        //Total revenue from D types

        //Total revenue from all types


//        //PRESENTING STUDENT INFO
//        System.out.println("********************** End of Run Report **********************");
//        System.out.println("Total number of Starbucks gift cards sold:" +);
//        System.out.println("Total number of Chipotle gift cards sold:" +);
//        System.out.println("Total number of Dos Coyotes gift cards sold:" +);
//        System.out.println("Total number of all gift cards sold:" +);
//        System.out.println("Total revenue from Starbucks gift cards:" +);
//        System.out.println("Total revenue from Chipotle gift cards:" +);
//        System.out.println("Total revenue from Dos Coyotes gift cards:" +);
//        System.out.println("Total revenue raised:" +);

    }
}
