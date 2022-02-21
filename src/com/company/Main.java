package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Mad Libs
        //Create a new project named MadLibs
        //Create a new repo in Github named MadLibs
        //In InteliJ create a new project named MadLibs
        //In Terminal navigate to your MadLibs project location
        //In terminal, use git init
        //Copy the Github SSH key for your new Github repo
        //In Terminal Setup the git remote named origin by using the Github SSH key you copied earlier
        //Stage and commit the init changes to your local repo
        //Push changes to Github
        //Create 3 size 5 arrays
        //One array should have 5 single word strings, each of which is a noun.
        //One array should have 5 single word strings, each of which is an adjective.
        //One array should have 5 single word strings, each of which is a verb.
        //The Java Util class Random has a nextInt() method that can be used to get a random number from the
        // range of zero to the number passed in as a parameter.
        //Write a small story that randomly gets words from each array to fill in blank points in the story
        // based on the word type.
        //Don’t forget to stage and commit changes in git as you go along
        //Bonus: Get the words to fill each array by asking the user to supply them.

        //Array random info below
        // String[] fruits = { "apples", "oranges", "bananas" }; // Array literal syntax
        // int[] accountNumbers = new int[10]; // Array declaration syntax:


//        String[] nouns = {"woman" , "home", "dog", "chair", "water bottle"};
//        String[] adjectives = {"blue" , "tall", "round", "tiny", "short"};
//        String[] verbs = {"think" , "fly", "drive", "swim", "walk"};
//
//
//        Random myNumberGenerator = new Random();
//        System.out.println("Random number test : " + myNumberGenerator.nextInt(4));
//
//        //String Story
//
//        System.out.println ( "One day a " + nouns[myNumberGenerator.nextInt(5)] + " came across a " +
//                adjectives[myNumberGenerator.nextInt(5)] + " " + nouns[myNumberGenerator.nextInt(5)]
//                + "." + " The " + nouns[myNumberGenerator.nextInt(5)] + " could " +
//                verbs[myNumberGenerator.nextInt(5)] + " all the way back to the " +
//                nouns[myNumberGenerator.nextInt(5)] + ".");

        List randomNouns = new ArrayList();
        randomNouns.add ("woman");
        randomNouns.add ("home");
        randomNouns.add ("dog");
        randomNouns.add ("chair");
        randomNouns.add ("water bottle");

        List randomAdjectives = new ArrayList();
        randomAdjectives.add ("blue");
        randomAdjectives.add ("tall");
        randomAdjectives.add ("round");
        randomAdjectives.add ("tiny");
        randomAdjectives.add ("short");


        List randomVerbs = new ArrayList();
        randomVerbs.add ("think");
        randomVerbs.add ("fly");
        randomVerbs.add ("drive");
        randomVerbs.add ("swim");
        randomVerbs.add ("walk");


        Random myNumberGenerator = new Random();

        System.out.println ("One day a " + randomNouns.get(myNumberGenerator.nextInt(5)) + " came across a " +
                randomAdjectives.get(myNumberGenerator.nextInt(5)) + " " +
                randomNouns.get(myNumberGenerator.nextInt(5)) + "." +
                " The " + randomNouns.get(myNumberGenerator.nextInt(5)) + " could " +
                randomVerbs.get(myNumberGenerator.nextInt(5)) + " all the way back to the " +
                randomNouns.get(myNumberGenerator.nextInt(5)) + ".");


        }







    }

