package transport;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "Имя и фамилия: '" + name + '\'' +
                ", компания: '" + company + '\'' +
                '}';
    }
}
