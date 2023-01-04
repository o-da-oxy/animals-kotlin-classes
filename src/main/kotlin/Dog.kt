class Dog() : Animal("Meat", "Moscow") {
    override fun makeNoise() {
        sayBark();
    }

    override fun eat() {
        println("The Dog eats $food in $location.");
    }

    private fun sayBark() {
        println("Bark!");
    }
}