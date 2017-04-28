/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author ryannieh
 */
public class SwitchOnString {
    String dayOfWeek;
    public String getTypeOfDayWithSwitchStatement() {
        String typeOfDay;
        switch (dayOfWeek) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
        }
        return typeOfDay;
    }
    
    public static void main(String[] args){
        SwitchOnString sos = new SwitchOnString();
        sos.dayOfWeek="Tuesday";
        String typeofday = sos.getTypeOfDayWithSwitchStatement();
        System.out.println(sos.dayOfWeek+" is "+ typeofday);
    }
}
