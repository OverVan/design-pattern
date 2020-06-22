package composite;

import org.junit.jupiter.api.Test;

/**
 * 测试
 * 
 * @author Van
 */
class ClientTest {

	@Test
	void testUniversityInfo() {
		// 利用add方法组织起结构
		Department softwareEngineerDepartment = new Department("软件工程", "高薪就业");
		Department digitalMediaDepartment = new Department("数字媒体技术", "计算机和艺术的融合");
		Department folkDepartment = new Department("民俗学", "");
		Department chineseDepartment = new Department("中国文学", "最好的语言-汉语");
		Department foreignDepartment = new Department("外国文学", "外文");

		College computerCollege = new College("计算机学院", "最高薪的学院");
		computerCollege.add(softwareEngineerDepartment);
		computerCollege.add(digitalMediaDepartment);
		College chinaCollege = new College("国学院", "人文底蕴极深");
		chinaCollege.add(folkDepartment);
		College literaturecollege = new College("文学院", "才子佳人聚集之地");
		literaturecollege.add(chineseDepartment);
		literaturecollege.add(foreignDepartment);

		University university = new University("清华大学", "北大死敌");
		university.add(computerCollege);
		university.add(chinaCollege);
		university.add(literaturecollege);
		university.print();
	}

}
