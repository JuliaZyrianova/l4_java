/**
 * Class-Person
 */
public class Person {
   /** field person id */
   private int ID;
   /** field person name */
   private String name;
   /** field person gender */
   private String gender;
   /** field person birthday  */
   private String birtDate;
   /**
    * the field is a variable of the "division" type
    * @see Division#Division(String)
    * */
   private Division d;
   /** field person salary */
   private double salary;

   /**
    * Constructor-creating objects of the person type
    */
   public Person(int ID, String name, String gender, String birtDate, Division d, double salary ) {
      this.ID = ID;
      this.name = name;
      this.gender = gender;
      this.birtDate = birtDate;
      this.d = d;
      this.salary = salary;

   }
   /**
    * Function of printing Person
    * @see Division#print()
    */
  void print(){
     System.out.println("ID "+ID);
     System.out.println("name "+name);
     System.out.println("gender "+gender);
     System.out.println("birth date "+birtDate);
     System.out.println("division ");
     d.print();
     System.out.println("salary "+salary);
  }

}

