package  scaller.lld.designpatterns.casestudy.designpen;


public interface RefilPen {

    Refil getRefil();

    boolean canChangeRefil();

    void changeRefil(Refil newRefil);
}
