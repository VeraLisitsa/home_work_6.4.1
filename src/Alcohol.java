public class Alcohol extends Product implements Goods, Licensed { //"SOLID-I"

    boolean isLisenced;

    public Alcohol(int id, String name, double price, String manufacturer) {
        super(id, name, price, manufacturer);
    }

    @Override
    public boolean haveLicense() {
        if (isLisenced) {
            return true;
        }
        return false;
    }

    @Override
    public void setIsLicensed(boolean isLicensed) {
        this.isLisenced = isLicensed;
    }

    @Override
    public boolean getIsLicensed() {
        return isLisenced;
    }
}
