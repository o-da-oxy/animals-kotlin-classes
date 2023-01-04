fun main(args: Array<String>) {
    val v = Veterinarian();
    val animals = arrayOf(
        Cat(),
        Dog(),
        Horse()
    );
    for (animal in animals) {
        v.treatAnimal(animal);
    }
}




















class Words() {
    init {
        println("Класс Words был создан!")
    }
}

class Message(username: String) {
    private val name: String;
    init {
        name = username;
    }
    fun introduce() {
        println("Привет, меня зовут $name");
    }
}