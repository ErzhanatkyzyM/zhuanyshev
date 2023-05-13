package kz.springboot.springbootdemo.services;

public interface TestService {

    String getTestData();
    int getTestDataInt();
    void setTestData(String testData);
    void setTestDataInt(int testDataInt);

    boolean auth(String email, String password);


}
