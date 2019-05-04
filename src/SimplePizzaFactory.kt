enum class PizzaType {
    NewYork,
    Chicago,
    California
}

class NewYorkStylePizza(ingredients: List<String>) {
    init {
        println("Creating NewYork Style Pizza")
    }
}

class ChicagoStylePizza(ingredients: List<String>) {
    init {
        println("Creating Chicago Style Pizza")
    }
}

class CaliforniaStylePizza(ingredients: List<String>) {
    init {
        println("Creating California Style Pizza")
    }
}

class SimplePizzaFactory {

    fun createPizza(pizzaType: PizzaType, ingredients: List<String>): Any {
        return when (pizzaType) {
            PizzaType.NewYork -> NewYorkStylePizza(ingredients)
            PizzaType.Chicago -> ChicagoStylePizza(ingredients)
            PizzaType.California -> CaliforniaStylePizza(ingredients)
            else -> {
                println("No Pizza")
            }
        }
    }
}

fun main(args: Array<String>) {
    val ingredients = emptyList<String>()
    val simplePizzaFactory = SimplePizzaFactory()
    var pizza = simplePizzaFactory.createPizza(PizzaType.NewYork, ingredients)
}