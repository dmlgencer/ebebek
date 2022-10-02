package com.company;

public class Employee{



    static String name = "Brad Pitt";
    static double salary = 10000;
    static int hireYear = 2000;
    static double workHours = 50;



    public static void main(String[] args) {

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("WorkHours: " + workHours);
        System.out.println("HireYear:" + hireYear);
        tax();
        bonus();
        raiseSalary();

    }


    //vergi
    public static void tax(){

        double tax = 0;
        if (salary>1000){
            tax = salary*(0.03);
        }
        salary= salary-tax;
        System.out.println("Tax: "+ tax);

    }

    
    public static void bonus(){
        int counter = 0;
        double bonus = 0;
        if (workHours>40){
            for (int i=41; i<=workHours; i++){
                counter++;
                bonus = counter*30;
                salary = salary + bonus;
            }

        }

        System.out.println("Bonus: "+ bonus);


    }

    public static void raiseSalary(){
        double raiseSalary = 0;

        if ((2021-hireYear)<10) {
            raiseSalary = salary*(0.05);
        }

        if ((2021-hireYear)>9 && (2021-hireYear)<20){
            raiseSalary = salary*(0.10);
        }

        if ((2021-hireYear)>19){
            raiseSalary = salary*(0.15);
        }
        salary += raiseSalary;

        System.out.println("RaiseSalary: " + raiseSalary);


    }




}