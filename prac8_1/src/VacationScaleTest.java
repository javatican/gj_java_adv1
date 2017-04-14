/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class VacationScaleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VacationScale vs = new VacationScale();
        vs.setVacationScale();
        vs.yearsOfService=3;
        vs.displayVacationDays();
        vs.yearsOfService=4;
        vs.displayVacationDays();
        vs.yearsOfService=10;
        vs.displayVacationDays();
    }
    
}
