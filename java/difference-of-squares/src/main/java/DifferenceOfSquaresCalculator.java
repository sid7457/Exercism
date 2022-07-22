class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        //int squareOfSum = 0;
        return (int) ((Math.pow(input, 2)) * (Math.pow(input + 1, 2))) / 4;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += (i * i);
        }
        return sumOfSquares;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
