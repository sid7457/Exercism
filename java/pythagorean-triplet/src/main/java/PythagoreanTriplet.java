/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.security.cert.CertPathBuilder;
import java.util.*;

public class PythagoreanTriplet {
    private int a, b, c, number, sum;

    public PythagoreanTriplet() {
    }

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int i) {
        this.number = i;
        return this;
    }

    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> result = new ArrayList<>();
//        for (int i = 1; i < sum; i++) {
//            for (int j = 1; j < i; j++) {
//                for (int k = 1; k < j; k++) {
//                    if ((i * i == (j * j + k * k)) && (i + j + k) == sum) {
//                        result.add(new PythagoreanTriplet(k,j,i));
//                    }
//                }
//            }
//
//        }
        //for(int i=1;i<sum;i++){
            for(int a=1;a<sum;a++){
                int sumTo=sum-a;
                int b=a+1;
                int c=sum;
                while(b<c){
                    if(sumTo==b+c){
                        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                            result.add(new PythagoreanTriplet(a,b,c));
                        }
                        b++;
                        c--;
                    }
                    else if(sumTo<b+c){
                        c--;
                    }
                    else
                        b++;
                }
            }
       // }


        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a &&
                b == that.b &&
                c == that.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}