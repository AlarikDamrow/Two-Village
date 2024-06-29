/*
This program was created to create east villager for the road controller that is to be used.
Author: Oliver Pi
 */
public class East_village extends Thread
{
   private int Villager; // Village number
   private RoadController road; // Road control
   private String[] task = {" is reading astrophysics", " is eating a snadwich that smacks hard",
   " is planning world domination upon the foos"," is reading Gru's book"}; // Things that villagers can do
   public East_village (int v, RoadController rc) // Constructor 
   {
       Villager = v; // Village number to be passed
       road = rc; // Road to be used
   }
   public void run() // How things are to run
   {
       synchronized (road) // Set the road up
       {
           road.lock(); // Lock that is needed
           System.out.println("East Villager " + Villager + " is on the road"); // On road statement
           System.out.println("East Villager " + Villager + task[(int)(Math.random()*(4-1+1))]); // Tells user which villager is on the road
           System.out.println("East Villager " + Villager + " has finished his run"); // Statment saying the end
           try // Force a sleep to avoid possible deadlock
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
