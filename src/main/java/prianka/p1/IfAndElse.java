package main.java.prianka.p1;

public class IfAndElse {
    public static <Int> void main(String[] args) {
        System.out.print("Item 1 : ");

        int x = 10;
        int y = 18;
        if (x > y) {
            System.out.println("x > y");
        } else {
            System.out.println("x < y");
        }


        System.out.print("Item 2 : ");
        int time = 21;
        if (time < 12) {
            System.out.println("Good Morning!");
        }
        if (time >= 12 && time <= 18) {
            System.out.println("Good Afternoon");
        } else System.out.println("Good Evening");

        System.out.print("Item 3 : ");
        int Age = 19;
        if (Age >= 18) {
            System.out.println("Person is ADULT");
        } else {
            System.out.println("Person is Minor");
        }

        System.out.print("Item 4 : ");
        // Check if no. is EVEN or ODD
        int num = 19;
        if (num % 2 == 0) {
            System.out.println("This number is EVEN");
        } else {
            System.out.println("This number is ODD");
        }

        System.out.print("Item 5 : ");
        int year = 1700;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("This year is a LEAP YEAR");
        } else {
            System.out.println("This is a NON LEAP YEAR");
        }

        System.out.print("Item 6 : ");
        //Making Results of students
        int english = 75;
        int hindi = 84;
        int maths = 95;
        int social = 88;
        int science = 92;
        int total = 500;
        int percentage = ((int)((english + hindi + maths + science + social) / 500) * 100);
        if (percentage >= 90) {
            System.out.println("Grade A+");
        } else if ((percentage >= 80) && (percentage < 90)) {
            System.out.println("Grade A");
        } else if ((percentage >= 60) && (percentage < 80)) {
            System.out.println("Grade B");
        } else if ((percentage >= 30) && (percentage < 60)) {
            System.out.println("Grade C");
        } else if ((percentage >= 0) && (percentage < 30)) {
            System.out.println("Fail");
        } else {
            System.out.println("data is invalid");
        }

        System.out.print("Item 7 : ");
        //Blood Donation Eligibility Check
        int age = 15;
        int weight = 40;
        if (age >= 18)
        {
            if (weight >= 45)
            System.out.println("Congratulations! You are eligible to donate blood");
            else
            System.out.println("You are underweight");
        }
        else
        System.out.println("Sorry, You are not eligible to donate blood");



        System.out.print("Item 8 : ");
        //Find Greatest number among 5 given numbers
        int q = 780;
        int w = 855;
        int e = 933;
        int r = 1005;
        int t = 523;
        if ((q>w) && (q>e) && (q>r) && (q>t)) {
            System.out.println("Q is the greatest number");}
        else if ((w>q) && (w>e) && (w>r) && (w>t)) {
            System.out.println("W is the greatest number");}
        else if ((e>q) && (e>w) && (e>r) && (e>t)) {
            System.out.println("E is the greatest number");}
        else if ((r>q) && (r>w) && (r>e) && (r>t)) {
            System.out.println("R is the greatest number");}
        else if ((t>q) && (t>w) && (t>e) && (t>r)) {
            System.out.println("T is the greatest number");}
    }
}