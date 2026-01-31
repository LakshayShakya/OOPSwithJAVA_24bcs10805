public class experiment2 {
    experiment2(int w, int h) {
        System.out.println("area of rectangle" + w * h);
    }

    experiment2(double r) {
        System.out.println("area of circle" + 3.14 * r * r);
    }

    public static void main(String[] args) {
        experiment2 A = new experiment2(4, 5);
        experiment2 B = new experiment2(2.5);
    }
}
