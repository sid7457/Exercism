/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class QueenAttackCalculator {

    private Queen whiteQueen;
    private Queen blackQueen;

    public QueenAttackCalculator(Queen whiteQueen, Queen blackQueen)   {
        if(whiteQueen == null || blackQueen == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if (whiteQueen.x == blackQueen.x && whiteQueen.y == blackQueen.y)
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        this.whiteQueen = whiteQueen;
        this.blackQueen = blackQueen;
    }

    public boolean canQueensAttackOneAnother() {

        if(((whiteQueen.x - whiteQueen.y) == (blackQueen.x- blackQueen.y) ) || ((whiteQueen.x+ whiteQueen.y) == (blackQueen.x+ blackQueen.y ))
                || whiteQueen.x == blackQueen.x || whiteQueen.y == blackQueen.y)
            return true;
        return false;
    }

}
