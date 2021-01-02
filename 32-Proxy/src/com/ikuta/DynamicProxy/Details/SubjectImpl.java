package com.ikuta.DynamicProxy.Details;

public class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("From SubjectImpl");
    }
}
