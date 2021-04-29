package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean firstCharge = true;

    public HeavyCavalry(){
        setHitPoints(150);
        setDamage(20);
        setHasArmor(true);
    }

    @Override
    public int doDamage() {
        if (firstCharge){
            setDamage(60);
            firstCharge = false;
        }
        if (firstCharge = false){
            setDamage(20);
        }
        return super.doDamage();

    }
}