package de.vogella.junit.first;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(MyClassTest.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
} 

//You can Also run your tests from via your own code. 
//The org.junit.runner.JUnitCore class provides the runClasses() method 
//which allows you to run one or several tests classes. 
//As a return parameter you receive an object of the type org.junit.runner.Result. 
//This object can be used to retrieve information about the tests. 