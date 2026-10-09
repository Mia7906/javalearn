void main (){
    Cat Cat1 = new Cat();
    System.out.println(Cat1.getName());
    System.out.println(Cat1.getMeow());
}
class Cat {
    public String getName (){
        return "Масик";
    }
    public String getMeow(){
        return "Муууууурь";
    }
}

