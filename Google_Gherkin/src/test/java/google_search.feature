Feature:  search
  To allow a customer to search anything on google.com
  
  Scenario: Search anything on google
   Given a website is opened with the name "google.com"
   And I clicked on the search box
   When I type "Google" in the search box
   And click on the search button 
   Then a new Page is opened
   