import de.mineking.math.function.BinaryFunction
import de.mineking.math.function.UnaryFunction
import de.mineking.math.node.*
import org.jetbrains.annotations.NotNull

@NotNull
fun c(@NotNull value: Number): Node {
	return Constant.create(value.toDouble())
}

@NotNull
fun v(@NotNull name: String): Node {
	return Variable.create(name)
}

@NotNull
fun f(@NotNull function: UnaryFunction, @NotNull param: Node): Node {
	return UnaryFunctionCall.create(function, param)
}

@NotNull
fun f(@NotNull function: BinaryFunction, @NotNull param1: Node, @NotNull param2: Node): Node {
	return BinaryFunctionCall.create(function, param1, param2)
}