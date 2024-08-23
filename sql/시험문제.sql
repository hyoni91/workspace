
-- RDBMS 스트림 처리를 위한 SQL 평가 세부 요구사항

-- 회원정보를 관리하는 테이블을 생성하려고 한다. 
-- 이 테이블에서 관리하는 정보로는 회원번호, 아이디, 비밀번호, 회원이름, 나이, 이메일주소가 있다. 
-- 해당 테이블명을 MY_MEMBER라고 했을 때, 테이블 생성 쿼리문을  작성하세요. 
-- 단, 기본키는 회원번호로 하고 나이와 메일주소만 NULL값을 허용한다.

DROP TABLE MY_MEMBER;

CREATE TABLE MY_MEMBER(
	MEM_NUM INT AUTO_INCREMENT PRIMARY KEY
	, MEM_ID VARCHAR(30) NOT NULL
	, MEM_PW VARCHAR(50) NOT NULL
	, MEM_NAME VARCHAR(30) NOT NULL
	, MEM_AGE INT 
	, MEM_MAIL VARCHAR(50)
);

SELECT * FROM MY_MEMBER;

-- 위에서 생성한 MY_MEMBER에 데이터를 삽입하는 쿼리문과 모든 데이터를 삭제하는 쿼리문을 작성하시오. 
-- 삽입되는 내용은 임의로 작성하면 된다.

INSERT INTO MY_MEMBER(
	MEM_ID
	,MEM_PW
	,MEM_NAME
	,MEM_AGE
	,MEM_MAIL	
) VALUES(
	'CHIMY'
	,'chi111'
	,'치밍'
	, 20
	, 'chichi@naver.com'
);

DELETE FROM MY_MEMBER;


-- 위에서 생성한 MY_MEMBER에서 회원번호가 1번인 회원의 이름을 ‘김자바’로, ID는 ‘KIMJAVA’로 수정하는 쿼리문을 작성하세요. 

UPDATE MY_MEMBER SET 
MEM_ID = 'KIMJAVA'
, MEM_NAME = '김자바'
WHERE MEM_NUM = 1;


--  급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 사원번호, 사원명, 급여, 커미션을 조회하는 쿼리문을 작성하세요

SELECT * FROM emp;
SELECT * FROM dept;

SELECT EMPNO, ENAME, SAL, COMM
FROM emp
WHERE COMM IS NOT NULL
AND SAL >= 500 OR SAL > 3000; 

-- 사원들 중 이름이 ‘기’로 끝나기나, ‘김’이 들어가는 사원들의 사번, 이름, 입사일을 조회하되, 
-- 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요.

SELECT EMPNO, ENAME, HIREDATE
FROM emp
WHERE ENAME LIKE  '%기' 
OR ENAME LIKE '%김%'
ORDER BY EMPNO DESC; 



-- 사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 
-- 부서명은 부서번호가 10일 때는 ‘인사부’, 20일 때는 ‘영업부’, 30일 때는 ‘개발부’, 
-- 그 외의 값은 ‘생산부’로 조회되어야 한다. 조인 사용하는 문제 아님. CASE 사용.

SELECT EMPNO
		,ENAME
		,DEPTNO
		,CASE WHEN DEPTNO = 10 THEN '인사부' 
			WHEN DEPTNO = 20 THEN '영업부'
			WHEN DEPTNO = 30 THEN '개발부'
			ELSE '생산부'
			END AS DNAME
FROM emp;



-- 1월에 입사한 모든 사원의 사번, 이름, 입사일, 커미션을 입사일 기준 오름차순으로 조회하는 쿼리문을 작성하세요. 
-- 단, 커미션이 NULL일 경우 커미션은 0으로 조회되어야 한다.

SELECT EMPNO, ENAME, HIREDATE, IFNULL(COMM,0) AS COMM
FROM emp
WHERE MONTH(HIREDATE) = 1
ORDER BY HIREDATE;

-- 부서별로 그룹지어서 부서별 급여의 합과 급여의 평균, 커미션의 평균을 조회하는 쿼리문을 작성하여라. 
-- 단 조회는 부서별 급여의 총합이 큰 순서대로 조회되어야 한다.

SELECT DEPTNO, SUM(SAL) AS 총급여 , AVG(SAL) AS 평균, AVG(COMM) 커미션평균
FROM emp
GROUP BY deptNO
ORDER BY SUM(SAL) DESC;

-- 서브쿼리를 사용하여 부서명이 ‘인사부’인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 
-- 쿼리문을 작성해보자

SELECT E.EMPNO , ENAME, HIREDATE, SAL, E.DEPTNO, DNAME
FROM emp E, dept D
WHERE DNAME = (SELECT DNAME FROM dept WHERE DNAME='인사부');


-- . 조인을 사용하여 부서명이 ‘인사부’가 아니고 급여가 500이상인 
-- 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 작성해보자.
-- 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 오름차순으로 정렬한다

SELECT E.EMPNO, ENAME, HIREDATE, SAL, D.DEPTNO, DNAME
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO
AND D.DNAME != '인사부'
AND SAL >= 500
ORDER BY E.EMPNO DESC ,ENAME ASC;