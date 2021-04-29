package hu.nive.ujratervezes.oopcollection.army;

import java.util.List;

public class Army {
    List<MilitaryUnit> armyList;

    public void addUnit(MilitaryUnit militaryUnit){
        armyList.add(militaryUnit);
    }
   public void damageAll(int damage){
        for (int i = 0; i < armyList.size(); i++){
            
        }
   }




}