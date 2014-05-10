package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public class Soil {
    private int energy;

    public Soil(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
    
    public int takeEnergy(int amount){
        if(energy>amount)
        {
            energy-=amount;
            return energy-amount;
        }
        else
        {
            return 0;
        }
    }
}
