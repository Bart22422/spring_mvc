package web.model;

public class Car {
    private String brand;
    private String model;
    private int engineCapacity;

    public Car() {
    }

    public Car(String brand, String model, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
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
