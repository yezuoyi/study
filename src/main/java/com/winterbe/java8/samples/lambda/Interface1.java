package com.winterbe.java8.samples.lambda;

/**
 * @author Benjamin Winterberg
 */
public class Interface1 {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula1 = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double d1=formula1.calculate(100);     // 100.0
        double d2=formula1.sqrt(-23);          // 0.0
        double d3=Formula.positive(-4);        // 0.0
        System.out.println(d1+"-"+d2+"-"+d3);
        

//        Formula formula2 = (a) -> sqrt( a * 100);
    }

}