public class Programmersandmonitora {
    public static void main(String[] args) {
        drawisMonitorsCounter(12,5);
    }
    public static void drawisMonitorsCounter(int monitors, int programmers) {
        int remains = monitors % programmers;
        System.out.println(remains);
    }
}