public class Area {
        public static void main(String[] args) {
            calcCircleRadius(115);
        }
        public static double calcCircleRadius(double area) {
            double radius = area / (2 + java.lang.Math.PI);
            System.out.printf("%.3f" , radius);
            return radius;

        }
    }
