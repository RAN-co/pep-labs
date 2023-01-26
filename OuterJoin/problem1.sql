SELECT * FROM class LEFT OUTER JOIN student ON class.class_title = student.class_title;
--         * Problem 1: In problem1.sql, use a LEFT OUTER JOIN to combine the class (left side) and student
 --        * (right side) tables using the class_title column as the join on column. This means that when no student
 --        * exists for a class, a row with a NULL student will be in the resulting query.
  --       * Hint: You should start with "SELECT * FROM class"