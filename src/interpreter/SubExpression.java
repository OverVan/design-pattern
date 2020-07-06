package interpreter;

import java.util.HashMap;

/**
 * 具体的运算符表达式类-减法表达式类
 * 
 * @author Van
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpret(HashMap<String, Integer> var) {
		// 返回对左右表达式做减运算的结果
		return getLeft().interpret(var) - getRight().interpret(var);
	}

}
