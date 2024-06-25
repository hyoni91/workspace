-- 이것은 주석입니다.
-- 하이픈 다음은 무조건 한 칸 띄우기!

-- 1일차 : 데이터 조회 기본 sql(쿼리)

-- [데이터 조회 문법] --
-- 대소문자 구분 없음 (대문자로 적는 것이 관례)
-- SELECT 조회할 열 FROM 테이블명 [WHERE 조건] ;   -> WHERE은 생략 가능


-- EMP테이블의 사번, 이름, 급여 정보를 조회하는 쿼리문 
SELECT EMPNO, ENAME, SAL FROM emp;

-- EMP테이블의 모든 정보를 조회하는 쿼리문 (ALL의 의미 :  에스테니스크 [*])
SELECT * FROM emp;

-- 별칭사용(컬럼명을 조회할 때 임의로 변경 쿼리문) -> AS (이 쿼리문에서만 적용)
SELECT EMPNO AS 사번 FROM emp;

-- 이렇게 사용해도 됨 (AS생략도 가능 /  한 칸 띄어쓰기)
SELECT EMPNO AS 사번 , ENAME 사원명
FROM emp;

-- [조건에 맞는 데이터만 조회]
-- WHERE절 활용

-- 급여가 400 이상인 사원의 사번, 이름, 직급, 급여를 조회
-- 같다 : =  , 다르다 : <> , !=
SELECT EMPNO, ENAME, JOb, SAL 
FROM emp 
WHERE SAL >= 600;


-- 급여가 600이하이며 직급은 사원인 사원들의 사번, 이름, 직급, 급여를 조회하라.
-- 이거나 : OR    그리고 : AND 
-- 문자는 ' ' 로 감싼다.
SELECT EMPNO AS 사원 , ENAME 이름, JOB, SAL
FROM emp
WHERE SAL < 600 AND JOB = '사원';


SELECT * FROM emp;

-- 커미션이 NULL인 사원의 사번, 사번명, 커미션 조회
SELECT EMPNO, ENAME, COMM
FROM emp
WHERE COMM = NULL;


-- NULL의 여부 체크 : IS
SELECT EMPNO, ENAME, COMM
FROM emp
WHERE COMM IS NULL;


-- NULL이 아닌 경우 : IS NOT NULL
SELECT EMPNO, ENAME, COMM
FROM emp
WHERE COMM IS NOT NULL;


-- 직급이 과장이 아닌 사원들 중 커미션을 받는 사원들의 사번, 이름, 직급, 커미션 정보 조회
SELECT EMPNO, ENAME, JOB, COMM
FROM emp
WHERE JOB != '과장' AND COMM IS NOT NULL;

-- 부서번호가 30번이 아닌 사원중 급여가 700이하이고 직급은 사원인 직원의 모든 정보를 조회
SELECT *
FROM emp
WHERE DEPTNO != 30 AND SAL < 700 AND JOB = '사원';


-- 급여가 400이하 이거나 700이상인 사원중 직급이 과장이면서 커미션은 NULL인 직원의 사번, 사원명, 급여, 직급, 커미션 조회 (단 커미션은 인센티브라는 별칭 사용)
SELECT EMPNO, ENAME, SAL, JOB, COMM AS 인센티브
FROM emp
WHERE (SAL < 400 OR SAL >700) 
AND JOB = '과장'
 AND COMM IS NULL
