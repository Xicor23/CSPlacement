package com.company;
import java.util.*;

//This is made by William Ye on 8/21/2017 starting 11:18 AM
//This project is made as an application for placement in a Computer Science Class at Ursinus
//The project is to make a quiz where the user will answer questions and get a result at the end of the quiz


public class Main {

    public static void main(String[] args) {
        System.out.print("Hello, Which of the Four Horsemen Would You Be? Press 1 to start, press 2 to exit "); //prints the opening statement of the quiz
        Scanner opening = new Scanner(System.in); // makes the Scanner
        String ans1 = opening.next();             // for answer input

        while (!ans1.equals("1") && !ans1.equals("2")) {         //makes sure the answer is either 1 or 2, otherwise retry
            System.out.print("Please enter a valid answer ");
            ans1=opening.next();
        }

        if (ans1.equals("2")) { //exits program is answer is 2

        }

        if (ans1.equals("1")) { //starts quiz
            String answers;
            Scanner sc = new Scanner(System.in);
            System.out.println("Let's start");
            Points quiz = new Points();

            System.out.println("Type true or false"); //directions for the quiz
            System.out.print("1. You want to serve in the military when you grow up "); //question 1
            answers = sc.next();
            while (quiz.analyze(answers) == false) { //goes to analyze answer and adds points if necessary
                answers = sc.next();
            }
            System.out.print("2. You  are afraid of seeing people die "); //question 2
            answers = sc.next();
            while (quiz.analyze(answers) == false) { //goes to analyze answer and adds points if necessary
                answers = sc.next();
            }
            System.out.print("3. You would fight instead of run during a fight "); //question 3
            answers = sc.next();
            while (quiz.analyze(answers) == false) {//goes to analyze answer and adds points if necessary
                answers = sc.next();
            }
            System.out.print("4. You get sick often "); //question 4
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("5. You get hungry a lot ");//question 5
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("6. You have experienced a lot of death around you ");//question 6
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("7. You tend to rage a lot ");//question 7
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("8. You would not be hesitant to kill if you had to ");//question 8
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("9. You have a good appetite ");//question 9
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            System.out.print("10. Overall you're not a really nice person ");//question 10
            answers = sc.next();
            while(quiz.analyze(answers)==false){//goes to analyze answer and adds points if necessary
                answers=sc.next();
            }
            int points = quiz.pointValue(); //gets the total amount of points and prints either of the results based on how many points total
            if(points>=0 && points<=4)
                System.out.println("You are Pestilence");
            if(points>=5 && points<=9)
                System.out.println("You are Famine");
            if(points>=10 && points<=15)
                System.out.println("You are Death");
            if(points>=16 && points<=20)
                System.out.println("You are War");


        }
    }
}
