package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap; // import the HashMap class

import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) {

        System.out.println("****************** Felipe's Fund Raiser Program *****************");

//        int id = 44444;
//        String type = S;
//        int amount = 6;
//        HashMap <String, Integer> type_amount = new HashMap<String, Integer>();
//        HashMap <String, Integer> type_amount = new HashMap<String, Integer>();
//        HashMap<Integer, Map<String, Integer>> id_type_amount = new HashMap<Integer, Map<String, Integer>>();
//        int amount;
//        String type;
//        int id;
//        id_type_amount.put(id, type, amount);
//        String id_current = null; //this is making my variable always equal null right? how can i bring the varible into scope without making it null
//        for (int i = 1; i <= 5; i++) {
//            id_current = "id_" + i;
//            System.out.println(id_current);
//        }
//        while (true) {
//            Scanner myObj11 = new Scanner(System.in);  //Create a Scanner object
//            System.out.println("Term #" + (termslist.size() + 1) + " (if done, enter 'done')"); //asking for input value of the first term
//            String term = (myObj11.nextLine());  //defining the first term as a variable string
//            if (term.equalsIgnoreCase("done")) {
//                break;
//            }
//        Scanner myObj0 = new Scanner(System.in);
//        System.out.println("How many students will you report:");
//        int student_amount = Integer.parseInt((myObj0.nextLine()));

        ArrayList<Integer> id_array = new ArrayList<>();
        ArrayList<String> type_array = new ArrayList<>();
        ArrayList<Integer> amount_array = new ArrayList();


        //GETTING STUDENT INFO
        while (true) {
//            for (int i = 1; i <= student_amount; i++) {   // I only use a for loop if i know with prior knowledge how many iterations i ask for. if not i just keep on asking until a certain input arises
//                int id_current = "id_" + i;
//                type_current =
//                System.out.println(id_current);
//                System.out.println(id_1);

            Scanner myObj5 = new Scanner(System.in);
            System.out.println("Do you have another student sale to enter? (1 = yes, 0 = no)?");
            String next_student = (myObj5.nextLine());
            if (next_student.equalsIgnoreCase("0")) {
                break;
            }
            //is this function gonna get fucked since i am inputting a zero (integer) or does the terminal automatically interperate everything as a string?
            //turns out that it doesnt get fucked

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


//if i make 3 arrays and put all individual types of data in each array (ex. one for student id's another for their card type, etc.)
//i could index and get the information of an individual student by just using a specific indexing value with the "get" function
//this however would be a bad solution because it would be so easy to fuck up all the data. Because the indexing of all the data is defined off of one element
//if that element is removed without the corrosponding data in the other arrays getting removed, youve instantly fucked all the data
//imagine doing this but you need to keep track of thousands or even millions of elements in an array. the solution is not scalable at all
//maybe only good for a couple elements and some that barely change or are removed

        //Breaking the loop when the user inputs a '0' //why didnt this work out?
//            System.out.println("Do you have another student sale to enter? (1 = Yes, 0 = No)?");
//            if (id == 0) {
//                break;
// i need to create a new variable each time the program goes thru the loop
//        int id = 0; //is there a better way to be using varibles that are no longer in scope? i feel like i shouldnt being having to partly re-define it over agian
//        String type = null;
//        int amount = 0;
//        System.out.println(id);
//        System.out.println(type);
//        System.out.println(amount);
//        HashMap<Integer, Integer> id_amount = new HashMap<Integer, Integer>();
//        HashMap<HashMap<Integer, Integer>, String> id_amount_type = new HashMap<>();
//        id_amount.put(id, amount);
//        id_amount_type.put(id_amount, type);
//        System.out.println(id_amount);
//        System.out.println(id_amount_type);
//        System.out.println("Student" + id + "raised the following amount for the school:" +);
//        System.out.println(id);
//        System.out.println(type);
//        System.out.println(amount);

        //MANIPULATING STUDENT INFO
        //Total number of S types
//        int total_s = 0;
//        for (int i = 0; i > 0; i++){
//            if ("S" == type_array.get(i)) {
//                total_s++;
//                System.out.println(type_array.get(i));
//                System.out.println(total_s);
//
////            } else {
////                System.out.println(total_s);
//
//            }
//        }

        int total_s = 0;
        if ("S" == type_array.get(0)) {
            total_s++;
            //System.out.println(type_array.get(0));
            //System.out.println(total_s);

        }
        //ArrayList<String> type_array = new ArrayList<String>();

        //System.out.println(type_array.get(0));
        System.out.println(type_array[0] = "S");
        //System.out.println(total_s);

        //the logic im trying to express is the following:
        //if "S" is equal to the first element in type_array --> add 1 to a variable that equals zero
        //i need the index number that is tested against "S" to be increasing after every checkign with the varible
//        int total_s = 0;
//        for (int i = type_array.size(); i>(-1); i++){
//            if
//
//        }
//i think what this does is not what i want. i dont want the counting to start from the number of elements in the array
//i just need it to count until its empty
        //iterate in the array. if there is S value then add 1 to a variable that initally equals zero

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
