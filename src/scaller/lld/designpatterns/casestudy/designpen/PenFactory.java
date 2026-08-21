package  scaller.lld.designpatterns.casestudy.designpen;

public class PenFactory {

    public static GelPen.Builder createGelPen() {
        return new GelPen.Builder();
    }

   // public static BallPen.Builder createBallPen() {return null;}
}
