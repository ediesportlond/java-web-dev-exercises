package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
  private String firstName, lastName, subject;
  private int yearsTeaching;
  
    public String getFirstName(){
      return firstName;
    }
  
    public String getLastName(){
      return lastName;
    }
    
    public String getSubject(){
      return subject;
    }
  
    public int getYearsTeaching(){
      return yearsTeaching;
    }

    protected void setFirstName(String _firstName){
      firstName = _firstName;
    }

    protected void setLastName(String _lastName){
      lastName = _lastName;
    }

    protected void setSubject(String _subject){
      subject = _subject;
    }

    protected void getYearsTeaching(int _yearsTeaching){
      yearsTeaching = _yearsTeaching;
    }
  
}
