package jdp2e.decorator.demo;
// A paint decorator
class PaintDecorator extends AbstractDecorator
{
    public void makeHouse()
    {
        super.makeHouse();
        //Decorating now.
        System.out.println("***Paint decorator is in action.");
        paintTheHouse();
        //You can add additional stuffs as per your need
    }

    private void paintTheHouse()
    {
        System.out.println("Now I am painting the house.");
    }
}
