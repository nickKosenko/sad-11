public class Main {
    public static void main(String[] args) {
        float myHeight = 1.86F;
        int myMass = 87;
        double bmi = myMass / (myHeight * myHeight);
        if (bmi > 25) {
            System.out.println("Youre Heavy");
        } else if (bmi < 25) {
            System.out.println("Youre Stick");
        }
        int a = 1;
        int b = 12;
        double solve = a % b;
        if (solve == 0) {
            System.out.println("Ваше число не парное");
        } else if (solve == 1) {
            System.out.println("Ваше число парное");
        }
        int h = 121;

        float j = 1.2F;

        double c = 1.2;

        short d = 1231;

        long e = 87748;

        double solve1 =  (h/j*(c/d));
        double solve2 =  (c*h/d*(h+j));
        double solve3 =  d+c*h-b;
        double solve4 = ((e+j-c/h));
        System.out.println(solve1);
        System.out.println(solve2);
        System.out.println(solve3);
        System.out.println(solve4);
    }
}