CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account IN NUMBER,
  to_account IN NUMBER,
  trans_amount IN NUMBER
) IS
  org_balance NUMBER;
BEGIN
  -- Check balance of source account
  SELECT Balance INTO org_balance
  FROM Accounts
  WHERE AccountID = from_account;

  IF org_balance < trans_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  -- Deduct if org_balance is more than required balance to be transfered
  UPDATE Accounts
  SET Balance = Balance - trans_amount,
      LastModified = SYSDATE
  WHERE AccountID = from_account;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + trans_amount,
      LastModified = SYSDATE
  WHERE AccountID = to_account;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || trans_amount || ' from account ' || from_account || ' to ' || to_account);
END;
/

select * from ACCOUNTS;

BEGIN
    TransferFunds(1, 2, 100);
END;