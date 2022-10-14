package transport;
import transport.Automobile;

public class DriverCategoryB extends Driver<Automobile> {

    public DriverCategoryB(String fullName, String typeLicense, int workExperience, Automobile car) {
        super(fullName, typeLicense, workExperience, car);
    }
}