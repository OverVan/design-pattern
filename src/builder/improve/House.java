package builder.improve;

/**
 * 产品-房子
 * 
 * @author Van
 */
public class House {
	private String basic;// 地基
	private String wall;// 墙
	private String roof;// 屋顶

	public String getBasic() {
		return basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "House [basic=" + basic + ", wall=" + wall + ", roof=" + roof + "]";
	}
}
