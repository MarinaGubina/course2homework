import transport.*;

public class Main {
    public static void main(String[] args) {

        Automobile car1 = new Automobile("Lada","Grande",1.7, Automobile.TypeOfAutomobile.COUPE);
        Automobile car2 = new Automobile("Hyundai","Avante",1.6, Automobile.TypeOfAutomobile.SEDAN);
        Automobile car3 = new Automobile("BMW","Z8",3.0, Automobile.TypeOfAutomobile.UNIVERSAL);
        Automobile car4 = new Automobile("Kia","Sportage 4 поколение",2.4, Automobile.TypeOfAutomobile.SEDAN);

        //car2.changeTyres();

//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4 + "\n");

        Bus bus1 = new Bus("KIA","F-32", 2.4, Bus.CapacityBus.AVERAGE);
        Bus bus2 = new Bus("MAN","Lions's City", 3.2, Bus.CapacityBus.SMALL);
        Bus bus3 = new Bus("МАЗ","241", 2.6, Bus.CapacityBus.AVERAGE);
        Bus bus4 = new Bus("Hyundai","Country",2.9, Bus.CapacityBus.LARGE);

        bus3.changeTyres();

//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4 + "\n");

        Truck truck1 = new Truck("МАЗ","4317", 6.3, Truck.CapacityTruck.N1);
        Truck truck2 = new Truck("Hyundai","HD42", 5.2, Truck.CapacityTruck.N3);
        Truck truck3 = new Truck("MAN","TGL", 4.2, Truck.CapacityTruck.N2);
        Truck truck4 = new Truck("Ford","Transit", 6.4, Truck.CapacityTruck.N1);

        //truck2.changeTyres();

//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4 + "\n");

        //DriverCategoryB alex = new DriverCategoryB("Алексей","B",1,car3);
        //DriverCategoryC sergey = new DriverCategoryC("Сергей","",5,bus1);
        //DriverCategoryD pavel = new DriverCategoryD("Павел","D",10,truck2);

//        printInfo(alex);
//        //printInfo(sergey);
//        printInfo(pavel);
//        System.out.println();

        /*Car[] cars = new Car[]{car1,car2,car3,car4,bus1,bus2,bus3,bus4,truck1,truck2,truck3,truck4};
        for(int i = 0; i <cars.length; i++){
            cars[i].doDiagnostics();
        }*/

        Sponsor s1 = new Sponsor("Hot wheels",1700, Sponsor.TypeOfSponsor.CORPORATE_PERSON);
        Sponsor s2 = new Sponsor("X",800, Sponsor.TypeOfSponsor.INDIVIDUAL_PERSON);
        Sponsor s3 = new Sponsor("Лукойл",2000, Sponsor.TypeOfSponsor.CORPORATE_PERSON);

        Mechanic mechanic1 = new Mechanic<>("Михаил Михайлов","Компания 1");
        Mechanic mechanic2 = new Mechanic<>("Петр Петров","Компания 2");
        Mechanic mechanic3 = new Mechanic<>("Катя Котова","Компания 3");

        DriverCategoryB alex = new DriverCategoryB("Алексей","B",1,car3);
        DriverCategoryD pavel = new DriverCategoryD("Павел","D",10,truck2);

        truck2.addDriver(pavel);
        truck2.addMechanic(mechanic1);
        truck2.addMechanic(mechanic3);
        truck2.addSponsor(s1);
        truck2.addSponsor(s2);
        truck2.addSponsor(s3);

        car3.addDriver(alex);
        car3.addMechanic(mechanic2);
        car3.addMechanic(mechanic2);
        car3.addSponsor(s1);
        car3.addSponsor(s2);
        car3.addSponsor(s2);

        //printInfoCar(truck2);
        printInfoCar(car3);

       /* System.out.println("ДЗ - 2. Задание 1 \n");*/
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAuto(car3);
        /*serviceStation.addTruck(truck2);
        serviceStation.addAuto(car1);

        serviceStation.service();*/

    }

    public static void printInfoCar(Car car){
        System.out.println(car + ", управляется водителем " + car.getDrivers()+
                ", спонсоры -  " + car.getSponsors() +
                ", механики - " + car.getMechanics());

    }
    public static void printInfo(Driver driver){
        System.out.println("водитель " + driver.toString()+
                " управляет автомобилем " + driver.getCar().toString() +
                " и будет участвовать в заезде");
        driver.getCar().printType();
    }
}