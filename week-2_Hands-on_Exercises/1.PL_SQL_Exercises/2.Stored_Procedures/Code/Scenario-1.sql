CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';

  UPDATE Accounts
  SET LastModified = SYSDATE
  WHERE AccountType = 'Savings';

  DBMS_OUTPUT.PUT_LINE('Interest applied to all savings accounts.');
END;
/

SELECT * from ACCOUNTS;

BEGIN
    ProcessMonthlyInterest();
END;
SELECT * from ACCOUNTS;