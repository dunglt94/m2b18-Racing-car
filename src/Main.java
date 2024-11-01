public class Main {
    public static int DISTANCE = 200;
    public static int STEP = DISTANCE / 50;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: " + DISTANCE + " KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
