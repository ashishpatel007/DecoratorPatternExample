package jdp2e.decorator.demo;

abstract class AbstractDecorator extends Component
{
    protected Component component;
    public void setTheComponent(Component c)
    {
        component = c;
    }

    public void makeHouse()
    {
        if (component != null)
        {
            // Delegation is simply passing a duty off to someone/something else.
            // With delegation an object receives a request and then "delegate" this
            //  request to another object to handle.    
            component.makeHouse();//Delegating the task
        }

    }
}
