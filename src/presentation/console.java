import application.Student;

void main(){
    System.out.println("это console");

    Student Student1 = new Student();
    System.out.println("|||=== " + Student1.getName());
    Cat Cat1 = new Cat();
    Cat1.setColor("фиолетовый");
    System.out.println(Cat1.getColor());
    Cat1.setColor("зеленый");
    System.out.println(Cat1.getColor());

    Person.main(new String[]{"tom", "black", "20"});

    Person User1 = new Person("tom","black", "20");
}


