package web.model;

public class Car {
    private static long count ;
    private long id;
    private String brand;
    private String model;
    private int engineCapacity;

    public Car() {
        count++;
        id = count;
    }

    public Car(String brand, String model, int engineCapacity) {
        count++;
        id = count;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }
    public long getId() {
        return id;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setEngineCapacity(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }
    public int getEngineCapacity (){
        return engineCapacity;
    }
}
