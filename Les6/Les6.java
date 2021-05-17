package Les6;

public class Les6 {

    public static void main(String[] args) {

        Paladin paladin = new Paladin("Paladin", 100, 25, 15, 50);
        Archer archer = new Archer("Archer", 75, 50, 2, 75);
        Mage mage = new Mage("Mage", 25, 100, 0, 100);

        Paladin paladinTest = new Paladin("paladinTest", 150, 35, 30, 75, 15);
        Titan titan = new Titan("Titan", 1500, 200, 100, 100, 99);

        Unit[] army = {paladin, archer, mage, titan};

        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].getDamage();
            army[i].jump();

            if (army[i] instanceof Paladin) {
                Paladin tmpPaladin = (Paladin) army[i];
                tmpPaladin.defenceSelf();
            }

            if (army[i] instanceof Titan) {
                ((Titan)army[i]).superDamage();
            }
        }

//        System.out.println("Paladin lvl = " + paladin.getLevel());
//        System.out.println("paladinTest lvl " + paladinTest.getLevel());

//        titan.speak();
//        titan.getDamage();
//        titan.healSelf(150);
//        titan.defenceSelf();
//        titan.superDamage();
//        titan.jump();
//
//        paladin.speak();
//        paladin.getDamage();
//        paladin.healSelf(15);
//        paladin.defenceSelf();
//
//        archer.speak();
//        archer.getDamage();
//        archer.healSelf(30);
//
//        mage.speak();
//        mage.getDamage();
//        mage.healSelf(100);

    }

}
