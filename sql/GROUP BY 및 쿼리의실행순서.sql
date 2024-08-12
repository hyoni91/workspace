
-- GROUP BY(그루핑, 그룹별 집계) : data를 특정 기준에 맞추어 그룹화 시킨 결과를 도출할 때 사용
-- 통상적으로 단일행 함수와 함께 사용하는 경우가 많다.
-- 단일행 함수? SUM(), AVG(), MAX(), MIN(), COUNT()와 같이 결과과 한 행이 나오는 것을 일컫는다.


-- 사원 중에서 가장 많은 급여를 조회 / 가장 많은 급여를 받는 사람의 이름과 급여
-- 단일행 데이터의 주의점 : 조회되는 행 개수가 동일해야한다. 
-- 그러므로, 따로따로 조회해야함

SELECT MAX(SAL)
FROM emp;   -- 1000

SELECT ENAME, SAL
FROM emp
WHERE SAL = 1000;  


-- 예제 1) 각 부서별로 가장 많은 급여를 조회

SELECT * FROM emp;
SELECT * FROM dept;

-- GROUP BY는 FROM절 다음 (그룹화 하고싶은 컬럼명을 조회)
-- 단일행 함수와 조회 결과의 행 개수가 다른 컬럼은 사용 불가이지만,
-- GROUP BY절에서는 그루핑한 컬럼은 조회가 가능하다. (GROUP BY 컬럼명)
-- DEPTNO의 10번 그룹, 20번 그룹, 30번 그룹 이렇게 묶여져 있으므로 가능하다.
SELECT  DEPTNO AS 부서번호, MAX(SAL) AS 부서별가장많은급여 , SUM(SAL) AS 부서별총급여
FROM emp  
GROUP BY DEPTNO;


-- 예제 2) 사원인 아닌 사원들 중, 직급 별 급여의 평균을 조회
-- 평균 급여기준 내림차순
SELECT JOB AS 직급 , AVG(SAL) AS 평균급여
FROM emp
WHERE JOB != '사원'
GROUP BY JOB
ORDER BY 평균급여 DESC;


-- 조회 쿼리문의 실행(해석) 순서 

SELECT EMPNO AS 사번, ENAME
FROM emp
WHERE EMPNO > 1003
ORDER BY EMPNO ASC;


-- 예제 3) 직급별로 그루핑한 후, 각 직급별 평균 급여를 조회하되, 평균 급여가 300이상인 직급에 대해서만 조회
-- 정렬은 평균 급여기준 내림차순 기중

-- 그루핑한 후 결정해야하는 조건은 HAVING 절을 사용해야한다.
SELECT JOB, AVG(SAL) AS 평균급여
FROM emp
WHERE JOB != '사원'
GROUP BY JOB
HAVING AVG(SAL) >= 300
ORDER BY 평균급여 DESC;


-- 예제 4) 20번 부서를 제외한 DATA 중, 부서별로 그룹화 한 후 부서번호, 부서별 급여의 합 조회
-- 각 그룹 별 급여의 합이 700이상인 데이터만 조회
-- 조회결과 데이터는 부서별 급여의 합 기준 오름차순 정렬
SELECT DEPTNO, SUM(SAL) AS 급여의합
FROM emp
WHERE DEPTNO != 20
GROUP BY DEPTNO 
HAVING SUM(SAL) >= 700
ORDER BY 급여의합;