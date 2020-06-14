package com.daddyjoys.java.patterns.factory;



public class Eats {

    public Factory getEats( EatTypes type) {
        Factory toReturn = null;
        switch (type){
            case CHERRY:    toReturn = new Cherry(); break;
            case CHOCOLATE: toReturn = new Chocolate(); break;
            case ALMOND:    toReturn = new Almond(); break;
            default: new IllegalArgumentException("Error: unknown type: " + type);
        }
        return toReturn;
    }

    /** Возвращает "случайную еду"
     *
     * @return Factory
     */
    public Factory getEatRandom(){
        Factory toReturn = null;


        return toReturn;
    }
}
