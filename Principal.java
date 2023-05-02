public class Principal {
    public static void main(String args[]) {
        Dog dog =new Dog("Lilica", 10);
        Dog dog1 =new Dog("Filó" ,5);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());
        System.out.println(dog1.getNome());
        System.out.println(dog1.getIdade());

        Cat cat =new Cat("Rabisco", 3);
        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());
    }
}
