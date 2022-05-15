import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Exercise number 1
        int[] Numbers = new int[3];
        Numbers[0] = 1;
        Numbers[1] = 2;
        Numbers[2] = 3;

        double[] FloatNumbers = {1.57, 7.654, 9.986};
        int[] EvenNumber = new int[5];
        EvenNumber[0] = 2;
        EvenNumber[1] = 4;
        EvenNumber[2] = 6;
        EvenNumber[3] = 8;
        EvenNumber[4] = 10;

        //Exercise number 2
        System.out.println(Numbers[0] + ", " + Numbers[1] + ", " + Numbers[2]);
        System.out.println(FloatNumbers[0] + ", " + FloatNumbers[1] + ", " + FloatNumbers[2]);
        System.out.println(EvenNumber[0] + ", " + EvenNumber[1] + ", " + EvenNumber[2] + ", " + EvenNumber[3] + ", " + EvenNumber[4]);

        //Exercise number 3
        System.out.println(Numbers[2] + ", " + Numbers[1] + ", " + Numbers[0]);
        System.out.println(FloatNumbers[2] + ", " + FloatNumbers[1] + ", " + FloatNumbers[0]);
        System.out.println(EvenNumber[4] + ", " + EvenNumber[3] + ", " + EvenNumber[2] + ", " + EvenNumber[1] + ", " + EvenNumber[0]);

        //Exercise number 4
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] % 2 == 1){
                Numbers[i] += 1;
            }
            System.out.print(Numbers[i] + " ");
        }
    }
}