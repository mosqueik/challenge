@search @regression
Feature: Searches

  Scenario Outline: Gifs not found search
    When Empty search Gifs <search_string>
    Examples:
      | search_string                              |
      | ""                                         |
      | "laksjdflasjdklajsflsjalkfjslkdajflasfkjf" |


  Scenario Outline: Gifs search
    When Search Gifs with <search_string>
    Examples:
      | search_string |
      | "funny dog"   |
      | "funny+dog"   |

  Scenario Outline: Stickers search
    When Search Stickers with <search_string>
    Examples:
      | search_string |
      | "funny dog"   |
      | "funny+dog"   |


  Scenario Outline: Stickers not found search
    When Empty search Stickers <search_string>
    Examples:
      | search_string                              |
      | ""                                         |
      | "laksjdflasjdklajsflsjalkfjslkdajflasfkjf" |


  Scenario Outline: Stickers limit test
    When Limit <limit> for Stickers <search_string>
    Examples:
      | limit | search_string |
      | 0     | "funny dog"   |
      | 1     | "funny dog"   |
      | 10000 | "funny dog"   |