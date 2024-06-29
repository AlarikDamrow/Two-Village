/*
This program was created to handle the control of the road and to incorporate the east and west villagers on such road.
This program will create villagers from both sides and have them go on the road at certain times to avoid deadlocks.
Author: Alarik Damrow
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class RoadController  // Road to be used
{
    private Lock road = new ReentrantLock(); // Lock needed to run this program
    public void lock() // Lock function for villagers
    {
        road.lock(); // To avoid deadlock
    }
    public void unlock() // Unlock function for villagers
    {
        road.unlock(); // To avoid deadlock
    }
    public static void main (String[] args) // Main to run the whole program with west and east villagers
    {
        RoadController roadControl = new RoadController(); // One road to be used
        //Set of east villagers
        East_village east1 = new East_village(1,roadControl); 
        East_village east2 = new East_village(2,roadControl);
        East_village east3 = new East_village(3,roadControl);
        East_village east4 = new East_village(4,roadControl);
        //Set of west villagers
        West_village west1 = new West_village(1,roadControl);
        West_village west2 = new West_village(2,roadControl);
        West_village west3 = new West_village(3,roadControl);
        West_village west4 = new West_village(4,roadControl);
        
        //Starting of threads to each villager
        east1.start();
        east2.start();
        east3.start();
        east4.start();
        west1.start();
        west2.start();
        west3.start();
        west4.start();
    }
    
}
