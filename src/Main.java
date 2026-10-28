public class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok(
            "TT", "Audi", 2020, 230000, "grey", 3
        );

        CarWithLombok car2 = new CarWithLombok(
            "RS7", "Audi", 2026, 900000, "red", 2
        );

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());

        car1.setColor("black");
    }
}