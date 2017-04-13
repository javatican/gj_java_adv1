/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Person {

    public int ageYears = 1, ageDays;
    public long ageMinutes, ageSeconds, ageMilliseconds;

    public void calculateAge() {
        ageDays = ageYears * 365;
        ageSeconds = (long)ageDays * 24 * 60 * 60;
        ageMinutes = ageSeconds / 60;
        ageMilliseconds = ageSeconds * 1000;
        System.out.println("You are " + ageDays + " days old.");
        System.out.println("You are " + ageMinutes
                + " minutes old.");
        System.out.println("You are " + ageSeconds
                + " seconds old.");
        System.out.println("You are " + ageMilliseconds
                + " milliseconds old.");
    }
}
