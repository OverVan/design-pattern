package interpreter;

/**
 * 抽象的运算符表达式类，由具体的运算符表达式继承
 * 
 * @author Van
 */
public abstract class SymbolExpression extends Expression {

	// 左表达式、右表达式
	private Expression left;
	private Expression right;

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

}
