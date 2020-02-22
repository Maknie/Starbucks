public class CoffeeMachine {


    /*
    COFFEE = {int milkPercent, int espressoPercent, int waterPercent, int foamPercent}
     */

    private int [] LATTE = {60,20,0,20};
    private int [] ESPRESSO = {0,50,50,0};
    private int [] CAPPUCCINO = {20,30,10,40};
    private int [] FLAT_WHITE = {30,70,0,0};
    private int [] AMERICANO = {0,30,70,0};
    private int [] NO_NAME_COFFEE;

    public void setNO_NAME_COFFEE(int [] NO_NAME_COFFEE){
        this.NO_NAME_COFFEE=NO_NAME_COFFEE;
    }

    public int[] getLATTE(){
        return LATTE;
    }

    public int[] getAMERICANO() {
        return AMERICANO;
    }

    public int[] getCAPPUCCINO() {
        return CAPPUCCINO;
    }

    public int[] getESPRESSO() {
        return ESPRESSO;
    }

    public int[] getFLAT_WHITE() {
        return FLAT_WHITE;
    }

    public int[] getNO_NAME_COFFEE() {
        return NO_NAME_COFFEE;
    }
}
