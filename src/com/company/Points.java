package com.company;

/**
 * Created by Will YE on 8/21/2017.
 */
public class Points { //This class controls the answers of the user
    public Points()
    {
       pointCount=0; //sets the number of points to 0
    }

    public static void add2Point(){
            pointCount+=2; //adds the number of points by 2
    }
    public static void add1Point() { //adds the number of points by 1
        pointCount += 1;
    }

    public static int pointValue(){ //returns the number of points at the end of the quiz
        System.out.println("You scored "+pointCount+" points");
        return pointCount;
    }

    public static boolean analyzeTorF(String ans){ //this analyzes the answer to each question
        while(!ans.equalsIgnoreCase("true") && !ans.equalsIgnoreCase("false")){ //if input is not "true" or "false", it allows input again
            System.out.println("Try again");
            return false;
        }
        if(ans.equalsIgnoreCase("true")){ //if input is "true", then add points to score
            add2Point();
            return true;
        }
        if(ans.equalsIgnoreCase("false")) //if input is "false", then do nothing and return
            return true;

        return false;

    }
    public static boolean analyzeMulChoice(String ans){ //analyzes multiple choice questions
        char letter;
        if(ans.length()>1) { //lets user retry if the input is not a character
            System.out.println("Try again");
            return false;
        }

        if(ans.length()==1){ //if the input is a character, proceed to see if it is a, b, c, or d
            letter=ans.toLowerCase().charAt(0); //sets the letter to lowercase so case sensitivity is solved
            boolean isValid = (letter=='a' || letter=='b' || letter=='c' || letter=='d');
            while(!isValid){ //if the character is not either a, b, c, or d, it lets user try again
                System.out.println("Try again");
                return false;
            }
            if(letter=='a' || letter=='b'){ //if the letter is a or b, then 2 points are added
                add2Point();
                return true;
            }
            if(letter=='c' || letter=='d'){ //if the letter is c or d, then 1 point is added
                add1Point();
                return true;
            }
        }

        else {
            System.out.println("Try again"); //if anything else occurs it allows the user to input again
            return false;
        }
        return false;
    }
    public static boolean analyzeShortAns(String ans){ //this analyzes the short answer
        int length = ans.length();

        if(length%2 == 0){ //if the length of the string is even, then 2 points are added
            add2Point();
            return true;
        }

        if(length%2 == 1){ //if the length of the string is odd, then 1 point is added
            add1Point();
            return true;
        }

        else { //if anything else occurs, the user can input again
            System.out.println("Try again");
            return false;
        }
    }

    public static int pointCount; //sets public variable for number of points
}
