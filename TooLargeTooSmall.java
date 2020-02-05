
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
        Integer result = 0;

    if (chosenNum < g){
      //This is when the guessed number is bigger than the chosen number
      result = 1;
    }
    else if (chosenNum > g){
      //This is when the guessed number is smaller than the chosen number
      result = -1;
    }
    else {
      //If other two fail, then chosent number should be equal to guessed number
      result = 0;
    }
        return result;

    }
}
