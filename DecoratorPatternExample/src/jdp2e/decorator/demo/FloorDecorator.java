package jdp2e.decorator.demo;
// A floor decorator
class FloorDecorator extends AbstractDecorator
{
    public void makeHouse() {
        super.makeHouse();
        //Decorating now.
        System.out.println("***Floor decorator is in action***");
        addFloor();
        /* You can put additional stuffs are per your need */

    }
    private void addFloor() {
        System.out.println("I am making an additional floor on top of it.");
    }
}

