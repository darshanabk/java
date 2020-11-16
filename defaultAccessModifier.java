
class defaultAccessModifier
{
    // Since there is no access specifier mentioned to display(),
    // display() is considered as, accommodated with default modifier.
    void display()
    {
        System.out.println("hello world");
    }
    public static void main(String[] args)
    {
        // Creating object to defaultAccessModifier class
        defaultAccessModifier object = new defaultAccessModifier();
        // Calling display() through instance of class defaultAccessModifier
        object.display();
    }

}
