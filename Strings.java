// In this short tutorial, we are depicting Java Strings
// Some examples are given and how they apply in Java
package Java;

public class Strings {
    public static void main(String[] args){
        String earlyGreeting = "Good morning Sir";
        System.out.println(earlyGreeting);
        System.out.println(earlyGreeting.length()); // This statement, "length()" helps one know the length of the string
        // Hence, we can also say as below
        System.out.println("The greetings length is: " + earlyGreeting.length());


        // In Java, strings can also be subjected to specific methods
        // This include "toUpperCase()", "toLowerCase()" and "indexOf()"
        // Below is an example and how the output becomes
        // Consider the string below
        String myNews = "IN THE BEGINNING, THINGS WERE SOMEHOW CHALLENGING, BUT NOW, ITS ALL GOOD";     // Aim is to convert to lowercase
        String theirNews = "All in all, I have tried my best and our best in pushing the mantle forwards";   // Aim is to convert to uppercase
        String theSummary = "It is amazing, and THE POWER OF PERSISTENCE has really PAID Off";               // Aim is to find the index of some texts

        // We can then apply the methods as shown below
        System.out.println(myNews.toLowerCase());           // This will print the message into lower case
        System.out.println(theirNews.toUpperCase());        // This will transform the string and print it in upper case
        // indexOf() is used for finding a string's text position's first occurrence
        // In using theSummary string above, we can do the following
        // The goal is to find the index of "amazing" in the String
        System.out.println(theSummary.indexOf("amazing"));      // This will give the index of "amazing" as 6
        System.out.println(theSummary.indexOf("PAID"));      // This will give the index of "PAID" as 55
        // NOTE: In the above, if the string is specified as "Paid" and not "PAID" the ouput becomes -1
        // That is;
        System.out.println(theSummary.indexOf("Paid"));      // This will give the index of "Paid" as -1



        /// ---------------OUTPUTS----------------
        /*
            Good morning Sir
            16
            The greetings length is: 16
            in the beginning, things were somehow challenging, but now, its all good    
            ALL IN ALL, I HAVE TRIED MY BEST AND OUR BEST IN PUSHING THE MANTLE FORWARDS
            6
            55
            -1
        */

    }
    
}
