package visitor;

public class WomanReferee extends Referee {

	@Override
	public void accept(Assess assess) {
		assess.getWomanAssess(this);
	}

}
