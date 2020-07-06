package interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器类
 * 
 * @author Van
 */
public class Calculator {
	// 完整的四则运算表达式
	private Expression expression;

	/**
	 * 初始化并解析四则运算表达式
	 * 
	 * @param expression
	 */
	public Calculator(String expressionString) {
		// 控制运算顺序的栈
		Stack<Expression> stack = new Stack<>();
		// 将表达式拆分为字符数组
		char[] charArray = expressionString.toCharArray();
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		expression = stack.pop();
	}

	/**
	 * 得到最终计算结果
	 * 
	 * @param var 变量名和值的映射
	 * @return
	 */
	public int run(HashMap<String, Integer> var) {
		return expression.interpret(var);
	}
}
