# new feature
# Tags: optional

Feature: A description

  Rule: the user is already on the webdriver page
    Background: the user go on selenium site and go to webdriver page
      Given An user on the selenium website "https://selenium.dev"
      When he click on the driver button
      Then  hen arrice on the webdriver page

    @dem
    Scenario: A scenario
      When  he click on tje getting started link
      Then he arrive on tje getting started page
      When he click on the download nav link
      Then he arrive on the download page
      And he verifies the content title is equal to "Downloads"