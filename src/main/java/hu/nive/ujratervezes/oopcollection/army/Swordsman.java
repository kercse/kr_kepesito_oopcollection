package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    public boolean hasShield = true;


    public Swordsman(boolean hasArmor){
        setHitPoints(110);
        setDamage(10);
        setHasArmor(hasArmor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShield){
            damage = 0;
            hasShield = false;
        }
        super.sufferDamage(damage);
    }
}