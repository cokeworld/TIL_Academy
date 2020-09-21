SELECT * FROM PROFESSOR;

SELECT DEPTNO
        , NAME
        , DECODE(DEPTNO, '101', 'Computer Engineering')
        FROM PROFESSOR;

SELECT DEPTNO
        , NAME    
        , DECODE(DEPTNO, '101', 'Computer Engineering', '102', 'Mathmatics', '103', 'Tourism', 'ETC') "DNAME"
        FROM PROFESSOR;
        
SELECT DEPTNO
        , NAME
        , DECODE(DEPTNO, 101, DECODE(NAME, 'Audie Murphy', 'BEST!')) "ETC"
        FROM PROFESSOR;

SELECT DEPTNO
        , NAME
        , DECODE(DEPTNO, 101, DECODE(NAME, 'Audie Murphy', 'BEST!', 'GOOD!'), 'N/A') "ETC"
        FROM PROFESSOR;
        
SELECT * FROM STUDENT;

SELECT NAME
        , JUMIN
        , DECODE(SUBSTR(JUMIN, 7, 1), '1', '남자', '2', '여자') "GENDER"
        FROM STUDENT;
        
SELECT NAME
        , TEL
        , DECODE(SUBSTR(TEL, 1, INSTR(TEL, ')', -1)), 
        '02', '서울', '031', '경기도'
        , '051', '부산', '052', '울산'
        , '055', '경남') "지역"
        FROM STUDENT;

SELECT NAME
        , TEL
        , DECODE(SUBSTR(TEL, 1, INSTR(TEL, ')') -1), 
        '02', '서울', '031', '경기도'
        , '051', '부산', '052', '울산'
        , '055', '경남') "지역"
        FROM STUDENT
        WHERE DEPTNO1 = 101;
        
SELECT NAME
        , TEL
        , TEL, CASE
                WHEN SUBSTR(TEL, 1, INSTR(TEL, ')') -1) = '02' THEN '서울'
                WHEN SUBSTR(TEL, 1, INSTR(TEL, ')') -1) = '031' THEN '경기도'
                WHEN SUBSTR(TEL, 1, INSTR(TEL, ')') -1) = '052' THEN '울산'
                WHEN SUBSTR(TEL, 1, INSTR(TEL, ')') -1) = '051' THEN '부산'
                WHEN SUBSTR(TEL, 1, INSTR(TEL, ')') -1) = '055' THEN '경남'
                ELSE 'UNKNOWN'
                END AS 지역
         FROM STUDENT
         WHERE DEPTNO1 = 201;
         
SELECT NAME
        , TEL
        , CASE (SUBSTR(TEL, 1, INSTR(TEL, ')') -1))
                WHEN '02' THEN '서울'
                WHEN '031' THEN '경기도'
                WHEN '052' THEN '울산'
                WHEN '051' THEN '부산'
                WHEN '055' THEN '경남'
                ELSE 'UNKNOWN'
                END AS 지역
         FROM STUDENT
         WHERE DEPTNO1 = 201;
         
SELECT CASE WHEN '1' > '0' THEN 'A'
        ELSE 'B'
        END "AA"
        FROM DUAL;

SELECT * FROM STUDENT;

SELECT NAME
        , SUBSTR(BIRTHDAY, 4,2) "MONTH"
        , CASE 
            WHEN '01' <= (SUBSTR(BIRTHDAY, 4,2)) and SUBSTR(BIRTHDAY, 4,2)<= '03'  THEN '1/4'
            WHEN '04' <= (SUBSTR(BIRTHDAY, 4,2)) and SUBSTR(BIRTHDAY, 4,2)<= '06'  THEN '2/4'
            WHEN '07' <= (SUBSTR(BIRTHDAY, 4,2)) and SUBSTR(BIRTHDAY, 4,2)<= '09'  THEN '3/4'
            WHEN '10' <= (SUBSTR(BIRTHDAY, 4,2)) and SUBSTR(BIRTHDAY, 4,2)<= '12'  THEN '4/4'
            ELSE 'NULL'
        END "분기"
        FROM STUDENT;

SELECT * FROM EMP;
SELECT EMPNO
        , ENAME
        , SAL
        , CASE
            WHEN SAL BETWEEN 1 AND 1000 THEN 'LEVEL 1'
            WHEN SAL BETWEEN 1001 AND 2000 THEN 'LEVEL 2'
            WHEN SAL BETWEEN 2001 AND 3000 THEN 'LEVEL 3'
            WHEN SAL BETWEEN 3001 AND 4000 THEN 'LEVEL 4'
            WHEN SAL > 4000 THEN 'LEVEL 5'
            ELSE 'UNKNOWN'
            END "LEVEL"
        FROM EMP
        ORDER BY SAL DESC;
        
SELECT *
FROM EMP;

SELECT COUNT(*)
        , SUM(COMM)
        , AVG(COMM)
        , AVG(NVL(COMM,0))
FROM EMP;

SELECT ROUND(STDDEV(COMM))
        , ROUND(VARIANCE(COMM), 3)
        , VARIANCE(COMM)
FROM EMP;

SELECT MAX(SAL)
        ,MIN(SAL)
    FROM EMP;

SELECT DEPTNO
        , AVG(NVL(SAL,0)) "A"
    FROM EMP
    GROUP BY DEPTNO
    ORDER BY DEPTNO;
    
SELECT DEPTNO
        , AVG(NVL(SAL,0)) "A"
        , JOB
    FROM EMP
    GROUP BY DEPTNO, JOB
   ORDER BY DEPTNO, A;

SELECT * FROM EMP;

SELECT DEPTNO
     , ROUND(AVG(NVL(SAL, 0)), 2) "AVG"
    FROM EMP
    GROUP BY DEPTNO
    HAVING AVG(NVL(SAL, 0)) >= 2000;

SELECT S.NAME
        ,P.NAME
    FROM STUDENT S, PROFESSOR P;
    WHERE p.profno = S.PROFNO;

SELECT S.NAME
        , D.DNAME
        , P.NAME
    FROM STUDENT S, DEPARTMENT D, PROFESSOR P;



--SELECT S.NAME
--        , D.DNAME
--        , P.NAME
--    FROM STUDENT S, DEPARTMENT D, PROFESSOR P
--    WHERE S.DEPTNO1 = P.DEPTNO;
--    AND 
SELECT * FROM PROFESSOR;
SELECT * FROM STUDENT;
SELECT * FROM DEPARTMENT;

SELECT S.NAME
        , P.NAME
    FROM STUDENT S, PROFESSOR P
    WHERE  S.DEPTNO1 = 101
        AND S.PROFNO = P.PROFNO;
        
SELECT * FROM CUSTOMER;
SELECT * FROM GIFT;

SELECT C.GNAME
        , TO_CHAR(C.POINT, '999,999')
        , G.GNAME
    FROM CUSTOMER C, GIFT G
    WHERE G.G_START <= C.POINT
        AND C.POINT <= G.G_END;
        
SELECT * FROM STUDENT;
SELECT * FROM SCORE;
SELECT * FROM HAKJUM;
SELECT * FROM PROFESSOR;
SELECT ST.NAME
        , SC.TOTAL
        , HA.GRADE
    FROM STUDENT ST, SCORE SC, HAKJUM HA
    WHERE HA.MIN_POINT <= SC.TOTAL
        AND SC.TOTAL <= HA.MAX_POINT
        AND ST.STUDNO = SC.STUDNO
    ORDER BY SC.TOTAL DESC;
    
