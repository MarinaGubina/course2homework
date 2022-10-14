package transport;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean summerTyres;
    public Car(String brand, String model, double engineVolume) {
        if(isNullOrEmpty(brand)){
            this.brand = "default";}
        else{
            this.brand = brand;
        }
        if(isNullOrEmpty(model)){
            this.model = "default";}
        else{
            this.model = model;
        }
        if(engineVolume <= 0){
            this.engineVolume = 1.6;}
        else{
            this.engineVolume = engineVolume;}
        this.summerTyres = true;
    }

    public abstract boolean doDiagnostics();
    public abstract void printType();

    public abstract void startMovement();
    public abstract void finishMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume > 0 ){
            this.engineVolume = engineVolume;}
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }
    public void changeTyres(){
        summerTyres = !summerTyres;
    }
    @Override
    public String toString() {
        return  "Марка ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", объем двигателя =" + engineVolume +
                " тип резины: " + (summerTyres? "летняя":"зимняя");
    }
}