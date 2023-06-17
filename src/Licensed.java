public interface Licensed {
    // "SOLID-I"
    // в отдельный интерфейс был вынесен функционал лицензируемых товаров, т.к. не все товары требуют лицензии


    public boolean haveLicense();

    public void setIsLicensed(boolean isLicense);

    public boolean getIsLicensed();
}
