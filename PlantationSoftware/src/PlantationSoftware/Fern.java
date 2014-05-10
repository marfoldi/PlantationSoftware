package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public class Fern extends Plant{

    public Fern(String name) {
        super(name);
    }
    
    @Override
    public void illuminate(int amountofLight)
    {
        this.editSize(amountofLight/24.0);
    }
    
    @Override
    public void irrigate(int amountofWater)
    {
        this.editSize(amountofWater/30.0);
    }
}
