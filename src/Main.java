public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle.Bulider()
                .id(1)
                .brand("Golf")
                .registration("LRAV652")
                .vMax(160)
                .airbags(2)
                .wheels(4)
                .build();

        System.out.println(vehicle.getId());
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getRegistration());
        System.out.println(vehicle.getvMax());
        System.out.println(vehicle.getAirbags());
        System.out.println(vehicle.getWheels());
    }
}
