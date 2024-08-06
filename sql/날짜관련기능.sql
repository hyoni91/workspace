
-- 날짜에 관한 함수 및 기능



-- NOW([precision]) : 오늘 날짜 및 시간 조회
SELECT NOW();

-- CURRENT_DATE() : 현재 날짜만 조회
SELECT CURRENT_DATE();

-- CURRENT_TIME() : 현재 시간만 조회
SELECT CURRENT_TIME();

-- DATE_FORMAT(date, format[, locale]) : 날짜 조회 시 포맷 지정하기
-- 포맷(형태) YYYY-MM-DD , YYMMDD등등 
-- 대문자 , 소문자 , % , :  
-- mysql 날짜 포맷 검색해~~
SELECT NOW()
		, DATE_FORMAT(NOW(), '%Y-%m-%d') 
		, DATE_FORMAT(NOW(), '%y-%M-%D')   
		, DATE_FORMAT(NOW(), '%Y%m%d') 
		, DATE_FORMAT(NOW(), '%y%m%d') 
		, DATE_FORMAT(NOW(), '%y-%m-%d %H:%i:%s') 
		, DATE_FORMAT(NOW(), '%h:%i:%s');


-- 날짜 및 시간에서 특정 정보 추출

SELECT NOW() -- 2024-08-06 09:29:02
	, YEAR(NOW()) -- 2024 ??
	, MONTH(NOW())  -- 8
	, DAY(NOW()) -- 6
	, HOUR(NOW()) -- 9
	, MINUTE(NOW()) -- 29
	, SECOND(NOW()); -- 2
	

SELECT * FROM emp;

--  2월에 입사한 사원의 사번 이름 입사일 조회  YYYY-MM-DD
SELECT 
EMPNO, ENAME,  DATE_FORMAT(HIREDATE, '%Y-%m-%d') AS HIREDATE
FROM emp
WHERE MONTH(HIREDATE) = 2 ;



-- 다른 방식 (SUBSTRING)
--  2월에 입사한 사원의 사번 이름 입사일 조회  YYYY-MM-DD
SELECT 
EMPNO, ENAME,  DATE_FORMAT(HIREDATE, '%Y-%m-%d') AS HIREDATE
FROM emp
WHERE SUBSTRING(HIREDATE, 6,2) = 02;




-- 날짜 및 시간 연산 


-- ADDDATE(expr,days) : 시간의 더하기 빼기 
SELECT NOW()
	, ADDDATE(NOW(), INTERVAL 10 DAY )
	, ADDDATE(NOW(), INTERVAL -10 DAY )
	, ADDDATE(NOW(), INTERVAL  1 YEAR )
	, ADDDATE(NOW(), INTERVAL  3 MONTH );
	
	
-- PERIOD_DIFF(P1,P2):  MONTH의 차이
-- 주의점 : 매개변수의 형태는 반드시 YYYYMM
SELECT PERIOD_DIFF(202407,202401);	--  6
SELECT PERIOD_DIFF(202507,202707);  --  -24

-- DATEDIFF(expr1,expr2) : DAY의 차이
SELECT DATEDIFF(CURRENT_DATE(),'2020-05-05');   --  -1554



