package transport;
import transport.Truck;

public class DriverCategoryD extends Driver<Truck>{

    public DriverCategoryD(String fullName, String typeLicense, int workExperience, Truck car) {
        super(fullName, typeLicense, workExperience, car);
    }
}