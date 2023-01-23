package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
  private ArrayList<Student> participants = new ArrayList<>();
  private int credits;

  private String title;
  
  protected ArrayList<Student> getParticipants(){
    return participants;
  }

  public int getCredits(){
    return credits;
  }

  public String getTitle(){
    return title;
  }

  protected void setCredits(int _credits){
    credits = _credits;
  }

  protected void setTitle(String _title){
    title = _title;
  }

  protected ArrayList<Student> addNewParticipant(Student newParticipant){
    participants.add(newParticipant);
    return participants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return title.equals(course.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public String toString() {
    return "Course{" +
            "credits=" + credits +
            ", title='" + title + '\'' +
            '}';
  }
}
