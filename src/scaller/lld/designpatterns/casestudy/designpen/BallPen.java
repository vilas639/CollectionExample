package  scaller.lld.designpatterns.casestudy.designpen;

import scaller.lld.designpatterns.casestudy.designpen.strategies.writestrategies.WriteBehaviour;

public class BallPen extends Pen implements RefilPen {
	
	
	
    public BallPen(WriteBehaviour writeBehaviour) {
        super(PenType.BALL, writeBehaviour);
    }
    
  



    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
