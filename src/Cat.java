
public class Cat
{
    private double originWeight;
    private double weight;
    private static int count;
    private double minWeight;
    private double maxWeight;
    private double countFeed;
    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        countFeed = 0;
        count = count + 1;
    }
   public int getCount(){
        return count;
   }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }
    public double getCountFeed(){
        return countFeed;
    }
    public void feed(Double amount)
    {
        if (weight < minWeight || weight > maxWeight){
            System.out.println("Кошка не доступна");
        }
        else
            weight = weight + amount;
        countFeed = amount + countFeed;
    }

    public void drink(Double amount)
    {
        if (weight < minWeight || weight > maxWeight){
            System.out.println("Кошка не доступна");
        }
        else
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

public void pee(){
        weight = weight - 10;
}
    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}