package builder.primitive;

/**
 * 实现类-造公寓
 * 
 * @author Van
 */
public class BuildApartment extends BuildHouse {
	public void buildBasic() {
		System.out.println("正在打公寓的地基");
	}

	public void buildStructure() {
		System.out.println("正在搭公寓的结构");
	}

	public void decorate() {
		System.out.println("正在装修公寓");
	}
}
