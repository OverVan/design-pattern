package proxy.dynamicProxy;

/**
 * 目标对象
 * 
 * @author Van
 */
public class TeacherDaoImpl implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("正在教学中");
	}

}
