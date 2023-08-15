package entities;

public class Company {

    private String cnpjCompany;
    private String keyCompany;

    public Company(String cnpjCompany, String keyCompany) {
        super();
        this.cnpjCompany = cnpjCompany;
        this.keyCompany = keyCompany;
    }

    public String getCnpjCompany() {
        return cnpjCompany;
    }

    public void setCnpjCompany(String cnpjCompany) {
        this.cnpjCompany = cnpjCompany;
    }

    public String getKeyCompany() {
        return keyCompany;
    }

    public void setKeyCompany(String keyCompany) {
        this.keyCompany = keyCompany;
    }

}
