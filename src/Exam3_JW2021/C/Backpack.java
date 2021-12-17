package Exam3_JW2021.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Backpack {
    private List<Object> accessories;

    public void addAccesory(Object accesory) throws MyException {
        boolean check = true;
        if(accessories.size()==0) {
            accessories.add(accesory);
        }else if(accesory instanceof Cylinder){
            for (Object object:accessories) {
                if (object instanceof Cylinder) {
                    check = false;
                    break;
                }
            }
            if(check) accessories.add(accesory);
        }else if(accesory instanceof Flat){
            for (Object object:accessories) {
                if (object instanceof Flat) {
                    check = false;
                    break;
                }
            }
            if(check) accessories.add(accesory);
        }else if(accesory instanceof Round){
            accessories.add(accesory);
        }
        if(!check) throw new MyException("В рюкзаке может быть только 1 плоский, 1 цилиндрический и несколько круглых вещей");
    }

    @Override
    public String toString() {
        return "Backpack: " + accessories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return Objects.equals(accessories, backpack.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessories);
    }

    public Backpack() {
        accessories = new ArrayList<>();
    }

    public Backpack(List<Object> accessories) throws MyException {
        this.accessories = new ArrayList<>();
        for (Object object:accessories) {
            addAccesory(object);
        }
    }

    public List<Object> getAccessories() {
        return accessories;
    }

}
