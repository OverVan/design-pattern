package visitor;

public class ManReferee extends Referee {

	@Override
	public void accept(Assess assess) {
		assess.getManAssess(this);
	}

}
