package transport;

public class Mechanic <T extends Car> {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean doService(T car){
        return car.doService();
    }

    public void repairCar(T car){
        car.repairCar();
        System.out.println("Механик " + name + " починил машину: " + super.getClass()
                + car.getBrand() + car.getModel());
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "Имя и фамилия: '" + name + '\'' +
                ", компания: '" + company + '\'' +
                '}';
    }
}
