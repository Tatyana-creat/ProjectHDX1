Feature: List of parameters

  As a user
  I should  be able to see a list under parameters

  Scenario: List of parameters
    Given user see all  parameters
 | CD4+ T CELLS          |
 | CD8+ T CELLS          |
 |CD3+CD69+ T CELLS      |
 |CD4+CD69+ T CELLS      |
 | CD8+CD69+ T CELLS     |
 | CD3+HLA-DR+           |
 | CD4+HLA-DR+           |
 | CD8+HLA-DR+           |
 | CD3+CD25+ T CELLS     |
 | CD4+CD25+ T CELL      |
 | CD8+CD25+ T CELLS     |
 | CD3+CD25+CD69+ T CELLS|
 | CD4+CD25+CD69+ T CELLS|
 | CD8+CD25+CD69+ T CELLS|
 | CD3+CD25+HLA-DR+      |
 |CD4+CD25+HLA-DR+       |
 | CD8+CD25+HLA-DR+      |
 |CD3+ T CELLS           |
 | CD19+ B CELLS         |
 | CD3-CD16+CD56+ NK CELLS|
 | MONOCYTES              |
 | CD45+_WBC              |
 | CD3+Ki67+              |
 | CD4+Ki67+              |
 | CD8+Ki67+              |
 | CD25+Ki67+             |
 | CD4+CD25+Ki67+         |
 | CD8+CD25+Ki67+         |
 | CD14+ MONOCYTES        |
 | PDL1+ MONOCYTES        |
 | CD3+CD57+ T CELLS      |
 | CD4+CD57+ T CELLS      |
 | CD8+CD57+ T CELLS      |
    Then user click submit button


 Scenario: List of parameters
  Given user see all  parameters

   | CD8+ T CELLS          |  355 |       |        |
   |CD3+CD69+ T CELLS      |      |       |        |
   |CD4+CD69+ T CELLS      |      |  4.6  |        |
   | CD8+CD69+ T CELLS     |      |       |        |
   | CD3+HLA-DR+           |      |       |  NA    |
   | CD4+HLA-DR+           |      |       |        |
   | CD8+HLA-DR+           |      |       |        |
   | CD3+CD25+ T CELLS     |      |       |        |
   | CD4+CD25+ T CELL      |      |       |        |
   | CD8+CD25+ T CELLS     |      |       |        |
   | CD3+CD25+CD69+ T CELLS|      |       |        |
   | CD8+CD25+CD69+ T CELLS|      |       |        |
   | CD3+CD25+HLA-DR+      |      |       |        |
   |CD4+CD25+HLA-DR+       |      |       |        |
   |CD3+ T CELLS           |      |       |        |
   | CD19+ B CELLS         |      |       |        |
   | CD3-CD16+CD56+ NK CELLS|     |       |        |
   | MONOCYTES              |     |       |        |
   | CD45+_WBC              |     |       |        |
   | CD3+Ki67+              |     |       |        |
   | CD4+Ki67+              |     |       |        |
   | CD8+Ki67+              |     |       |        |
   | CD25+Ki67+             |     |       |        |
   | CD4+CD25+Ki67+         |     |       |        |
   | CD8+CD25+Ki67+         |     |       |        |
   | CD14+ MONOCYTES        |     |       |        |
   | PDL1+ MONOCYTES        |     |       |        |
   | CD3+CD57+ T CELLS      |     |       |        |
   | CD4+CD57+ T CELLS      |     |       |        |
   | CD8+CD57+ T CELLS      |     |       |        |

  Then user click submit button