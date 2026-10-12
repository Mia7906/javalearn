void main (){
    Cat Cat1 = new Cat();
    System.out.println(Cat1.getName());
    System.out.println(Cat1.getMeow());
    System.out.println(Cat1.summ(10,  67));


}
class Cat {
    public String getName() {
        return "Масик";
    }

    public String getMeow() {
        return "Муууууурь";
    }

    public int summ(int a, int s) {
        return a + s;
    }

}


