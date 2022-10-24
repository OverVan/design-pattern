package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Prototype {
	/**
	 * 最笨的对象复制
	 * 
	 * @param sheep
	 * @return
	 */
	public Sheep[] simpleCopy(Sheep sheep, int num) {
		Sheep[] sheeps = new Sheep[num];
		// 苕写
		sheeps[0] = new Sheep(sheep.getName(), sheep.getAge(), sheep.getGeneration());
		sheeps[1] = new Sheep(sheep.getName(), sheep.getAge(), sheep.getGeneration());
		sheeps[2] = new Sheep(sheep.getName(), sheep.getAge(), sheep.getGeneration());
		// ……
		return sheeps;
	}

	/**
	 * 稍微聪明一点的基于循环的对象复制
	 * 
	 * @param sheep
	 * @return
	 */
	public Sheep[] loopCopy(Sheep sheep, int num) {
		Sheep[] sheeps = new Sheep[num];
		for (int i = 0; i < sheeps.length; i++) {
			sheeps[i] = new Sheep(sheep.getName(), sheep.getAge(), sheep.getGeneration());
		}
		return sheeps;
	}

	/**
	 * 使用clone方法复制对象
	 * 
	 * @param sheep
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Sheep cloneSheep(Sheep sheep) throws CloneNotSupportedException {
		return sheep.clone();
	}

	/**
	 * 针对任意类，自己使用反射复制对象
	 * 
	 * @param <T>
	 * @param any
	 * @return
	 * @throws Exception
	 */
	public <T> T copyAny(T any) throws Exception {
		Class<T> anyCls = (Class<T>) any.getClass();
		T copy = anyCls.getConstructor().newInstance();
		Class<T> copyCls = (Class<T>) copy.getClass();
		for (Field copyField : copyCls.getDeclaredFields()) {
			// 找同名属性
			Field anyField = anyCls.getDeclaredField(copyField.getName());
			anyField.setAccessible(true);
			copyField.setAccessible(true);
			// 浅拷贝
			copyField.set(copy, anyField.get(any));
		}
		return copy;
	}

	/**
	 * 针对任意类，使用clone方法复制对象
	 * 
	 * @param <T>
	 * @param any
	 * @return
	 * @throws Exception
	 */
	public <T extends Cloneable> T cloneAny(T any) throws Exception {
		// 只能利用反射调clone方法
		Method method = any.getClass().getDeclaredMethod("clone", null);
		method.setAccessible(true);
		return (T) method.invoke(any);
	}

	/**
	 * 级联调用clone方法深拷贝对象，只能针对具体类
	 * 
	 * @param sheep
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Sheep deepCopy(Sheep sheep) throws CloneNotSupportedException {
		// 先浅拷贝
		Sheep copy = sheep.clone();
		// 再让引用类型的域引用新对象，后者调clone方法
		sheep.setGeneration(sheep.getGeneration().clone());
		return copy;
	}

	/**
	 * 针对任意类，利用序列化反序列化深拷贝对象
	 * 
	 * @param <T>
	 * @param any
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public <T> T deepClone(T any) throws IOException, ClassNotFoundException {
		// 序列化到内存（字节数组），再反序列化回内存（新对象），别忘了T须支持级联序列化
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			oos.writeObject(any);
			try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
					ObjectInputStream ois = new ObjectInputStream(bis)) {
				return (T) ois.readObject();
			}
		}
	}
}
