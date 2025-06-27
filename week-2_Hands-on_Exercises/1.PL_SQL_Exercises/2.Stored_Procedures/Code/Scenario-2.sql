CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  department IN VARCHAR2,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE Department = department;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || department);
  SELECT  * from EMPLOYEES;
END;
/

BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/