package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public class Magnoliophyta extends Plant {

    public Magnoliophyta(String name, Soil soil) {
        super(name, soil);
    }

    @Override
    public void illuminate(int amountofLight) {
        int amount = this.takeEnergyFromSoil(8);
        if (amount > 0) {
            this.editSize(amountofLight / 6.0);
        }
    }

    @Override
    public void irrigate(int amountofWater) {
        int amount = this.takeEnergyFromSoil(12);
        if (amount > 0) {
            this.editSize(amountofWater / 4.0);
        }
    }
}
