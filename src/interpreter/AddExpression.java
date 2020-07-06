package interpreter;

import java.util.HashMap;

/**
 * 具体的运算符表达式类-加法表达式
 * 
 * @author Van
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpret(HashMap<String, Integer> var) {
		// 返回对左右表达式做加运算的结果
		return getLeft().interpret(var) + getRight().interpret(var);
	}

}
