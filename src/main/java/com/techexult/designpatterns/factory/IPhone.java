package com.techexult.designpatterns.factory;

public class IPhone extends Phone {
	
    protected void createPhone() {
        specifications.add(new IPhoneCamera());
        specifications.add(new IPhonePanel());
        specifications.add(new IPhoneProcessor());
    }
    
}