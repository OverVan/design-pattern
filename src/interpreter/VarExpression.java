package interpreter;

import java.util.HashMap;

/**
 * 具体表达式类-变量表达式
 * 
 * @author Van
 */
public class VarExpression extends Expression {

	// 变量名
	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpret(HashMap<String, Integer> var) {
		// 返回变量名的值
		return var.get(key);
	}

}
