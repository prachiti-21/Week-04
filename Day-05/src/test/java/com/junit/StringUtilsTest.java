package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
  @Test
    void reverseReturnsaba(){
      StringUtils stringUtils=new StringUtils();
      String revAns=stringUtils.reverse("aba");
      assertEquals("aba",revAns);
  }
  @Test
  void isPalindromeReturnsTrue(){
    StringUtils stringUtils=new StringUtils();
    boolean palAns=stringUtils.isPalindrome("aba");
    assertEquals(true,palAns);

  }
  @Test
  void toUpperCaseReturnsABA(){
    StringUtils stringUtils=new StringUtils();
    String upAns=stringUtils.toUpperCase("aba");
    assertEquals("ABA",upAns);
  }
}