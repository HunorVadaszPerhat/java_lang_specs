public class Main {
    public static void main(String[] args) {

        Zombie zombie = new Zombie(1,2,3,4,5,6,7,8);

        /*
         * ABSTRACT
         * */
        zombie.defaultDisplayAbstract();
        zombie.publicDisplayAbstract();
        // 'privateDisplayAbstract()' has private access in 'Human'
        // zombie.privateDisplayAbstract();
        zombie.protectedDisplayAbstract();

        /*
         * NON-ABSTRACT
         * */
        zombie.defaultDisplayAbstract();
        zombie.publicDisplayAbstract();
        // 'privateDisplayNonAbstract()' has private access in 'Human'
        // zombie.privateDisplayNonAbstract();
        zombie.protectedDisplayNonAbstract();

        /*
         * FIELDS
         * */
        System.out.println(zombie.getA());
        System.out.println(zombie.getB());
        System.out.println(zombie.getC());
        System.out.println(zombie.getD());

        System.out.println(zombie.getE());
        System.out.println(zombie.getF());
        System.out.println(zombie.getG());
        System.out.println(zombie.getH());

        // Static member 'Zombie.getXXX()' accessed via instance reference
        System.out.println(zombie.getI());
        System.out.println(zombie.getJ());
        System.out.println(zombie.getK());
        System.out.println(zombie.getL());

        // Access static 'Human.getXXX()' via class Human reference
        System.out.println(Human.getI());
        System.out.println(Human.getJ());
        System.out.println(Human.getK());
        System.out.println(Human.getL());
    }
}