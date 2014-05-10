package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public interface Plantation {
    
    public final Plantation PLANTATION = new DefaultPlantation();
    
    public void plant(Plant plant);
    public void illuminateAll(int amountofLight);
    public void irrigateAll(int amountofWater);
    public Plant getHighestPlant();    
}
