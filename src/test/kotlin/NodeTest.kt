import de.mineking.math.function.DefaultFunctions
import de.mineking.math.node.Constant
import de.mineking.math.node.Exponent
import de.mineking.math.node.Sum
import de.mineking.math.node.UnaryFunctionCall
import de.mineking.math.node.Variable
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NodeTest {
	@Test
	fun test() {
		assertEquals(
			Sum.create(
				Constant.TWO,
				Exponent.create(Variable.defaultVariable, Constant.TWO),
				UnaryFunctionCall.create(DefaultFunctions.sin, Variable.defaultVariable)
			),
			c(2) +
			v("x") * v("x") +
			f(DefaultFunctions.sin, v("x"))
		)
	}
}