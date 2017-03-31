import java.util.ArrayList;
public class TestFish
{
    public static void part1()
    {
        ArrayList<Fish> school = new ArrayList<Fish>();
        for (int i = 0; i < 20; i++)
            school.add(new Fish());
        
        for (Fish f : school)
            f.setColor("blue");
        
        for (Fish f : school)
            f.swim();
        
        school.get(8).setColor("green");
        System.out.println();
        school.get(8).swim();
        
        Fish newFish = new Fish();
        school.add(newFish);
        
        System.out.println();
        for (Fish f : school)
            f.swim();
        
        Fish Nemo = school.get(school.size() - 1);
        school.remove(school.size() - 1);
        
        school.get(2).setColor("gold");
        school.get(3).setColor("purple");
        school.get(7).setColor("silver");
        school.get(14).setColor("tan");
        school.get(17).setColor("bronze");
        
        school.add(0, new Fish());
        school.add(6, new Fish());
        school.add(new Fish());
        
        System.out.println();
        System.out.println(school.size());
        
        for (Fish f : school)
            f.setAge((int)(Math.random() * 60));
        
        System.out.println();
        for (Fish f : school)
            f.swim();
        Nemo.swim();
        
        for (int i = 0; i < 5; i++)
            school.remove(Math.random() * school.size());
        
        System.out.println();
        for (Fish f : school)
            f.swim();
        
        for (Fish f : school)
            if (f.getAge() > 40)
                f.die();
        
        System.out.println();
        for (Fish f : school)
            f.swim();
        
        System.out.println();
        for (Fish f : school) {
            if (!f.getIsAlive())
                System.out.println("The " + f.getColor() + " fish died when it was " + f.getAge() + " years old.");
        }
        
        ArrayList<Fish> theGreatBeyond = new ArrayList<Fish>();
        for (int i = 0; i < school.size()-1; i++) {
            if(!school.get(i).getIsAlive()) {
                theGreatBeyond.add(school.get(i));
                school.get(i).swim();
                school.remove(i);
                i = 0; 
            }
        }
        
        System.out.println();
        System.out.println("The Great Beyond:");
        for (Fish f : theGreatBeyond)
            System.out.println("The " + f.getColor() + " fish died when it was " + f.getAge() + " years old.");
        
        System.out.println();
        System.out.println("School:");
        for (Fish f : school)
            f.swim();
        
        for (int i = 0; i < 5; i++)
            school.add(new Fish());
        
        System.out.println();
        for (Fish f : school)
            f.swim();
    }
    public static void part2()
    {
        ArrayList<Fish> school = new ArrayList<Fish>();
        for (int i = 0; i < 20; i++) {
            school.add(new Fish());
            school.get(i).setColor("blue");
            school.get(i).setAge((int)(Math.random() * 60));
        }
        school.get(2).setColor("gold");
        school.get(3).setColor("purple");
        school.get(7).setColor("silver");
        school.get(14).setColor("tan");
        school.get(17).setColor("bronze");
        
        Shark jaws = new Shark();
        for (Fish f : school) {
            if (f.getColor() == "blue")
                jaws.eat(f);
        }
        
        for (int i = 0; i < 5; i++) {
            school.add((int) (Math.random() * 20), new Shark());
        }
        
        for (Fish f : school)
            f.swim();
            
        for (Fish f : school)
            if (f instanceof Shark)
                System.out.println("shark");
            else
                System.out.println("fish");
                
        for (Fish f : school)
            if (f instanceof Shark) {
                Shark s = (Shark)f;
                s.eat(new Fish());
            }
    }
}