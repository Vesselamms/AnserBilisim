Feature: Contacts page

@wtp
  Scenario:Verify Page Title
    Given the user is on the main page
    When the user navigates to "Contact Us"
    Then the user should see the page title as "Contact Us - Anser"

  Scenario:Verify Adress line
    Given user is on the contact us page
    When user should be scroll down and reach the end of the page.
    Then  user should see the addres line as "Anser Information Technologies, Bilkent Cyberpark C 3 Blok No: 4C/Z06, 06800 Çankaya Ankara"