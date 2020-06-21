package builder.primitive;

/**
 * 实现类-造小木屋
 * 
 * @author Van
 */
public class BuildCabin extends BuildHouse {
	public void buildBasic() {
		System.out.println("正在打小木屋的地基");
	}

	public void buildStructure() {
		System.out.println("正在搭小木屋的结构");
	}

	public void decorate() {
		System.out.println("正在装修小木屋");
	}
}
