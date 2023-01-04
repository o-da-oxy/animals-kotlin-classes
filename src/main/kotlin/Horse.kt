class Horse : Animal("Grass", "London") {
    override fun makeNoise() {
        sayBree();
    }

    override fun eat() {
        println("The Horse eats $food in $location.");
    }

    private fun sayBree() {
        println("Bree!");
    }
}