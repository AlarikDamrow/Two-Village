/*
This program was created to create west villager for the road controller that is to be used.
Author: Oliver Pi
 */
public class West_village extends Thread 
{
   private int Villager; // Village number
   private RoadController road; // Road control
   private String[] task = {" is listening to Lorna Shore", " is opening the pits",
   " is planning to destroy earth"," is moshing with the homies"}; // Things that villagers can do
   public West_village (int v, RoadController rc) // Constructor
   {
       Villager = v; // Village number to be passed
       road = rc; // Road to be used
   }
   public void run() // How things are to run
   {
       synchronized (road) // Set the road up
       {
           road.lock(); // Lock that is needed
           System.out.println("West Villager " + Villager + " is on the road"); // On road statement
           System.out.println("West Villager " + Villager + task[(int)(Math.random()*(4-1+1))]); // Tells user which villager is on the road
           System.out.println("West Villager " + Villager + " has finished his run"); // Statment saying the end
           try
           {
               Thread.sleep((long)(Math.random()*(1000))); // Sleep for any where from 0 - 1000 ms
           }
           catch(Exception e) // If error happens
           {
               
           }
           road.unlock(); // Unlock the thread once job is done
       }
   }
}
