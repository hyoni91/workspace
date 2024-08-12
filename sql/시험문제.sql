
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
WHERE MEM_NUM = 3;


--  급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 사원번호, 사원명, 급여, 커미션을 조회하는 쿼리문을 작성하세요

SELECT * FROM emp;
SELECT * FROM dept;

SELECT EMPNO, ENAME, SAL, COMM
FROM emp
WHERE SAL <= 500 AND SAL > 300 AND COMM IS NOT NULL; 

-- 사원들 중 이름이 ‘기’로 끝나기나, ‘김’이 들어가는 사원들의 사번, 이름, 입사일을 조회하되, 
-- 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요.

SELECT EMPNO, ENAME, HIREDATE
FROM emp
WHERE ENAME LIKE  '%기'OR '%김%' 
ORDER BY EMPNO DESC; 






