import java.util.Scanner;

public class fractions{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float numerator1f;
        float denominator1f;
        int numerator1;
        int denominator1;
        int numerator2;
        int denominator2;
        int grade;
        float fraction1;
        int divisionNumerator;
        int divisionDenominator;
        int multiplyNumerator;
        int additionNumerator;
        int multiplyDenominator;
        int subtractNumerator;
        int mixWhole;
        float mixNum;

        System.out.println("Enter fraction 1");
        numerator1f = scan.nextFloat();
        denominator1f = scan.nextFloat();

        System.out.println("Enter Fraction 2");
        numerator2 = scan.nextInt();
        denominator2 = scan.nextInt();

        System.out.printf("Fraction number 1:  %.0f/%.0f\n", numerator1f, denominator1f);
        System.out.printf("Fraction number 2: %d/%d\n",numerator2,denominator2);

        numerator1 = (int) numerator1f;
        denominator1 = (int) numerator1f;

        fraction1 = numerator1f/denominator1f;

        divisionNumerator = numerator1*denominator1;

        divisionDenominator = denominator1 * denominator2;

        multiplyNumerator = numerator1 * numerator2;

        additionNumerator = numerator1 * denominator2 + numerator2 * denominator1;

        multiplyDenominator = denominator1 * denominator2;

        subtractNumerator = numerator1 * denominator2 - numerator2 * denominator1;

        mixNum = numerator1 % denominator1;

        mixWhole = numerator1 / denominator2;

        System.out.printf("Addition of fractions: %d/%d\n", additionNumerator,multiplyDenominator);
        System.out.printf("Subtractiion of fractions: %d/%d\n", subtractNumerator,multiplyDenominator);
        System.out.printf("Multiplication of fractions: %d/%d\n", multiplyNumerator,multiplyDenominator);
        System.out.printf("Division of fractions: %d/%d\n", divisionNumerator,divisionDenominator);

        if(numerator1>denominator1){
            System.out.println("Fraction 1 is an improper Fraction");

            if(mixNum==0){
                System.out.printf("Fraction 1 as a mixed number: %d\n",mixWhole);
            }else{
                System.out.printf("Fraction 1 as a mixed number: %d %.0f/%d\n", mixWhole, mixNum, denominator1);
            }
        }else{
            System.out.println("Fraction 1 is not an improper Fraction");
        }
        
        System.out.printf("Decimal approximation of fraction 1: %.2f\n",fraction1);

        System.out.print("Enter in a gpa for the class (0-4 integer): ");
        grade = scan .nextInt();

        if (grade==4){
            System.out.println("You got an A");
        }
        else if(grade==3){
            System.out.println("You got a B");
        }
        else if(grade==2){
            System.out.println("You got a c");
        }
        else if(grade==1){
            System.out.println("You got a D");
        }
        else if(grade==0){
            System.out.println("You got a F");
        }
        else{
            System.out.println("That isn't a valid grade");
        }
    scan.close();
    }
}
