public class Zombie extends Human{



    @Override
    void defaultDisplayAbstract() {

    }

    @Override
    public void publicDisplayAbstract() {

    }

    @Override
    protected void protectedDisplayAbstract() {
        System.out.println(getB());
    }

    public void displayFromHumanClass(){
        System.out.println(getA());
    }


    public Zombie(int a, int b, int c, int d,
                  int i, int j, int k, int l)
    {
        super(a, b, c, d, i, j, k, l);
    }
}
