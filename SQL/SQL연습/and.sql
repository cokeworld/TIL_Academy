UPDATE PROFESSOR
   SET BONUS = 200
   WHERE POSITION = 'assistant professor';

UPDATE PROFESSOR
    SET EMAIL = 'NYANG@NAVER.COM'
    where deptno = 101;
    

SELECT * FROM PROFESSOR
WHERE POSITION = 'assistant professor';

UPDATE PROFESSOR
SET PAY = PAY*1.15
WHERE POSITION = (SELECT POSITION
                  FROM PROFESSOR
                  WHERE NAME = 'Sharon Stone')
AND PAY < 250;

SELECT * from professor
where position = (SELECT POSITION
                  FROM PROFESSOR
                  WHERE NAME = 'Sharon Stone')
                  ;