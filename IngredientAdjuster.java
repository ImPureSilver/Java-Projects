import javax.swing.*;

public class IngredientAdjuster {
    public static void main(String... args) {
        //create the formula for the program to keep track of the ingredients
        double daCookies = 48.0, WATER = 1.5d, BUTTER = 1.0d, FLOUR = 2.75d;

        // Creating the dialog boxes for getting the input from a user
        String cookieAmount = JOptionPane.showInputDialog("How many cookies would you like?");
        double cookieAmountDouble = Double.parseDouble(cookieAmount);

        if (cookieAmountDouble >= daCookies) {
            JOptionPane.showMessageDialog(null, "You cannot have more than 48 cookies. Please use numbers instead!!!");
            System.exit(0);
        } else {
            //The last box that outputs the amount of cookies
            JOptionPane.showMessageDialog(null, "To make " + cookieAmountDouble + " cookies." +
                    "\nWater: " + WATER * cookieAmountDouble + " cups" +
                    "\nButter: " + BUTTER * cookieAmountDouble + " cups" +
                    "\nFlour: " + FLOUR * cookieAmountDouble + " cups");
        }
    }
}
