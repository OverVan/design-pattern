package interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 * 
 * @author Van
 */
public abstract class Expression {
	/**
	 * 解释变量名和值
	 * 
	 * @param var 变量名和值的映射
	 * @return 变量值
	 */
	public abstract int interpret(HashMap<String, Integer> var);
}
