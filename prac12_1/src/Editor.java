/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Editor extends SkilledEmployee {
    private boolean prefersPaperEditing;
    
    public void setPrefersPaperEditing(boolean pref){
        prefersPaperEditing = pref;
    }
    
    public String getEditingPreference(){
        if(prefersPaperEditing){
            return "Paper";
        }
        else {
            return "Electronic";
        }
    }
     
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Editing preference: " + this.getEditingPreference());
    }
}
