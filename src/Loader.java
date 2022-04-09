
public class Loader
{
    public static void main(String[] args)
    {

        Cat cat1 = new Cat();
        cat1.feed(cat1.getWeight()/100);
        cat1.feed(cat1.getWeight()/100);
        cat1.feed(cat1.getWeight()/100);
        Cat cat2 = new Cat();
        for (int i = 0; i < 10; i++) {
            cat1.feed(3000.0);


        }




        System.out.println(cat1.getCountFeed());
    }


}