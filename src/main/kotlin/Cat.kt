class Cat() : Animal("Fish", "Paris") {
    override fun makeNoise() {
        sayMeow();
    }

    override fun eat() {
        println("The Cat eats $food in $location.");
    }

    private fun sayMeow() {
        println("Meow!")
    }
}