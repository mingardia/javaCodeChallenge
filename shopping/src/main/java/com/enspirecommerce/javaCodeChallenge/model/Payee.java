package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public class Payee {
    class MailingAddress {
        String name;
        String address1;
        String address2;
        String city;
        String state;
        String zip;

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String getAddress1() {

            return address1;
        }

        public void setAddress1(String address1) {

            this.address1 = address1;
        }

        public String getAddress2() {

            return address2;
        }

        public void setAddress2(String address2) {

            this.address2 = address2;
        }

        public String getCity() {

            return city;
        }

        public void setCity(String city) {

            this.city = city;
        }

        public String getState() {

            return state;
        }

        public void setState(String state) {

            this.state = state;
        }

        public String getZip() {

            return zip;
        }

        public void setZip(String zip) {

            this.zip = zip;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MailingAddress that = (MailingAddress) o;

            if (name != null ? !name.equals(that.name) : that.name != null) return false;
            if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
            if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
            if (city != null ? !city.equals(that.city) : that.city != null) return false;
            if (state != null ? !state.equals(that.state) : that.state != null) return false;
            return zip != null ? zip.equals(that.zip) : that.zip == null;

        }

        @Override
        public int hashCode() {

            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (address1 != null ? address1.hashCode() : 0);
            result = 31 * result + (address2 != null ? address2.hashCode() : 0);
            result = 31 * result + (city != null ? city.hashCode() : 0);
            result = 31 * result + (state != null ? state.hashCode() : 0);
            result = 31 * result + (zip != null ? zip.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {

            return "MailingAddress{" +
                    "name='" + name + '\'' +
                    ", address1='" + address1 + '\'' +
                    ", address2='" + address2 + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip='" + zip + '\'' +
                    '}';
        }
    }

    MailingAddress mailingAddress;

    String creditCardNumber;

    CreditCardType creditCardType;

    String cid;

    public MailingAddress getMailingAddress() {

        return mailingAddress;
    }

    public void setMailingAddress(MailingAddress mailingAddress) {

        this.mailingAddress = mailingAddress;
    }

    public String getCreditCardNumber() {

        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {

        this.creditCardNumber = creditCardNumber;
    }

    public CreditCardType getCreditCardType() {

        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {

        this.creditCardType = creditCardType;
    }

    public String getCid() {

        return cid;
    }

    public void setCid(String cid) {

        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payee payee = (Payee) o;

        if (mailingAddress != null ? !mailingAddress.equals(payee.mailingAddress) : payee.mailingAddress != null)
            return false;
        if (creditCardNumber != null ? !creditCardNumber.equals(payee.creditCardNumber) : payee.creditCardNumber !=
                null)
            return false;
        if (creditCardType != payee.creditCardType) return false;
        return cid != null ? cid.equals(payee.cid) : payee.cid == null;

    }

    @Override
    public int hashCode() {

        int result = mailingAddress != null ? mailingAddress.hashCode() : 0;
        result = 31 * result + (creditCardNumber != null ? creditCardNumber.hashCode() : 0);
        result = 31 * result + (creditCardType != null ? creditCardType.hashCode() : 0);
        result = 31 * result + (cid != null ? cid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Payee{" +
                "mailingAddress=" + mailingAddress +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardType=" + creditCardType +
                ", cid='" + cid + '\'' +
                '}';
    }
}
