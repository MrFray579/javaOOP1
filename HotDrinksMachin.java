import java.util.List;

public class HotDrinksMachin extends BotlleMachine{
    public HotDrinksMachin(List<Product> hotDrinksList){
        super(hotDrinksList);
    }

    public Product  getProduct(String name, Double volume, Integer temperature){
        for (Product item: productsList){
            if (name.equals(item.getName()) & volume.equals(((Botlle) item).getVolume()) & temperature.equals(((HotDrink) item).getTempreture())){
                return item;
            }
        }
        throw new IllegalStateException("Not found Hot Drink " + name );
    }
}
