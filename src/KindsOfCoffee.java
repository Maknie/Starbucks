public enum KindsOfCoffee {
    LATTE(60,20,0,20),
    ESPRESSO(0,50,50,0),
    CAPPUCCINO(20,30,10,40),
    FLAT_WHITE(30,70,0,0),
    AMERICANO(0,30,70,0);

    private float milkPercent;
    private float espressoPercent;
    private float waterPercent;
    private float foamPercent;

   /* KindsOfCoffee(float milkPercent, float espressoPercent, float waterPercent, float foamPercent){
        this.milkPercent = milkPercent;
        this.espressoPercent = espressoPercent;
        this.waterPercent = waterPercent;
        this.foamPercent = foamPercent;
    }
    */

    KindsOfCoffee(int milkPercent, int espressoPercent, int waterPercent, int foamPercent){
        this.milkPercent = milkPercent;
        this.espressoPercent = espressoPercent;
        this.waterPercent = waterPercent;
        this.foamPercent = foamPercent;
    }


}
