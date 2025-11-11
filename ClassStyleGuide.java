//
// FRC Team 1816 coding conventions for the Java programming language
//

/**
 * An example class style guide for 1816 The Green Machine.
 */
public class ClassStyleGuide { // classes use UpperCamelCase

    public static final double THIS_IS_A_CONSTANT = 3.14; // constants use SCREAMING_SNAKE_CASE and are always public static final

    private double thisIsAField = 2.71828; // all fields are lowerCamelCase

    private final double thisIsAnotherField = 6.28; // fields that are not modified should be set to final

    // when accessing variables, use "get" and "set" as prefixes
    /**
     * Retrieves the team number for The Green Machine
     */
    public int getGreenMachineTeamNumber() { // method names are lowerCamelCase, and should describe exactly what the method does
        return 1816;
    }

    /**
     * Sets an example field variable.
     *
     * @param thisIsAField what to set the field
     */
    public void setExampleFieldVariable(double thisIsAField) { // method names are lowerCamelCase, and should describe exactly what the method does
        this.thisIsAField = thisIsAField;

        // System.out.println("Test 5");     << DO NOT DO THIS! Don't leave random print statements around!
    }

    private static int MODULOED_ONE = 3;
    private static int MODULOED_TWO = 5;

    /**
     * Does a FizzBuzz.
     *
     * @param upperBound maximum value to loop to
     */
    public void fizzBuzz(int upperBound) {
        for (int i = 0; i < upperBound; i++) {
            if (i % MODULOED_ONE == 0 && i % MODULOED_TWO == 0) { // brackets around every IF statement!
                System.out.println("FizzBuzz");
            } else if (i % MODULOED_ONE == 0) {
                System.out.println("Fizz");
            } else if (i % MODULOED_TWO == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public enum EVENT { // enums use SCREAMING_SNAKE_CASE
        SAMMAMISH,
        AUBURN,
        DISTRICT_CHAMPS,
        FIRST_CMP,
        INDIANA_ROBOTICS_INVITATIONAL,
        CHEZY_CHAMPS
    }

    // DO NOT DO THIS! Don't set up test cases inside the class!
    public static void main(String[] args) {

    }
}
