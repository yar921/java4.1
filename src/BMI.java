public class BMI {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        double index = servise.calculate(70, 1.72);

        System.out.println("Индекс массы тела: " + index);

    }
}
