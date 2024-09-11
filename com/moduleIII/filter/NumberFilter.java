package com.moduleIII.filter;

import com.moduleIII.filter.StringFilter;

public class NumberFilter implements StringFilter {
  public String filter(String input) {
    String newString = "";
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) < '0' || input.charAt(i) > '9') {
        newString += input.charAt(i);
      }
    }
    return newString;
  }
}
