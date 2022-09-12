public class BMI {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        int h = 170;
        int m = 70;
        double index = servise.calculate(m, h);

        System.out.println(servise.calculate(77, 1.7)+ " индекс массы тела");

    }
}
