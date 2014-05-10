package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public class Test {
    public static void main(String[] args) {
        Plantation plantation = Plantation.PLANTATION;
        Fern pteridiumAquilinum = new Fern("Pteridium aquilinum"),
                aspleniumScolopendrium = new Fern("Asplenium scolopendrium");
        plantation.plant(pteridiumAquilinum);
        plantation.plant(aspleniumScolopendrium);

        final int amountOfLight = 10;
        plantation.illuminateAll(amountOfLight);

        double pa_height = pteridiumAquilinum.getHeight();
        double as_height = aspleniumScolopendrium.getHeight();

        pteridiumAquilinum.setSoil(new Soil(20));
        aspleniumScolopendrium.setSoil(new Soil(30));

        Pine pinusSylvestris = new Pine("Pinus sylvestris", new Soil(300));
        Magnoliophyta fraxinusPennsylvanica = new Magnoliophyta("Fraxinus pennsylvanica", new Soil(300));
        plantation.plant(pinusSylvestris);
        plantation.plant(fraxinusPennsylvanica);

        plantation.illuminateAll(amountOfLight);
        final int amountOfWater = 50;
        plantation.irrigateAll(amountOfWater);

        pa_height = pteridiumAquilinum.getHeight();
        as_height = aspleniumScolopendrium.getHeight();
        double ps_height = pinusSylvestris.getHeight();
        double fp_height = fraxinusPennsylvanica.getHeight();
        for (int i = 0; i < 15; i++) {
            plantation.illuminateAll(15);
            plantation.irrigateAll(15);
        }

        Plant highestPlant = plantation.getHighestPlant();
    }
}
