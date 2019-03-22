
package serialzeexample;

import java.io.Serializable;

public class Address implements Serializable{
   //if we use transient,this will not be serialized
   //while deserialized, the property value will set to its ndefault value
    
   transient String street;
  //  String street;
    String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", country=" + country + '}';
    }
    
}
