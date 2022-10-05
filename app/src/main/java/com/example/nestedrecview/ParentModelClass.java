package com.example.nestedrecview;

import java.util.List;

public class ParentModelClass
{
  String title;
  List<childModelClass>childModelClasses;

  public ParentModelClass(String title, List<childModelClass> childModelClasses) {
    this.title = title;
    this.childModelClasses = childModelClasses;
  }

}
