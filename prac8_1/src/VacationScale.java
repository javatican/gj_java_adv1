/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class VacationScale {
    public int[] vacationDays;
    public int yearsOfService;
    public void setVacationScale(){
        vacationDays = new int[7];
        vacationDays[0]=10;
        vacationDays[1]=15;
        vacationDays[2]=15;
        vacationDays[3]=15;
        vacationDays[4]=20;
        vacationDays[5]=20;
        vacationDays[6]=25; 
    }
    public void displayVacationDays(){
        if(yearsOfService>=6){
            System.out.println("Vacation days:"+vacationDays[6]);
        } else if(yearsOfService>=0){
            System.out.println("Vacation days:"+vacationDays[yearsOfService]);
        } else {
            System.out.println("Invalid years of service");
        }
    }
}
