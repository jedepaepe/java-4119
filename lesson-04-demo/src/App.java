public class App {
    public static void main(String[] args) {
        Car car1 = new Car();
        showCar(car1);
        car1.fuels = new String[] { "benzine", "electric" };
        car1.nrDoors = 5;
        car1.powerKw = 110;
        car1.color = new RGBColor();
        car1.color.red = 255;
        showCar(car1);
    }

    private static void showCar(Car car) {
        System.out.println(car.nrDoors);
        System.out.println(car.powerKw);
        if (car.fuels != null) {
            for (String fuel : car.fuels) {
                System.out.println(fuel);
            }
        }
        if (car.color != null) {
            System.out.println(car.color.red);
            System.out.println(car.color.green);
            System.out.println(car.color.blue);
        }
        System.out.println();
    }
}
