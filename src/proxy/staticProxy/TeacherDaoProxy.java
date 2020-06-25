package proxy.staticProxy;

/**
 * 代理对象
 * 
 * @author Van
 */
public class TeacherDaoProxy implements ITeacherDao {

	private ITeacherDao teacherDao;

	public TeacherDaoProxy(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	/**
	 * 扩展目标对象的功能
	 */
	@Override
	public void teach() {
		System.out.println("在前面扩展功能");
		teacherDao.teach();
		System.out.println("在后面扩展功能");
	}

}
