public class BmiService {
    public double calculate(int m, double h){
        double height = h * h;
        double index = m / height;
        return (double) index;
    }
}
