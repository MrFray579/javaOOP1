public class HotDrink extends Botlle {
    private int temperature;

    public HotDrink(String name, Double cost, Double volume, Integer temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Integer getTempreture(){
        return this.temperature;
    }

    public void setTemperature(Integer temperature){
        this.temperature = temperature;
    }
    
}
