/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;

/**
 *
 * @author TT
 */
public class Profile {
    
    private String name;
    private String fImageAddr; // face image's address
    private File fImage;  // face image stored as a File type
    
    private String birthDate; // MM/DD/YYYY
    private long teleNum; // +1 10 digits number
    private int ssn;  // 4 digit number (might be leading 0)
    private String geoData; // 5 digit zipcode string
    private String geoStreet; // String
    private long bankAccoNum; // 16 digits number
    private String emailAddr; // contain @
    private int faxNum; // 10 digits number
    private int mrn; // 7 digits number
    private String vehicleId; // 17 char
    private String linkedin; //tele or email
    private String internetProtAddr; // xxx.xxx.xxx.xxx

    private String hpbn;
    private String certiNum; 
    
    //
    
      
    
    
    
    
     
    
//    private String deviceId;
    
    
//    private String bioId;
    // and image
    



    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getfImageAddr() {
        return fImageAddr;
    }

    public void setfImageAddr(String fImageAddr) {
        this.fImageAddr = fImageAddr;
    }

    public File getfImage() {
        return fImage;
    }

    public void setfImage(File fImage) {
        this.fImage = fImage;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(long teleNum) {
        this.teleNum = teleNum;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getGeoData() {
        return geoData;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

    public String getGeoStreet() {
        return geoStreet;
    }

    public void setGeoStreet(String geoStreet) {
        this.geoStreet = geoStreet;
    }

    public long getBankAccoNum() {
        return bankAccoNum;
    }

    public void setBankAccoNum(long bankAccoNum) {
        this.bankAccoNum = bankAccoNum;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getInternetProtAddr() {
        return internetProtAddr;
    }

    public void setInternetProtAddr(String internetProtAddr) {
        this.internetProtAddr = internetProtAddr;
    }

    public int getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(int faxNum) {
        this.faxNum = faxNum;
    }

    public int getMrn() {
        return mrn;
    }

    public void setMrn(int mrn) {
        this.mrn = mrn;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getHpbn() {
        return hpbn;
    }

    public void setHpbn(String hpbn) {
        this.hpbn = hpbn;
    }

    public String getCertiNum() {
        return certiNum;
    }

    public void setCertiNum(String certiNum) {
        this.certiNum = certiNum;
    }
    
    
    
    
 

    
    
    
            
    
}
