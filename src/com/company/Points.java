package com.company;

/**
 * Created by Will YE on 8/21/2017.
 */
public class Points { //This class controls the answers of the user
    public Points()
    {
       pointCount=0; //sets the number of points to 0
    }

    public static void addPoint(){
            pointCount+=2; //adds the number of points by 2
    }

    public static int pointValue(){ //returns the number of points at the end of the quiz
        System.out.println("You scored "+pointCount+" points");
        return pointCount;
    }

    public static boolean analyze(String ans){ //this analyzes the answer to each question
        while(!ans.equalsIgnoreCase("true") && !ans.equalsIgnoreCase("false")){ //if input is not "true" or "false", return false
            return false;
        }
        if(ans.equalsIgnoreCase("true")){ //if input is "true", then add points to score
            addPoint();
            return true;
        }
        if(ans.equalsIgnoreCase("false")) //if input is "false", then do nothing and return
            return true;

        return false;

    }

    public static int pointCount; //sets public variable for number of points
}
