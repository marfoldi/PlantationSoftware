package PlantationSoftware;

import java.util.ArrayList;

/**
 *
 * @author marfoldi
 */
public class DefaultPlantation implements Plantation {
    ArrayList<Plant> plants = new ArrayList<>();

    @Override
    public void plant(Plant plant) 
    {
        plants.add(plant);
    }
    
    @Override
    public void illuminateAll(int amountOfLight) 
    {
        for (int i=0; i<plants.size(); i++) 
	{
            plants.get(i).illuminate(amountOfLight);
        }
    }
    
    @Override
    public void irrigateAll(int amountofWater)
    {
        for (int i=0; i<plants.size(); i++)
        {
            plants.get(i).irrigate(amountofWater);
        }
    }
    
    @Override
    public Plant getHighestPlant()
    {
        Plant highest=plants.get(0);
        double maxh=plants.get(0).getHeight();
        for (int i=1; i<plants.size(); i++)
        {
            if (plants.get(i).getHeight()>maxh)
            {
                highest=plants.get(i);
                maxh=plants.get(i).getHeight();
            }
        }
     return highest;  
    }
}
