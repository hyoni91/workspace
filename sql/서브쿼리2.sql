
SELECT * FROM emp ;
SELECT * FROM dept ;


-- DISTINCT : 중복제거
-- 모든 컬럼 앞에 DISTINCT가 붙으면 나열한 모든 컬럼에 대해 중복을 제거 
SELECT DISTINCT DEPTNO, JOB FROM emp; 
SELECT DEPTNO, JOB FROM emp;

-- UNION ALL , UNION : 2개 이상의 SELECT를 동시 진행
SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '사원'
UNION ALL
SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '과장';

-- 각각의 조회문의 컬럼명은 달라도 쿼리 실행에 영향을 미치지 않는다.
-- 컬럼명은 달라도 되지만, 오라클에서는 컬럼의 자료형이 다르면 오류가 발생한다.
-- 상위SQL문과 하위SQL문의 컬럼 개수가 동일해야 합니다
-- 상위SQL문과 하위SQL문의 컬럼 위치가 동일한 컬럼들이 결합이 됩니다
-- 컬럼 이름만 동일하다고 결합이 되지 않습니다. 
-- 컬럼명은 최상위 SQL문의 명칭을 따르게 됩니다.	

-- 차이점 :  UNION 은 중복되는 row 를 제거한다.
-- UNION ALL 은 중복제거를 하지 않는다.
SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '사원'
UNION ALL
SELECT EMPNO, SAL, JOB FROM emp WHERE JOB = '과장';



-- 모든 사원 급여의 평균 보다 급여가 높은 사원의 사번 이름 급여를 조회
SELECT EMPNO,ENAME, SAL
FROM emp
WHERE (SELECT AVG(SAL) FROM emp) < SAL;

-- 평균 급여 
SELECT AVG(SAL) 
FROM emp;


-- 서브쿼리 주의점

SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL IN (SELECT SAL FROM emp 
					WHERE SAL > 500);
					


-- ALL / ANY

-- ALL : 					
SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL >= ALL (SELECT SAL FROM emp 
					WHERE SAL > 500);
					
-- 해석
SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL >= ALL (SELECT MAX(SAL) FROM emp 
					WHERE SAL > 500);
					


-- ANY :					
SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL > ANY (SELECT SAL FROM emp 
					WHERE SAL > 500);
					
					
-- 해석
SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL >  (SELECT MIN(SAL) FROM emp 
					WHERE SAL > 500);



-- 서브쿼리 사용
-- WHERE 절에 서브쿼리가 있고
-- WHERE 절에 비교 연산이 '=', '>', '<' 같이 크기 비교 연산이라면
-- 서브쿼리의 조회 결과 행은 반드시 하나이어야 한다.


SELECT DEPTNO, DNAME
FROM dept
WHERE EXISTS (SELECT * 
					FROM EMP
					WHERE DEPTNO = dept.DEPTNO);  -- 조회 : 10 부서명 ,20 부서명, 30 부서명


SELECT DISTINCT DEPTNO FROM emp; -- 조회 : 10,20,30
SELECT DISTINCT DEPTNO FROM dept; -- 조회 : 10,20,30,40