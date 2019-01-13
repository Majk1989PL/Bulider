public class Vehicle {

    private Integer id;
    private String brand;
    private Integer wheels;
    private Integer airbags;
    private Integer vMax;
    private String registration;

    public static class Bulider {

        private Integer id = null;
        private String brand = null;
        private Integer wheels = null;
        private Integer airbags = null;
        private Integer vMax = null;
        private String registration = null;

        public Bulider id(Integer id){
            this.id = id;
            return this;
        }

        public Bulider brand(String brand){
            this.brand = brand;
            return this;
        }

        public Bulider wheels(Integer wheels){
            this.wheels = wheels;
            return this;
        }

        public Bulider airbags(Integer airbags){
            this.airbags = airbags;
            return this;
        }

        public Bulider vMax(Integer vMax){
            this.vMax = vMax;
            return this;
        }

        public Bulider registration(String registration){
            this.registration = registration;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    private Vehicle(Bulider bulider){
        this.id = bulider.id;
        this.brand = bulider.brand;
        this.wheels = bulider.wheels;
        this.airbags = bulider.airbags;
        this.vMax = bulider.vMax;
        this.registration = bulider.registration;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Integer getAirbags() {
        return airbags;
    }

    public Integer getvMax() {
        return vMax;
    }

    public String getRegistration() {
        return registration;
    }
}
