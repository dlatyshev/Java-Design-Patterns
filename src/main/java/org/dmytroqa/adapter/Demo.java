package org.dmytroqa.adapter;

public class Demo {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)) {
            System.out.println("Peg matches a hole");
        } else {
            System.out.println("Peg doesn't match a hole");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (roundHole.fits(smallPegAdapter)) {
            System.out.println("Small Square peg matchers a hole");
        } else {
            System.out.println("Small Square peg doesn't match a hole");
        }


        if (roundHole.fits(largePegAdapter)) {
            System.out.println("Large Square peg matches a hole");
        } else {
            System.out.println("Large Square peg doesn't match a hole");
        }
    }
}
