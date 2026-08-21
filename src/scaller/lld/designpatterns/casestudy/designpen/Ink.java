package scaller.lld.designpatterns.casestudy.designpen;

public class Ink {

	  private Colour colour;
	    private boolean erasable;

	    public Colour getColour() {
	        return colour;
	    }

	    public void setColour(Colour colour) {
	        this.colour = colour;
	    }

	    public boolean isErasable() {
	        return erasable;
	    }

	    public void setErasable(boolean erasable) {
	        this.erasable = erasable;
	    }
	    
	    
	    public String toString() {
	    		        return "Ink{" +
	                "colour=" + colour +
	                ", erasable=" + erasable +
	                '}';
	    }
}
