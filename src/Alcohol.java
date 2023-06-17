public class Alcohol extends Product implements Goods, Licensed {
    // "SOLID-O
    //данный класс является расширением класс Product, обладает всеми свойствами исходного класса,
    // но была добавлена новая функциональность (методы интерфейса Licensed)

    //"SOLID-L"
    // Данный класс может сыграть роль своего предка - класс Product(товары)

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
