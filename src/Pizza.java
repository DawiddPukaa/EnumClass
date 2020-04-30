enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOZA(true, true, false, false),
    PROSCIUTTO(true, true, true, false);

    Pizza(boolean baseIngredient, boolean cheese, boolean ham, boolean mushrooms) {
        this.baseIngredient = baseIngredient;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    private boolean baseIngredient;
    private boolean cheese;
    private boolean ham;
    private boolean mushrooms;


    public boolean isBaseIngredient() {
        return baseIngredient;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isHam() {
        return ham;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }


    @Override
    public String toString() {
        String result = ordinal() + " " + name() + " (";
        if (baseIngredient) {
            result += "sos pomidorowy ";
        }
        if (cheese) {
            result += " ser";
        }
        if (ham) {
            result += " szynka";
        }
        if (mushrooms) {
            result += " pieczarki";
        }
        result += " )";
        return result;
    }

    static Pizza ChoosePizza(int choosenPizza) {
        Pizza[] pizzas = Pizza.values();
        Pizza pizzaPick = null;
            for (int i=0;i<pizzas.length;i++){
               if(pizzas[i].ordinal() == choosenPizza){
                   pizzaPick =  pizzas[i];
               }
            }
            return pizzaPick;
        }
}



