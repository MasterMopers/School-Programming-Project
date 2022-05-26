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

            //System.out.println(id_array);
            //System.out.println(type_array);
            //System.out.println(amount_array);
            //System.out.println(amount_array.get(0));
        }

        //MANIPULATING STUDENT INFO
        //Total number of S types, C types, D types
        float total_s = 0;
        float total_c = 0;
        float total_d = 0;

        for (int i = 0; i < type_array.toArray().length; i++){
            if (Objects.equals(type_array.get(i), "S")) {
                total_s = total_s + amount_array.get(i);
                //System.out.println(type_xarray.get(i));
                //System.out.println(total_s);

            }
            if (Objects.equals(type_array.get(i), "C")) {
                total_c = total_c + amount_array.get(i);

            }
            if (Objects.equals(type_array.get(i), "D")) {
                total_d = total_d + amount_array.get(i);

            }

        }

        //System.out.printl
        //n(total_c);
        //System.out.println(total_d);
        //System.out.println(total_s);


        //Total number of all types
        float total_types = total_s + total_d + total_c;

        //Total revenue from S types
        float total_rev_s = (total_s * 1);

        //Total revenue from C types
        float total_rev_c = ((total_c * 3)/2); //this math operation is correct

        //Total revenue from D types
        float total_rev_d = (total_d * 2);

        //Total revenue from all types
        float total_rev = total_rev_c + total_rev_s + total_rev_d;

        //PRESENTING STUDENT INFO
        System.out.println("********************** End of Run Report **********************");
        System.out.println("Total number of Starbucks gift cards sold: " + total_s);
        System.out.println("Total number of Chipotle gift cards sold: " + total_c);
        System.out.println("Total number of Dos Coyotes gift cards sold: " + total_d);
        System.out.println("Total number of all gift cards sold: " + total_types);
        System.out.println("Total revenue from Starbucks gift cards: " + total_rev_s);
        System.out.println("Total revenue from Chipotle gift cards: " + total_rev_c);
        System.out.println("Total revenue from Dos Coyotes gift cards: " + total_rev_d);
        System.out.println("Total revenue raised: " + total_rev);

    }
}
