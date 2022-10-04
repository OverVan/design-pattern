package prototype;

import java.io.Serializable;

public class Generation implements Cloneable, Serializable {
	private static final long serialVersionUID = -4406419497361958946L;

	// 代际号
	private int id;
	// 研究者
	private String researcher;

	public Generation(int id, String researcher) {
		super();
		this.id = id;
		this.researcher = researcher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResearcher() {
		return researcher;
	}

	public void setResearcher(String researcher) {
		this.researcher = researcher;
	}

	@Override
	public String toString() {
		return "Generation [id=" + id + ", researcher=" + researcher + "]";
	}

	@Override
	protected Generation clone() throws CloneNotSupportedException {
		return (Generation) super.clone();
	}
}
