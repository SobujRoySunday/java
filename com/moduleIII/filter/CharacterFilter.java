package com.moduleIII.filter;

import com.moduleIII.filter.StringFilter;

public class CharacterFilter implements StringFilter {
  private char args[];
  
  public CharacterFilter(String[] args){
    this.args = new char[args.length];
    for (int i = 0;i < args.length;i++) {
      this.args[i] = args[i].charAt(0);
    }
  }

  public String filter(String input) {
    String newString = "";
    for (int i = 0; i < input.length(); i++) {
      boolean remove = false;
      for (char c : this.args) {
        if(input.charAt(i) == c){
          remove = true;
          break;
        }
      }
      if(!remove) newString += input.charAt(i);
    }
    return newString;
  }
}
