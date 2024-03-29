--ROUND: 반올림
--TRUNC: 짤라내기
--MOD: 나머지
--CEIL: 정수올림
--FLOOR: 정수만들기
--POWER: 승수

SELECT ROUND(12.345,2)
, ROUND(12.345,1)
, ROUND(12.345,0)
, ROUND(19.345,-1)
, ROUND(189.345,-2)
FROM DUAL;

SELECT TRUNC(987.654, 2)
, TRUNC(987.654, 1)
, TRUNC(987.654, 0)
, TRUNC(987.654, -1)
, TRUNC(987.654, -2)
FROM DUAL;

SELECT MOD(123, 10)
, CEIL(123.45)
, FLOOR(123.45)
, POWER(12,10)
FROM DUAL;