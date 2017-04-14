
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class VacationScaleTwo {
    public ArrayList vacationDays;
    public int yearsOfService;
    public void setVacationScale(){
        vacationDays = new ArrayList();
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }
    public void displayVacationDays(){
        for(int years=0; years<vacationDays.size(); years++){
            System.out.println("The vacation for " + years+" year of service is :"
            +vacationDays.get(years));
        }
        
    } 
}
