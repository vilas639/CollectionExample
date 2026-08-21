package  scaller.lld.designpatterns.casestudy.designpen;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();

        for (Pen pen: pens) {
            if (pen.getType().equals(PenType.BALL)) {

            }
        }

        GelPen reynoldsTrimaxPen = PenFactory
                .createGelPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build();
        reynoldsTrimaxPen.setName("Trimax");
        reynoldsTrimaxPen.setCompany("Reynolds");

        System.out.println(reynoldsTrimaxPen.toString());

        // PenFactory.createGelPen()
        //           .setRefil(x)
        //           .setRefilable(false);
    }
}

// Assignment
// Fountain Pen Builder and FountainPen in PenFactory