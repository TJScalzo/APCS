public class Family
{
     private Person parent1;
     private Person parent2;
     private Person child;
     
     public Family()
     {
         parent1 = new Person();
         parent2 = new Person();
         child = parent1.createChild(parent2, "Dam", "9-11-01");
     }
     public Family(Person parent1, Person parent2, Person child)
     {
         this.parent1 = parent1;
         this.parent2 = parent2;
         this.child = child;
     }
     
     public void printFamilyTree()
     {
         System.out.println("FAMILY TREE");
         System.out.print(parent1.getLastName() + ", " + parent1.getFirstName());
         System.out.print("     ");
         System.out.println(parent2.getLastName() + ", " + parent2.getFirstName());
         System.out.print("        ");
         System.out.println(child.getLastName() + ", " + child.getFirstName());
     }
}