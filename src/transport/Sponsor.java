package transport;

import java.util.Objects;

public class Sponsor {
    private String nameOfSponsor;
    private double amountOfSponsor;
    private TypeOfSponsor typeOfSponsor;

    public enum TypeOfSponsor{
        INDIVIDUAL_PERSON("физическое лицо"),
        CORPORATE_PERSON("юридическое лицо");
        private final String type;

        TypeOfSponsor(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public Sponsor(String nameOfSponsor, double amountOfSponsor, TypeOfSponsor typeOfSponsor) {
        this.nameOfSponsor = nameOfSponsor;
        this.amountOfSponsor = amountOfSponsor;
        this.typeOfSponsor = typeOfSponsor;
    }

    public String getNameOfSponsor() {
        return nameOfSponsor;
    }

    public TypeOfSponsor getTypeOfSponsor() {
        return typeOfSponsor;
    }

    public double getAmountOfSponsor() {
        return amountOfSponsor;
    }

    public void setAmountOfSponsor(double amountOfSponsor) {
        this.amountOfSponsor = amountOfSponsor;
    }

    public void sponsorTheRace(Car car){
        System.out.println("Спонсор " + nameOfSponsor + " предоставляет машине:" + car.getBrand()+
                car.getModel() + " сумму = " + amountOfSponsor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.amountOfSponsor, amountOfSponsor) == 0 &&
                nameOfSponsor.equals(sponsor.nameOfSponsor) && typeOfSponsor == sponsor.typeOfSponsor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSponsor, amountOfSponsor, typeOfSponsor);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "Имя: '" + nameOfSponsor + '\'' +
                ", сумма спонсирования: " + amountOfSponsor +
                ", тип спонсора: " + typeOfSponsor +
                '}';
    }
}
