package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
public class ClientTest {
	@Test
	void testInterpreter() throws IOException {
		// 模板表达式
		String expressionString = getExpressionString();
		// 各参数对应的值
		HashMap<String, Integer> var = getValue(expressionString);
		Calculator calculator = new Calculator(expressionString);
		System.out.println("计算结果：" + expressionString + " = " + +calculator.run(var));
	}

	/**
	 * 获得表达式字符串，如a+b-c
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String getExpressionString() throws IOException {
		System.out.print("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	/**
	 * 输入并存储各参数对应的整数值
	 * 
	 * @param expressionString 模板表达式
	 * @return
	 */
	public static HashMap<String, Integer> getValue(String expressionString) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 遍历模板表达式，扫出参数变量
		for (char ch : expressionString.toCharArray()) {
			// 当前变量名既不是运算符加或减
			if (ch != '+' && ch != '-') {
				// 又没有在映射中出现过
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + ch + "的值：");
					int value = in.nextInt();
					map.put(String.valueOf(ch), value);
				}
			}
		}
		in.close();
		return map;
	}
}
