void main() {


    CarWithLombok car1 = new CarWithLombok(
            "GLE", "Mercedes", 2020, 350000, "white", 5
    );

    CarWithLombok car2 = new CarWithLombok(
            "GLC", "Mercedes", 2023, 200000, "silver", 3
    );

    IO.println(car1);
    IO.println(car2);

    IO.println(car1.getColor());


    car1.setColor("black");

    IO.println("Are these objects equal? "
            + car1.equals(car2));

    IO.println("HashCode 1: " + car1.hashCode());
    IO.println("HashCode 2: " + car2.hashCode());
}