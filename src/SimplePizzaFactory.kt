interface IPizza {
    fun onCreatePizza()
}

enum class PizzaType {
    NewYork,
    Chicago,
    California
}


class NewYorkPizza : IPizza {
    init {
        this.onCreatePizza()
    }

    override fun onCreatePizza() {
        println("Creating NewYork Pizza")
    }

}

class ChicagoPizza : IPizza {
    init {
        this.onCreatePizza()
    }

    override fun onCreatePizza() {
        println("Creating Chicago Pizza")
    }

}

class CaliforniaPizza : IPizza {
    init {
        this.onCreatePizza()
    }

    override fun onCreatePizza() {
        println("Creating California Pizza")
    }
}

class SimplePizzaFactory {

    fun createPizza(pizzaType: PizzaType, ingredients: Array<String> = emptyArray()): IPizza {
        return when (pizzaType) {
            PizzaType.NewYork -> NewYorkPizza()
            PizzaType.Chicago -> ChicagoPizza()
            PizzaType.California -> CaliforniaPizza()
        }
    }
}


fun main(args: Array<String>) {
    val newYorkPizza = SimplePizzaFactory().createPizza(PizzaType.NewYork)
    println(newYorkPizza::class.java.simpleName)

    val chicagoPizza = SimplePizzaFactory().createPizza(PizzaType.Chicago)
    println(chicagoPizza::class.java.simpleName)

    val californiaPizza = SimplePizzaFactory().createPizza(PizzaType.California)
    println(californiaPizza::class.java.simpleName)

}