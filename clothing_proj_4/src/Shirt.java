
public class Shirt extends Clothing implements Returnable {

    // The fit codes are S=Small,M=Medium,L=Large, U=Unset
    private char fit = 'U';

    public Shirt(int itemID, String description, char colorCode, double price, char fit) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
    }

    // This method displays the values for an item
    @Override
    public void display() {

        System.out.println("Shirt ID: " + getItemID());
        System.out.println("Shirt description:" + getDescription());
        System.out.println("Color Code: " + getColorCode());
        System.out.println("Shirt price: " + getPrice());
        System.out.println("Fit: " + getFit());

    } // end of display method

    @Override
    public void setColorCode(char newCode) {

        switch (newCode) {
            case 'R':
            case 'G':
            case 'B':
                this.colorCode = newCode;
                break;
            default:
                System.out.println("Invalid colorCode. Use R, G, or B");
        }
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    @Override
    public String doReturn() {
        return "Suit returns must be within 3 days";
    }
} // end of class

