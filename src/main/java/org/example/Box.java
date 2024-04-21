package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Портфолио - контейнер, состоит из других лимонов
 */
public class Box implements Lemon {

    public List<Lemon> lemons = new ArrayList<>();

    @Override
    public int getQuantity() {
        AtomicReference<Integer> res = new AtomicReference<>(0);
        lemons.forEach(lemon -> {
            res.set(res.get() + lemon.getQuantity());
        });

        return res.get();
    }

    public void add(Lemon lemon){
        lemons.add(lemon);
    }


}
