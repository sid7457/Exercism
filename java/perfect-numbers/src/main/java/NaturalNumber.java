import java.util.Scanner;

public class NaturalNumber {

    int input;
    NaturalNumber(int input) {
        if(input < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.input=input;
    }
    public Classification getClassification() {
        if(input == 1)
            return Classification.DEFICIENT;
        int sum =1;
        for(int i=2;i<input/2+1;i++)
        {
            if(input%i==0)
                sum+=i;
        }
        if(sum==input)
            return Classification.PERFECT;
        else if(sum>input)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }
}
