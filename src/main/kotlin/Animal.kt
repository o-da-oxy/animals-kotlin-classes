abstract class Animal(var food : String, var location : String) {
    abstract fun makeNoise();
    abstract fun eat();
    open fun sleep() {
        println("${this::class.simpleName} sleeps.")
    };
}