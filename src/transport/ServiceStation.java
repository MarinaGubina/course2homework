package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Car> queue = new LinkedList<>();

    private void add(Car car){
        queue.offer(car);
    }

    public void addAuto(Automobile automobile){
        add(automobile);
    }

    public void addTruck(Truck truck){
        add(truck);
    }

    public void service(){
        while (!queue.isEmpty()){
            Car car = queue.poll();
            car.repairCar();
            System.out.println("Машина " + car.getBrand()+" "+ car.getModel() + " прошла техобслуживание.");
        }
            System.out.println("В очереди больше нет машин.");
    }
}
