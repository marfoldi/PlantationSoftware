package PlantationSoftware;

/**
 *
 * @author marfoldi
 */
public abstract class Plant implements Illuminable, Irrigable, Plantable{
    
    private String name;
    private double size;
    private Soil soil;
    private boolean dead;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, Soil soil) {
        this.name = name;
        this.soil = soil;
    }

    public void editSize(double size) {
        this.size += size;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getHeight(){
        return Math.sqrt(size);
    }
    
    public void setSoil(Soil soil){
        this.soil=soil;
    }
    
    public boolean isDead(){
        return dead;
    }
    
    public void die(){
        dead=true;
    }
    
    public int takeEnergyFromSoil(int amount)
    {
        int amount2 = soil.takeEnergy(amount);
	
        if ( amount2 == 0)
	{
            die();
        }
        return amount2;
    }
}
