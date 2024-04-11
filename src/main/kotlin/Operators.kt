import de.mineking.math.node.Fraction
import de.mineking.math.node.Node
import de.mineking.math.node.Product
import de.mineking.math.node.Sum
import org.jetbrains.annotations.NotNull

@NotNull
operator fun Node.unaryMinus(): Node {
	return negate()
}

@NotNull
operator fun Node.plus(@NotNull node: Node): Node {
	return Sum.create(this, node)
}

@NotNull
operator fun Node.minus(@NotNull node: Node): Node {
	return Sum.create(this, -node)
}

@NotNull
operator fun Node.times(@NotNull node: Node): Node {
	return Product.create(this, node)
}

@NotNull
operator fun Node.div(@NotNull node: Node): Node {
	return Fraction.create(this, node)
}

@NotNull
operator fun Node.invoke(): Node {
	return simplify()
}