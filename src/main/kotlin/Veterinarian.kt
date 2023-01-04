class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("I'm a Veterinarian: ");
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }
}