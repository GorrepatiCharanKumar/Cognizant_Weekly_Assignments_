-- Scenario - 1
--Write a PL/SQL block that loops through all customers,
-- checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates
DECLARE
--curently no declarations are required for it
BEGIN
    -- looping through all rows using implicit cursor i.e FOR--LOOP
    FOR customer in (select CUSTOMERID,DOB from CUSTOMERS) LOOP
    if trunc(months_between(sysdate,customer.DOB)/12)>60  THEN
    -- if age is gt 60 we are updating intrest by subtracting 1
    update LOANS
    set INTERESTRATE = INTERESTRATE - 1
    where CUSTOMERID = customer.CUSTOMERID;
    dbms_output.PUT_LINE('Applied discount to cusomer_id : '||customer.CUSTOMERID);
    end if;
    end loop;
    commit;
END;
 -- Scenario -2
 --Checking ISVIP column exist in Customer table or not
 ALTER TABLE Customers ADD IsVIP VARCHAR2(5);
 DECLARE
 BEGIN
    for customer in (select CUSTOMERID,Balance from CUSTOMERS) LOOP
    if customer.balance > 10000 then
    update CUSTOMERS
    set ISVIP = 'true'
    where CUSTOMERID  = customer.CUSTOMERID;
    dbms_output.PUT_LINE('Customer with id '||customer.CUSTOMERID||' is Set as Vip');
    else
    update CUSTOMERS
    set ISVIP = 'false'
    where CUSTOMERID  = customer.CUSTOMERID;
    end if;
    end loop;
    commit;
END;
    --Scenario -3

BEGIN
  -- Loop through all loans ending in next 30 days
    FOR loan_rec IN (
    SELECT l.LoanID, l.CustomerID, l.EndDate, c.Name
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.EndDate <= SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan for customer ' || loan_rec.Name ||
      ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/