package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public class Pine extends Plant{

    public Pine(String name, Soil soil) {
        super(name, soil);
    }
    
    @Override
    public void illuminate(int amountofLight)
    {
        int amount = this.takeEnergyFromSoil(10);
        if(amount>0)
        {
            this.editSize(amountofLight/3.0);
        }
    }
    
    @Override
    public void irrigate(int amountofWater)
    {
        int amount = this.takeEnergyFromSoil(5);
        if(amount>0)
        {
            this.editSize(amountofWater/7.0);
        }
    }
}
