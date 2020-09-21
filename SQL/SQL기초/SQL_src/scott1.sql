select * from emp;
SELECT E1.EMPNO
     , E1.ENAME
     , E2.MGR
     , E2.ENAME
     FROM EMP E1, EMP E2
     WHERE E1.MGR = E2.EMPNO;