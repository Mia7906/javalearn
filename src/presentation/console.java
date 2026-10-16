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

}

